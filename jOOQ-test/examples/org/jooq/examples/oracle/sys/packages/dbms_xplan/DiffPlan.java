/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
public class DiffPlan extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = -1968584309;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> SQL_TEXT = createParameter("SQL_TEXT", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> OUTLINE = createParameter("OUTLINE", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> USER_NAME = createParameter("USER_NAME", org.jooq.impl.SQLDataType.VARCHAR, true);

	/**
	 * Create a new routine call instance
	 */
	public DiffPlan() {
		super("DIFF_PLAN", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.impl.SQLDataType.VARCHAR);

		setReturnParameter(RETURN_VALUE);
		addInParameter(SQL_TEXT);
		addInParameter(OUTLINE);
		addInParameter(USER_NAME);
	}

	/**
	 * Set the <code>SQL_TEXT</code> parameter to the routine
	 */
	public void setSqlText(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan.SQL_TEXT, value);
	}

	/**
	 * Set the <code>SQL_TEXT</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setSqlText(org.jooq.Field<java.lang.String> field) {
		setField(SQL_TEXT, field);
	}

	/**
	 * Set the <code>OUTLINE</code> parameter to the routine
	 */
	public void setOutline(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan.OUTLINE, value);
	}

	/**
	 * Set the <code>OUTLINE</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setOutline(org.jooq.Field<java.lang.String> field) {
		setField(OUTLINE, field);
	}

	/**
	 * Set the <code>USER_NAME</code> parameter to the routine
	 */
	public void setUserName(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.packages.dbms_xplan.DiffPlan.USER_NAME, value);
	}

	/**
	 * Set the <code>USER_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setUserName(org.jooq.Field<java.lang.String> field) {
		setField(USER_NAME, field);
	}
}
