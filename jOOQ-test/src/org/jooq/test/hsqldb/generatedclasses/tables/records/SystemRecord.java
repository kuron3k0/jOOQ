/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SystemRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.SystemRecord> implements org.jooq.Record1<java.lang.Integer>, org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ISystem {

	private static final long serialVersionUID = 834805773;

	/**
	 * Setter for <code>PUBLIC.SYSTEM.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.SYSTEM.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM.ID;
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
	public SystemRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SystemRecord values(java.lang.Integer value1) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ISystem from) {
		setId(from.getId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ISystem> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SystemRecord
	 */
	public SystemRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM);
	}

	/**
	 * Create a detached, initialised SystemRecord
	 */
	public SystemRecord(java.lang.Integer id) {
		super(org.jooq.test.hsqldb.generatedclasses.tables.System.SYSTEM);

		setValue(0, id);
	}
}
