/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages;


import org.jooq.Configuration;
import org.jooq.impl.PackageImpl;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;
import org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P21;
import org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P2______ABC_1;
import org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P2______ABC_2;
import org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P3;
import org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P______ABC_1;
import org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P______ABC_2;
import org.jooq.test.oracle3.generatedclasses.packages.pkg_1358.P______ABC_3;


/**
 * Convenience access to all stored procedures and functions in PKG_1358
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PKG_1358 extends PackageImpl implements Cloneable {

	private static final long serialVersionUID = 1492208190;

	/**
	 * The reference instance of <code>PKG_1358</code>
	 */
	public static final PKG_1358 PKG_1358 = new PKG_1358();

	/**
	 * Call <code>PKG_1358.P</code>
	 */
	public static void call_P______ABC_1(Configuration configuration, String I) {
		P______ABC_1 p = new P______ABC_1();
		p.setI(I);

		p.execute(configuration);
	}

	/**
	 * Call <code>PKG_1358.P</code>
	 */
	public static void call_P______ABC_2(Configuration configuration, String J) {
		P______ABC_2 p = new P______ABC_2();
		p.setJ(J);

		p.execute(configuration);
	}

	/**
	 * Call <code>PKG_1358.P</code>
	 */
	public static void call_P______ABC_3(Configuration configuration, String K) {
		P______ABC_3 p = new P______ABC_3();
		p.setK(K);

		p.execute(configuration);
	}

	/**
	 * Call <code>PKG_1358.P2</code>
	 */
	public static void call_P2______ABC_1(Configuration configuration, String I) {
		P2______ABC_1 p = new P2______ABC_1();
		p.setI(I);

		p.execute(configuration);
	}

	/**
	 * Call <code>PKG_1358.P2</code>
	 */
	public static void call_P2______ABC_2(Configuration configuration, String J) {
		P2______ABC_2 p = new P2______ABC_2();
		p.setJ(J);

		p.execute(configuration);
	}

	/**
	 * Call <code>PKG_1358.P21</code>
	 */
	public static void call_P21(Configuration configuration, String I) {
		P21 p = new P21();
		p.setI(I);

		p.execute(configuration);
	}

	/**
	 * Call <code>PKG_1358.P3</code>
	 */
	public static void call_P3(Configuration configuration, String K) {
		P3 p = new P3();
		p.setK(K);

		p.execute(configuration);
	}

	/**
	 * No further instances allowed
	 */
	private PKG_1358() {
		super("PKG_1358", DefaultSchema.DEFAULT_SCHEMA);
	}
}
