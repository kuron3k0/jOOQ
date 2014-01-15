/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_64_69 extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = 1925521048;

	/**
	 * The singleton instance of <code>TEST.X_TEST_CASE_64_69</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The column <code>TEST.X_TEST_CASE_64_69.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>TEST.X_TEST_CASE_64_69</code> table reference
	 */
	public XTestCase_64_69() {
		this("X_TEST_CASE_64_69", null);
	}

	/**
	 * Create an aliased <code>TEST.X_TEST_CASE_64_69</code> table reference
	 */
	public XTestCase_64_69(java.lang.String alias) {
		this(alias, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	private XTestCase_64_69(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> aliased) {
		this(alias, aliased, null);
	}

	private XTestCase_64_69(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_64_69;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.FK_X_TEST_CASE_64_69A, org.jooq.test.oracle.generatedclasses.test.Keys.FK_X_TEST_CASE_64_69B);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69 rename(java.lang.String name) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_64_69(name, null);
	}
}
