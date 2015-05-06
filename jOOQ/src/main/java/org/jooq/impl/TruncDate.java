/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
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
package org.jooq.impl;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.inline;

import java.sql.Date;

import org.jooq.Configuration;
import org.jooq.DatePart;
import org.jooq.Field;
import org.jooq.QueryPart;

/**
 * @author Lukas Eder
 */
class TruncDate<T extends java.util.Date> extends AbstractFunction<T> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -4617792768119885313L;

    private final Field<T>    date;
    private final DatePart    part;

    TruncDate(Field<T> date, DatePart part) {
        super("trunc", date.getDataType());

        this.date = date;
        this.part = part;
    }

    @Override
    final QueryPart getFunction0(Configuration configuration) {
        String keyword = null;
        String format = null;

        switch (configuration.family()) {

            // [http://jira.cubrid.org/browse/ENGINE-120] This currently doesn't work for all date parts in CUBRID
            case CUBRID:
            case HSQLDB: {
                switch (part) {
                    case YEAR:   keyword = "YY"; break;
                    case MONTH:  keyword = "MM"; break;
                    case DAY:    keyword = "DD"; break;
                    case HOUR:   keyword = "HH"; break;
                    case MINUTE: keyword = "MI"; break;
                    case SECOND: keyword = "SS"; break;
                    default: throwUnsupported();
                }

                return field("{trunc}({0}, {1})", getDataType(), date, inline(keyword));
            }

            case H2: {
                switch (part) {
                    case YEAR:   format = "yyyy";                break;
                    case MONTH:  format = "yyyy-MM";             break;
                    case DAY:    format = "yyyy-MM-dd";          break;
                    case HOUR:   format = "yyyy-MM-dd HH";       break;
                    case MINUTE: format = "yyyy-MM-dd HH:mm";    break;
                    case SECOND: format = "yyyy-MM-dd HH:mm:ss"; break;
                    default: throwUnsupported();
                }

                return field("{parsedatetime}({formatdatetime}({0}, {1}), {1})", getDataType(), date, inline(format));
            }

// These don't work yet and need better integration-testing:
// ---------------------------------------------------------
//            case MARIADB:
//            case MYSQL: {
//                switch (part) {
//                    case YEAR:   return field("{str_to_date}({date_format}({0}, '%Y-00-00 00:00:00.0'), '%Y-%m-%d %H:%i:%s.0')", getDataType(), date);
//                    case MONTH:  return field("{str_to_date}({date_format}({0}, '%Y-%m-00 00:00:00.0'), '%Y-%m-%d %H:%i:%s.0')", getDataType(), date);
//                    case DAY:    return field("{str_to_date}({date_format}({0}, '%Y-%m-%d 00:00:00.0'), '%Y-%m-%d %H:%i:%s.0')", getDataType(), date);
//                    case HOUR:   return field("{str_to_date}({date_format}({0}, '%Y-%m-%d %H:00:00.0'), '%Y-%m-%d %H:%i:%s.0')", getDataType(), date);
//                    case MINUTE: return field("{str_to_date}({date_format}({0}, '%Y-%m-%d %H:%i:00.0'), '%Y-%m-%d %H:%i:%s.0')", getDataType(), date);
//                    case SECOND: return field("{str_to_date}({date_format}({0}, '%Y-%m-%d %H:%i:%s.0'), '%Y-%m-%d %H:%i:%s.0')", getDataType(), date);
//                    default: throwUnsupported();
//                }
//            }

            /* [pro] */
            case REDSHIFT:
            /* [/pro] */

            case POSTGRES: {
                switch (part) {
                    case YEAR:   keyword = "year";   break;
                    case MONTH:  keyword = "month";  break;
                    case DAY:    keyword = "day";    break;
                    case HOUR:   keyword = "hour";   break;
                    case MINUTE: keyword = "minute"; break;
                    case SECOND: keyword = "second"; break;
                    default: throwUnsupported();
                }

                return field("{date_trunc}({0}, {1})", getDataType(), inline(keyword), date);
            }

// These don't work yet and need better integration-testing:
// ---------------------------------------------------------
//            case SQLITE: {
//                switch (part) {
//                    case YEAR:   return field("{strftime}({0}, '%Y-00-00 00:00:00.0')", getDataType(), date);
//                    case MONTH:  return field("{strftime}({0}, '%Y-%m-00 00:00:00.0')", getDataType(), date);
//                    case DAY:    return field("{strftime}({0}, '%Y-%m-%d 00:00:00.0')", getDataType(), date);
//                    case HOUR:   return field("{strftime}({0}, '%Y-%m-%d %H:00:00.0')", getDataType(), date);
//                    case MINUTE: return field("{strftime}({0}, '%Y-%m-%d %H:%i:00.0')", getDataType(), date);
//                    case SECOND: return field("{strftime}({0}, '%Y-%m-%d %H:%i:%s.0')", getDataType(), date);
//                    default: throwUnsupported();
//                }
//            }

            /* [pro] */
            case INFORMIX: {
                switch (part) {
                    case YEAR:   keyword = "YEAR";   break;
                    case MONTH:  keyword = "MONTH";  break;
                    case DAY:    keyword = "DD";     break;
                    case HOUR:   keyword = "HH";     break;
                    case MINUTE: keyword = "MI";     break;
                    case SECOND: return field("{cast}({0} {as datetime year to second})", date);
                    default: throwUnsupported();
                }

                return field("{trunc}({0}, {1})", getDataType(), date, inline(keyword));
            }

            case DB2: {
                switch (part) {
                    case YEAR:   keyword = "YYYY";   break;
                    case MONTH:  keyword = "MM";     break;
                    case DAY:    keyword = "DD";     break;
                    case HOUR:   keyword = "HH";     break;
                    case MINUTE: keyword = "MI";     break;
                    case SECOND: keyword = "SS";     break;
                    default: throwUnsupported();
                }

                return field("{trunc}({0}, {1})", getDataType(), date, inline(keyword));
            }

            // In HANA, currently, only DAY parts can be truncated by casting them to DATE
            case HANA: {
                switch (part) {
                    case DAY:
                        return date.cast(Date.class).cast(getDataType());

                    default:
                        return field("{trunc}({0}, {1})", getDataType(), date, inline(part.name()));
                }
            }

            case ORACLE: {
                switch (part) {
                    case YEAR:   keyword = "YYYY";   break;
                    case MONTH:  keyword = "MM";     break;
                    case DAY:    keyword = "DD";     break;
                    case HOUR:   keyword = "HH";     break;
                    case MINUTE: keyword = "MI";     break;
                    case SECOND: return date.cast(Date.class);
                    default: throwUnsupported();
                }

                return field("{trunc}({0}, {1})", getDataType(), date, inline(keyword));
            }

// These don't work yet and need better integration-testing:
// ---------------------------------------------------------
//            case SQLSERVER:
//            case SYBASE: {
//                switch (part) {
//                    case YEAR:   return field("{dateadd}(yy, {datediff}(yy, 0, {0}), 0)", getDataType(), date);
//                    case MONTH:  return field("{dateadd}(mm, {datediff}(mm, 0, {0}), 0)", getDataType(), date);
//                    case DAY:    return field("{dateadd}(dd, {datediff}(dd, 0, {0}), 0)", getDataType(), date);
//                    case HOUR:   return field("{dateadd}(hh, {datediff}(hh, 0, {0}), 0)", getDataType(), date);
//                    case MINUTE: return field("{dateadd}(mi, {datediff}(mi, 0, {0}), 0)", getDataType(), date);
//                    case SECOND: return field("{dateadd}(ss, {datediff}(dd, 0, {0}), 0)", getDataType(), date);
//                    default: throwUnsupported();
//                }
//            }

            /* [/pro] */

            default:
                return field("{trunc}({0}, {1})", getDataType(), date, inline(part.name()));
        }
    }

    private final void throwUnsupported() {
        throw new UnsupportedOperationException("Unknown date part : " + part);
    }
}
