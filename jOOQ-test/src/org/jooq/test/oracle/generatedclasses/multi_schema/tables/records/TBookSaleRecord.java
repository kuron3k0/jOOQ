/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_SALE", schema = "MULTI_SCHEMA")
public class TBookSaleRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Date, java.math.BigDecimal> {

	private static final long serialVersionUID = -1044447370;

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	@javax.persistence.Column(name = "BOOK_ID", nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getBookId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false, length = 400)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 400)
	public java.lang.String getBookStoreName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	public void setSoldAt(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	@javax.persistence.Column(name = "SOLD_AT", nullable = false, length = 7)
	@javax.validation.constraints.NotNull
	public java.sql.Date getSoldAt() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	public void setSoldFor(java.math.BigDecimal value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	@javax.persistence.Column(name = "SOLD_FOR", nullable = false, precision = 10, scale = 2)
	@javax.validation.constraints.NotNull
	public java.math.BigDecimal getSoldFor() {
		return (java.math.BigDecimal) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Date, java.math.BigDecimal> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Date, java.math.BigDecimal> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_AT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field5() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_FOR;
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
	public java.lang.Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getSoldAt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value5() {
		return getSoldFor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookSaleRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookSaleRecord value2(java.lang.Integer value) {
		setBookId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookSaleRecord value3(java.lang.String value) {
		setBookStoreName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookSaleRecord value4(java.sql.Date value) {
		setSoldAt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookSaleRecord value5(java.math.BigDecimal value) {
		setSoldFor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBookSaleRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.sql.Date value4, java.math.BigDecimal value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookSaleRecord
	 */
	public TBookSaleRecord() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE);
	}

	/**
	 * Create a detached, initialised TBookSaleRecord
	 */
	public TBookSaleRecord(java.lang.Integer id, java.lang.Integer bookId, java.lang.String bookStoreName, java.sql.Date soldAt, java.math.BigDecimal soldFor) {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE);

		setValue(0, id);
		setValue(1, bookId);
		setValue(2, bookStoreName);
		setValue(3, soldAt);
		setValue(4, soldFor);
	}
}
