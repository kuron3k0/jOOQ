/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.T_725LobTestRecord> implements org.jooq.test.firebird.generatedclasses.tables.interfaces.IT_725LobTest {

	private static final long serialVersionUID = -294049317;

	/**
	 * The table column <code>T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID, value);
	}

	/**
	 * The table column <code>T_725_LOB_TEST.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.ID);
	}

	/**
	 * The table column <code>T_725_LOB_TEST.LOB</code>
	 */
	@Override
	public void setLob(byte[] value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB, value);
	}

	/**
	 * The table column <code>T_725_LOB_TEST.LOB</code>
	 */
	@Override
	public byte[] getLob() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST.LOB);
	}

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}
}
