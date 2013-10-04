/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
import static org.joox.JOOX.$;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.jooq.Constants;

import org.apache.commons.lang3.StringUtils;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;
import org.joox.Context;
import org.joox.Each;
import org.joox.Filter;
import org.joox.Match;

/**
 * XSL transformation utility for HTML pages
 *
 * @author Lukas Eder
 */
public class Transform {

    private static final FopFactory fopFactory   = FopFactory.newInstance();
    private static final String     minorVersion = Constants.MINOR_VERSION;
    private static final String     version      = Constants.FULL_VERSION;
    private static final String     codegenXSDVersion;
    private static final String     exportXSDVersion;
    private static final String     runtimeXSDVersion;
    private static final String     baseDir      = "";

    static {
        File xsdDir = new File("./xsd");
        String[] files = xsdDir.list();

        List<String> codegenXSDVersions = new ArrayList<String>();
        List<String> exportXSDVersions = new ArrayList<String>();
        List<String> runtimeXSDVersions = new ArrayList<String>();

        Pattern p = Pattern.compile("jooq-(\\w+)-(\\d+\\.\\d+\\.\\d+).xsd");

        for (String file : files) {
            Matcher m = p.matcher(file);

            if (m.matches()) {
                if ("codegen".equals(m.group(1))) {
                    codegenXSDVersions.add(m.group(2));
                }
                else if ("export".equals(m.group(1))) {
                    exportXSDVersions.add(m.group(2));
                }
                else if ("runtime".equals(m.group(1))) {
                    runtimeXSDVersions.add(m.group(2));
                }
            }
        }

        codegenXSDVersions.add(version);
        exportXSDVersions.add(version);
        runtimeXSDVersions.add(version);

        Collections.sort(codegenXSDVersions);
        Collections.sort(exportXSDVersions);
        Collections.sort(runtimeXSDVersions);

        codegenXSDVersion = codegenXSDVersions.get(codegenXSDVersions.lastIndexOf(version) - 1);
        exportXSDVersion = exportXSDVersions.get(exportXSDVersions.lastIndexOf(version) - 1);
        runtimeXSDVersion = runtimeXSDVersions.get(runtimeXSDVersions.lastIndexOf(version) - 1);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Transforming manual: " + file("manual.xml"));
        System.out.println();

//        System.out.println("Transforming multi-page manual");
//        System.out.println("------------------------------");
//        multiplePages();
//
//        System.out.println();
//        System.out.println("Transforming single-page manual");
//        System.out.println("-------------------------------");
//        singlePage();

        System.out.println();
        System.out.println("Transforming PDF manual");
        System.out.println("-------------------------------");
        pdf();
    }

    private static String file(String name) {
        if (minorVersion == null || minorVersion.equals("")) {
            return name;
        }

        return name.replaceAll("\\.\\w{3}$", "-" + minorVersion + "$0");
    }

    private static String path(String path) {
        return root() + path;
    }

    private static String root() {
        if (minorVersion == null || minorVersion.equals("")) {
            return "";
        }

        return "doc/" + minorVersion + "/";
    }

    private static String relative(String path) {
        return StringUtils.join(Collections.nCopies(path.split("/").length, ".."), "/") + "/";
    }

    private static void replaceVariables(Match manual) {
        manual.find("content").add(manual.find("title")).each(new Each() {
            @Override
            public void each(Context context) {
                String content = $(context.element()).content();

                // Work around a jOOX bug
                content = content.replaceAll("^<content>((?s:.*))</content>$", "$1");
                boolean changed = false;

                if (content.contains("{jooq-minor-version}")) {
                    content = content.replace("{jooq-minor-version}", minorVersion + ".0");
                    changed = true;
                }

                if (content.contains("{jooq-version}")) {
                    content = content.replace("{jooq-version}", version);
                    changed = true;
                }

                if (content.contains("{max-row-degree}")) {
                    content = content.replace("{max-row-degree}", "" + Constants.MAX_ROW_DEGREE);
                    changed = true;
                }

                if (content.contains("{codegen-xsd-version}")) {
                    content = content.replace("{codegen-xsd-version}", codegenXSDVersion);
                    changed = true;
                }

                if (content.contains("{export-xsd-version}")) {
                    content = content.replace("{export-xsd-version}", exportXSDVersion);
                    changed = true;
                }

                if (content.contains("{runtime-xsd-version}")) {
                    content = content.replace("{runtime-xsd-version}", runtimeXSDVersion);
                    changed = true;
                }

                if (changed) {
                    $(context.element()).content(content);
                }
            }
        });
    }

