/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = 798480974;

	/**
	 * The singleton instance of <code>test2.x_test_case_71</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71 X_TEST_CASE_71 = new org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record.class;
	}

	/**
	 * The column <code>test2.x_test_case_71.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>test2.x_test_case_71.TEST_CASE_64_69_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record, java.lang.Integer> TEST_CASE_64_69_ID = createField("TEST_CASE_64_69_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>test2.x_test_case_71</code> table reference
	 */
	public XTestCase_71() {
		super("x_test_case_71", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.x_test_case_71</code> table reference
	 */
	public XTestCase_71(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record> getPrimaryKey() {
		return org.jooq.test.mysql2.generatedclasses.Keys.KEY_X_TEST_CASE_71_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record>>asList(org.jooq.test.mysql2.generatedclasses.Keys.KEY_X_TEST_CASE_71_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_71Record, ?>>asList(org.jooq.test.mysql2.generatedclasses.Keys.FK_X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71 as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.XTestCase_71(alias);
	}
}
