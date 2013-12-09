/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2845_CASE_sensitivity extends org.jooq.impl.TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity> implements java.lang.Cloneable {

	private static final long serialVersionUID = -374975696;

	/**
	 * The singleton instance of <code>T_2845_CASE_sensitivity</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_2845_CASE_sensitivity T_2845_CASE_sensitivity = new org.jooq.test.oracle3.generatedclasses.tables.T_2845_CASE_sensitivity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity.class;
	}

	/**
	 * The column <code>T_2845_CASE_sensitivity.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity, java.math.BigDecimal> ID = createField("ID", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this);

	/**
	 * The column <code>T_2845_CASE_sensitivity.INSENSITIVE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity, java.math.BigDecimal> INSENSITIVE = createField("INSENSITIVE", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>T_2845_CASE_sensitivity.UPPER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity, java.math.BigDecimal> UPPER = createField("UPPER", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>T_2845_CASE_sensitivity.lower</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity, java.math.BigDecimal> lower = createField("lower", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * The column <code>T_2845_CASE_sensitivity.Mixed</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity, java.math.BigDecimal> Mixed = createField("Mixed", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * Create a <code>T_2845_CASE_sensitivity</code> table reference
	 */
	public T_2845_CASE_sensitivity() {
		super("T_2845_CASE_sensitivity", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_2845_CASE_sensitivity</code> table reference
	 */
	public T_2845_CASE_sensitivity(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_2845_CASE_sensitivity.T_2845_CASE_sensitivity);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_2845_CASE_SENSITIVITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_2845_CASE_sensitivity>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_2845_CASE_SENSITIVITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_2845_CASE_sensitivity as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_2845_CASE_sensitivity(alias);
	}
}
