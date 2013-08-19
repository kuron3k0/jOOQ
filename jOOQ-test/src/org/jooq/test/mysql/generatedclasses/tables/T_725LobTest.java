/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTest extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -1580791940;

	/**
	 * The singleton instance of <code>test.t_725_lob_test</code>
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.mysql.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>test.t_725_lob_test.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_725_LOB_TEST);

	/**
	 * The column <code>test.t_725_lob_test.LOB</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB, T_725_LOB_TEST);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord> getPrimaryKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_725_LOB_TEST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_725_LOB_TEST_PRIMARY);
	}
}
