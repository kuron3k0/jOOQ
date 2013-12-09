/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.h2.matchers.tables.records.TArraysRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Object[], java.lang.Object[], java.lang.Object[]>, org.jooq.examples.h2.matchers.tables.interfaces.ITArrays {

	private static final long serialVersionUID = -1040081871;

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.ID</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>. 
	 */
	@Override
	public void setStringArray(java.lang.Object[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>. 
	 */
	@Override
	public java.lang.Object[] getStringArray() {
		return (java.lang.Object[]) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	@Override
	public void setNumberArray(java.lang.Object[] value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	@Override
	public java.lang.Object[] getNumberArray() {
		return (java.lang.Object[]) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>. 
	 */
	@Override
	public void setDateArray(java.lang.Object[] value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>. 
	 */
	@Override
	public java.lang.Object[] getDateArray() {
		return (java.lang.Object[]) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Object[], java.lang.Object[], java.lang.Object[]> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Object[], java.lang.Object[], java.lang.Object[]> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.h2.matchers.tables.TArrays.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object[]> field2() {
		return org.jooq.examples.h2.matchers.tables.TArrays.STRING_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object[]> field3() {
		return org.jooq.examples.h2.matchers.tables.TArrays.NUMBER_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object[]> field4() {
		return org.jooq.examples.h2.matchers.tables.TArrays.DATE_ARRAY;
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
	public java.lang.Object[] value2() {
		return getStringArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object[] value3() {
		return getNumberArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object[] value4() {
		return getDateArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value2(java.lang.Object[] value) {
		setStringArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value3(java.lang.Object[] value) {
		setNumberArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord value4(java.lang.Object[] value) {
		setDateArray(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TArraysRecord values(java.lang.Integer value1, java.lang.Object[] value2, java.lang.Object[] value3, java.lang.Object[] value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.examples.h2.matchers.tables.interfaces.ITArrays from) {
		setId(from.getId());
		setStringArray(from.getStringArray());
		setNumberArray(from.getNumberArray());
		setDateArray(from.getDateArray());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.examples.h2.matchers.tables.interfaces.ITArrays> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.examples.h2.matchers.tables.TArrays.T_ARRAYS);
	}

	/**
	 * Create a detached, initialised TArraysRecord
	 */
	public TArraysRecord(java.lang.Integer id, java.lang.Object[] stringArray, java.lang.Object[] numberArray, java.lang.Object[] dateArray) {
		super(org.jooq.examples.h2.matchers.tables.TArrays.T_ARRAYS);

		setValue(0, id);
		setValue(1, stringArray);
		setValue(2, numberArray);
		setValue(3, dateArray);
	}
}
