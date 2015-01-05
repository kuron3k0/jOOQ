/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.pkg_1358;


import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;
import org.jooq.test.oracle3.generatedclasses.packages.PKG_1358;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class P______ABC_3 extends AbstractRoutine<java.lang.Void> implements Cloneable {

	private static final long serialVersionUID = 1396221132;

	/**
	 * The parameter <code>PKG_1358.P.K</code>.
	 */
	public static final Parameter<String> K = createParameter("K", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public P______ABC_3() {
		super("P", DefaultSchema.DEFAULT_SCHEMA, PKG_1358.PKG_1358);

		addInParameter(K);
		setOverloaded(true);
	}

	/**
	 * Set the <code>K</code> parameter IN value to the routine
	 */
	public void setK(String value) {
		setValue(K, value);
	}
}
