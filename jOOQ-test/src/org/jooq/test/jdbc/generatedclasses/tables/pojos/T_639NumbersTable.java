/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_639NumbersTable implements org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_639NumbersTable {

	private static final long serialVersionUID = -1565466733;

	private java.lang.Integer    id;
	private java.lang.Byte       byte_;
	private java.lang.Short      short_;
	private java.lang.Integer    integer;
	private java.lang.Long       long_;
	private java.lang.Byte       byteDecimal;
	private java.lang.Short      shortDecimal;
	private java.lang.Integer    integerDecimal;
	private java.lang.Long       longDecimal;
	private java.math.BigInteger bigInteger;
	private java.math.BigDecimal bigDecimal;
	private java.lang.Float      float_;
	private java.lang.Double     double_;

	public T_639NumbersTable() {}

	public T_639NumbersTable(
		java.lang.Integer    id,
		java.lang.Byte       byte_,
		java.lang.Short      short_,
		java.lang.Integer    integer,
		java.lang.Long       long_,
		java.lang.Byte       byteDecimal,
		java.lang.Short      shortDecimal,
		java.lang.Integer    integerDecimal,
		java.lang.Long       longDecimal,
		java.math.BigInteger bigInteger,
		java.math.BigDecimal bigDecimal,
		java.lang.Float      float_,
		java.lang.Double     double_
	) {
		this.id = id;
		this.byte_ = byte_;
		this.short_ = short_;
		this.integer = integer;
		this.long_ = long_;
		this.byteDecimal = byteDecimal;
		this.shortDecimal = shortDecimal;
		this.integerDecimal = integerDecimal;
		this.longDecimal = longDecimal;
		this.bigInteger = bigInteger;
		this.bigDecimal = bigDecimal;
		this.float_ = float_;
		this.double_ = double_;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.lang.Byte getByte() {
		return this.byte_;
	}

	@Override
	public void setByte(java.lang.Byte byte_) {
		this.byte_ = byte_;
	}

	@Override
	public java.lang.Short getShort() {
		return this.short_;
	}

	@Override
	public void setShort(java.lang.Short short_) {
		this.short_ = short_;
	}

	@Override
	public java.lang.Integer getInteger() {
		return this.integer;
	}

	@Override
	public void setInteger(java.lang.Integer integer) {
		this.integer = integer;
	}

	@Override
	public java.lang.Long getLong() {
		return this.long_;
	}

	@Override
	public void setLong(java.lang.Long long_) {
		this.long_ = long_;
	}

	@Override
	public java.lang.Byte getByteDecimal() {
		return this.byteDecimal;
	}

	@Override
	public void setByteDecimal(java.lang.Byte byteDecimal) {
		this.byteDecimal = byteDecimal;
	}

	@Override
	public java.lang.Short getShortDecimal() {
		return this.shortDecimal;
	}

	@Override
	public void setShortDecimal(java.lang.Short shortDecimal) {
		this.shortDecimal = shortDecimal;
	}

	@Override
	public java.lang.Integer getIntegerDecimal() {
		return this.integerDecimal;
	}

	@Override
	public void setIntegerDecimal(java.lang.Integer integerDecimal) {
		this.integerDecimal = integerDecimal;
	}

	@Override
	public java.lang.Long getLongDecimal() {
		return this.longDecimal;
	}

	@Override
	public void setLongDecimal(java.lang.Long longDecimal) {
		this.longDecimal = longDecimal;
	}

	@Override
	public java.math.BigInteger getBigInteger() {
		return this.bigInteger;
	}

	@Override
	public void setBigInteger(java.math.BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}

	@Override
	public java.math.BigDecimal getBigDecimal() {
		return this.bigDecimal;
	}

	@Override
	public void setBigDecimal(java.math.BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

	@Override
	public java.lang.Float getFloat() {
		return this.float_;
	}

	@Override
	public void setFloat(java.lang.Float float_) {
		this.float_ = float_;
	}

	@Override
	public java.lang.Double getDouble() {
		return this.double_;
	}

	@Override
	public void setDouble(java.lang.Double double_) {
		this.double_ = double_;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_639NumbersTable from) {
		setId(from.getId());
		setByte(from.getByte());
		setShort(from.getShort());
		setInteger(from.getInteger());
		setLong(from.getLong());
		setByteDecimal(from.getByteDecimal());
		setShortDecimal(from.getShortDecimal());
		setIntegerDecimal(from.getIntegerDecimal());
		setLongDecimal(from.getLongDecimal());
		setBigInteger(from.getBigInteger());
		setBigDecimal(from.getBigDecimal());
		setFloat(from.getFloat());
		setDouble(from.getDouble());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_639NumbersTable> E into(E into) {
		into.from(this);
		return into;
	}
}
