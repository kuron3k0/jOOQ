/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class X_TEST_CASE_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85> implements java.lang.Cloneable {

	private static final long serialVersionUID = 649546235;

	/**
	 * The singleton instance of <code>X_TEST_CASE_85</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85 X_TEST_CASE_85 = new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85.class;
	}

	/**
	 * The column <code>X_TEST_CASE_85.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_TEST_CASE_85.X_UNUSED_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85, java.lang.Integer> X_UNUSED_ID = createField("X_UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_TEST_CASE_85.X_UNUSED_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85, java.lang.String> X_UNUSED_NAME = createField("X_UNUSED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * Create a <code>X_TEST_CASE_85</code> table reference
	 */
	public X_TEST_CASE_85() {
		super("X_TEST_CASE_85", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>X_TEST_CASE_85</code> table reference
	 */
	public X_TEST_CASE_85(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85.X_TEST_CASE_85);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_85;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_85);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_85, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_X_TEST_CASE_85);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85 as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_85(alias);
	}
}