    public static void multiplePages() throws Exception {
        InputStream isXML = Transform.class.getResourceAsStream(file("manual.xml"));
        InputStream isXSL = Transform.class.getResourceAsStream("html-pages.xsl");

        StreamSource xsl = new StreamSource(isXSL);
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(xsl);

        Match manual = $(isXML);
        replaceVariables(manual);

        List<String> ids = manual.find("section").ids();
        HashSet<String> uniqueIds = new HashSet<String>(ids);

        if (ids.size() != uniqueIds.size()) {
            for (String id : uniqueIds) {
                ids.remove(id);
            }

            throw new Exception("Duplicate section ids found! " + ids);
        }

        int blanks = 0, completed = 0;

        Filter f = new Filter() {
            @Override
            public boolean filter(Context arg0) {
                return Arrays.asList("section", "redirect").contains($(arg0.element()).tag());
            }
        };

        for (Match section : manual.xpath("//section | //redirect").each()) {
            Match sections = section.add(section.parents(f)).reverse();

            String path = path(StringUtils.join(sections.ids(), "/"));
            String relativePath = relative(path);
            String root = root();
            File dir = new File(baseDir + path);
            dir.mkdirs();

            File file = new File(dir, "index.php");
            file.delete();
            FileOutputStream out = new FileOutputStream(file);

            // A redirection section
            if ("redirect".equals(section.tag())) {
                Match redirectSection = manual.xpath("//section[@id='" + section.attr("redirect-to") + "']");
                Match redirectSections = redirectSection.add(redirectSection.parents("section")).reverse();

                String redirectPath = path(StringUtils.join(redirectSections.ids(), "/"));

                PrintWriter o = new PrintWriter(out);
                o.println("<?php header('Location: " + relativePath + redirectPath + "'); ?>");
                o.flush();

                System.out.println("[r] Redirecting  section " + path + " to " + redirectPath);
            }

            // A regular section (without redirection)
            else {
                PrintStream stream = System.out;
                boolean blank = StringUtils.isBlank(section.find("content").text());
                if (blank) {
                    blanks++;
                    stream = System.err;
                }
                else {
                    completed++;
                }

                stream.print("[");
                stream.print(blank ? " " : "x");
                stream.println("] Transforming section " + path);

                Source source = new DOMSource(manual.document());
                Result target = new StreamResult(out);

                transformer.setParameter("sectionID", section.id());
                transformer.setParameter("relativePath", relativePath);
                transformer.setParameter("root", root);
                transformer.transform(source, target);
            }

            out.close();
        }
        System.out.println("    Completed sections : " + completed + " / " + (blanks + completed) + " (" + (100 * completed / (blanks + completed)) + "%)");
    }

    public static void singlePage() throws Exception {
        InputStream isXML = Transform.class.getResourceAsStream(file("manual.xml"));
        InputStream isXSL = Transform.class.getResourceAsStream("html-page.xsl");

        StreamSource xsl = new StreamSource(isXSL);
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(xsl);

        String relativePath = relative(path("manual-single-page"));
        String root = root();
        Match manual = $(isXML);
        replaceVariables(manual);

        File dir = new File(baseDir + path("manual-single-page"));
        dir.mkdirs();

        System.out.println("Transforming manual");
        File file = new File(dir, "index.php");
        file.delete();
        FileOutputStream out = new FileOutputStream(file);

        Source source = new DOMSource(manual.document());
        Result target = new StreamResult(out);

        transformer.setParameter("relativePath", relativePath);
        transformer.setParameter("root", root);
        transformer.transform(source, target);

        out.close();
    }

    public static void pdf() throws Exception {

        // XML -> FO
        // ---------------------------------------------------------------------
        System.out.println("Transforming XML -> FO");
        InputStream isXML = Transform.class.getResourceAsStream(file("manual.xml"));
        InputStream isXSL = Transform.class.getResourceAsStream("pdf.xsl");

        StreamSource xsl = new StreamSource(isXSL);
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(xsl);

        Match manual = $(isXML);
        replaceVariables(manual);
        checkCodeBlockLengths(manual);

        File dir = new File(baseDir + path("manual-pdf"));
        dir.mkdirs();
        FileOutputStream fout = new FileOutputStream(new File(dir, file("jOOQ-manual.fo.xml")));

        Source source = new DOMSource(manual.document());
        Result target = new StreamResult(fout);

        transformer.transform(source, target);
        fout.close();

        // FO -> PDF
        // ---------------------------------------------------------------------
        // See an example about how to do it here:
        // http://svn.apache.org/viewvc/xmlgraphics/fop/trunk/examples/embedding/java/embedding/ExampleFO2PDF.java?view=markup
        System.out.println("Transforming FO -> PDF");

        OutputStream out = null;

        fopFactory.setUserConfig(new File(Transform.class.getResource("/fop.config.xml").toURI()));
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();
        // configure foUserAgent as desired

        // Setup output stream.  Note: Using BufferedOutputStream
        // for performance reasons (helpful with FileOutputStreams).
        File file = new File(dir, file("jOOQ-manual.pdf"));
        out = new FileOutputStream(file);
        out = new BufferedOutputStream(out);

        // Construct fop with desired output format
        Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

        // Setup JAXP using identity transformer
        transformer = factory.newTransformer(); // identity transformer

        // Setup input stream
        Source src = new StreamSource(new File(dir, file("jOOQ-manual.fo.xml")));

        // Resulting SAX events (the generated FO) must be piped through to FOP
        Result res = new SAXResult(fop.getDefaultHandler());

        // Start XSLT transformation and FOP processing
        transformer.transform(src, res);

        out.flush();
        out.close();

        // Open the PDF and check it
        Runtime.getRuntime().exec(new String[] {
                "C:\\Program Files (x86)\\Adobe\\Reader 11.0\\Reader\\AcroRd32.exe",
                file.getAbsolutePath() });
    }

    private static void checkCodeBlockLengths(Match manual) {
        manual.xpath("//pre|//java|//sql|//text|//xml|//config").each(new Each() {
            @Override
            public void each(Context context) {
                String content = $(context.element()).content();

                for (String line : content.split("[\\r\\n]")) {
                    if (line.length() > 128) {
                        System.out.println("WARNING: Code block line length exceeds 128 characters : (" + line.length() + ") " + line);
                    }
                }
            }
        });
    }
}
