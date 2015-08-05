/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.TUnsigned;
import org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITUnsigned;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsignedRecord extends TableRecordImpl<TUnsignedRecord> implements Record4<UByte, UShort, UInteger, ULong>, ITUnsigned {

	private static final long serialVersionUID = -1859214969;

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_BYTE</code>.
	 */
	@Override
	public void setUByte(UByte value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_BYTE</code>.
	 */
	@Override
	public UByte getUByte() {
		return (UByte) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_SHORT</code>.
	 */
	@Override
	public void setUShort(UShort value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_SHORT</code>.
	 */
	@Override
	public UShort getUShort() {
		return (UShort) getValue(1);
	}

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_INT</code>.
	 */
	@Override
	public void setUInt(UInteger value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_INT</code>.
	 */
	@Override
	public UInteger getUInt() {
		return (UInteger) getValue(2);
	}

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_LONG</code>.
	 */
	@Override
	public void setULong(ULong value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_LONG</code>.
	 */
	@Override
	public ULong getULong() {
		return (ULong) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UByte, UShort, UInteger, ULong> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<UByte, UShort, UInteger, ULong> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UByte> field1() {
		return TUnsigned.T_UNSIGNED.U_BYTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UShort> field2() {
		return TUnsigned.T_UNSIGNED.U_SHORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UInteger> field3() {
		return TUnsigned.T_UNSIGNED.U_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<ULong> field4() {
		return TUnsigned.T_UNSIGNED.U_LONG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UByte value1() {
		return getUByte();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UShort value2() {
		return getUShort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UInteger value3() {
		return getUInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ULong value4() {
		return getULong();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TUnsignedRecord value1(UByte value) {
		setUByte(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TUnsignedRecord value2(UShort value) {
		setUShort(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TUnsignedRecord value3(UInteger value) {
		setUInt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TUnsignedRecord value4(ULong value) {
		setULong(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TUnsignedRecord values(UByte value1, UShort value2, UInteger value3, ULong value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(ITUnsigned from) {
		setUByte(from.getUByte());
		setUShort(from.getUShort());
		setUInt(from.getUInt());
		setULong(from.getULong());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends ITUnsigned> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TUnsignedRecord
	 */
	public TUnsignedRecord() {
		super(TUnsigned.T_UNSIGNED);
	}

	/**
	 * Create a detached, initialised TUnsignedRecord
	 */
	public TUnsignedRecord(UByte uByte, UShort uShort, UInteger uInt, ULong uLong) {
		super(TUnsigned.T_UNSIGNED);

		setValue(0, uByte);
		setValue(1, uShort);
		setValue(2, uInt);
		setValue(3, uLong);
	}
}
