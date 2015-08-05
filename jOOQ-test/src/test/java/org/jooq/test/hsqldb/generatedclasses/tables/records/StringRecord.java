/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.String;
import org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IString;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StringRecord extends TableRecordImpl<StringRecord> implements Record2<java.lang.Integer, java.lang.String>, IString {

	private static final long serialVersionUID = -1842555575;

	/**
	 * Setter for <code>PUBLIC.STRING.ID</code>.
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.STRING.ID</code>.
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.STRING.OTHER</code>.
	 */
	@Override
	public void setOther(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.STRING.OTHER</code>.
	 */
	@Override
	public java.lang.String getOther() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<java.lang.Integer> field1() {
		return String.STRING.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<java.lang.String> field2() {
		return String.STRING.OTHER;
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
	public java.lang.String value2() {
		return getOther();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StringRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StringRecord value2(java.lang.String value) {
		setOther(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public StringRecord values(java.lang.Integer value1, java.lang.String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(IString from) {
		setId(from.getId());
		setOther(from.getOther());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends IString> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached StringRecord
	 */
	public StringRecord() {
		super(String.STRING);
	}

	/**
	 * Create a detached, initialised StringRecord
	 */
	public StringRecord(java.lang.Integer id, java.lang.String other) {
		super(String.STRING);

		setValue(0, id);
		setValue(1, other);
	}
}
