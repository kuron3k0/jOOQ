/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_2025 extends org.jooq.impl.TableImpl<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_2025Record> {

	private static final long serialVersionUID = -50215994;

	/**
	 * The singleton instance of <code>TEST.X_TEST_CASE_2025</code>
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.XTestCase_2025 X_TEST_CASE_2025 = new org.jooq.test.derby.generatedclasses.tables.XTestCase_2025();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_2025Record> getRecordType() {
		return org.jooq.test.derby.generatedclasses.tables.records.XTestCase_2025Record.class;
	}

	/**
	 * The column <code>TEST.X_TEST_CASE_2025.REF_ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_2025Record, java.lang.Integer> REF_ID = createField("REF_ID", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_2025);

	/**
	 * The column <code>TEST.X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_2025Record, java.lang.String> REF_NAME = createField("REF_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_TEST_CASE_2025);

	/**
	 * No further instances allowed
	 */
	private XTestCase_2025() {
		super("X_TEST_CASE_2025", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_2025Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.XTestCase_2025Record, ?>>asList(org.jooq.test.derby.generatedclasses.Keys.FK_X_TEST_CASE_2025_3, org.jooq.test.derby.generatedclasses.Keys.FK_X_TEST_CASE_2025_2, org.jooq.test.derby.generatedclasses.Keys.FK_X_TEST_CASE_2025_1);
	}
}
