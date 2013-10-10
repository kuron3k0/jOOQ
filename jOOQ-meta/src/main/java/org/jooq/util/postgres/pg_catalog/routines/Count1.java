/**
 * This class is generated by jOOQ
 */
package org.jooq.util.postgres.pg_catalog.routines;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class Count1 extends org.jooq.impl.AbstractRoutine<java.lang.Long> {

	private static final long serialVersionUID = -813185082;

	/**
	 * The parameter <code>pg_catalog.count.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT);

	/**
	 * The parameter <code>pg_catalog.count._1</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Object> _1 = createParameter("_1", org.jooq.impl.SQLDataType.OTHER);

	/**
	 * Create a new routine call instance
	 */
	public Count1() {
		super("count", org.jooq.util.postgres.pg_catalog.PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

		setReturnParameter(RETURN_VALUE);
		addInParameter(_1);
		setOverloaded(true);
	}

	/**
	 * Set the <code>_1</code> parameter IN value to the routine
	 */
	public void set__1(java.lang.Object value) {
		setValue(org.jooq.util.postgres.pg_catalog.routines.Count1._1, value);
	}

	/**
	 * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void set__1(org.jooq.Field<java.lang.Object> field) {
		setField(_1, field);
	}
}
