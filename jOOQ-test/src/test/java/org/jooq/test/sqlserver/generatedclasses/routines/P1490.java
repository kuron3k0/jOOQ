/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class P1490 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 933608474;

	/**
	 * The parameter <code>dbo.p1490.value</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> VALUE = createParameter("value", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public P1490() {
		super("p1490", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);

		addInParameter(VALUE);
	}

	/**
	 * Set the <code>value</code> parameter IN value to the routine
	 */
	public void setValue(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.routines.P1490.VALUE, value);
	}
}
