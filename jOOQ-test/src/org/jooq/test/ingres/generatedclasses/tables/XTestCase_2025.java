/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025 extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_2025Record> {

	private static final long serialVersionUID = 944767255;

	/**
	 * The singleton instance of <code>test.x_test_case_2025</code>
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.XTestCase_2025 X_TEST_CASE_2025 = new org.jooq.test.ingres.generatedclasses.tables.XTestCase_2025();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_2025Record> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_2025Record.class;
	}

	/**
	 * The column <code>test.x_test_case_2025.ref_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_2025Record, java.lang.Integer> REF_ID = createField("ref_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), X_TEST_CASE_2025);

	/**
	 * The column <code>test.x_test_case_2025.ref_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_2025Record, java.lang.String> REF_NAME = createField("ref_name", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), X_TEST_CASE_2025);

	/**
	 * No further instances allowed
	 */
	private XTestCase_2025() {
		super("x_test_case_2025", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_2025Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XTestCase_2025Record, ?>>asList(org.jooq.test.ingres.generatedclasses.Keys.FK_X_TEST_CASE_2025_1, org.jooq.test.ingres.generatedclasses.Keys.FK_X_TEST_CASE_2025_2, org.jooq.test.ingres.generatedclasses.Keys.FK_X_TEST_CASE_2025_3);
	}
}
