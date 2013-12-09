/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTestRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord> implements org.jooq.Record2<java.lang.Integer, byte[]>, org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_725LobTest {

	private static final long serialVersionUID = -483025270;

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.LOB</code>. 
	 */
	@Override
	public void setLob(byte[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.LOB</code>. 
	 */
	@Override
	public byte[] getLob() {
		return (byte[]) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, byte[]> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<byte[]> field2() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.LOB;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value2() {
		return getLob();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord value2(byte[] value) {
		setLob(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_725LobTestRecord values(java.lang.Integer value1, byte[] value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_725LobTest from) {
		setId(from.getId());
		setLob(from.getLob());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IT_725LobTest> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_725LobTestRecord
	 */
	public T_725LobTestRecord() {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST);
	}

	/**
	 * Create a detached, initialised T_725LobTestRecord
	 */
	public T_725LobTestRecord(java.lang.Integer id, byte[] lob) {
		super(org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST);

		setValue(0, id);
		setValue(1, lob);
	}
}
