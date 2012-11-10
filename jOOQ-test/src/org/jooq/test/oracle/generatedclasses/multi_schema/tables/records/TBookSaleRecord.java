/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_SALE", schema = "MULTI_SCHEMA")
public class TBookSaleRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Date, java.math.BigDecimal> {

	private static final long serialVersionUID = -2065167504;

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_ID</code>. 
	 */
	@javax.persistence.Column(name = "BOOK_ID", nullable = false, precision = 7)
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.BOOK_STORE_NAME</code>. 
	 */
	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false, length = 400)
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	public void setSoldAt(java.sql.Date value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_AT, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_AT</code>. 
	 */
	@javax.persistence.Column(name = "SOLD_AT", nullable = false, length = 7)
	public java.sql.Date getSoldAt() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_AT);
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	public void setSoldFor(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_FOR, value);
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.T_BOOK_SALE.SOLD_FOR</code>. 
	 */
	@javax.persistence.Column(name = "SOLD_FOR", nullable = false, precision = 10, scale = 2)
	public java.math.BigDecimal getSoldFor() {
		return getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_FOR);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a <code>TEST.T_BOOK_TO_BOOK_STORE</code> referenced by this <code>MULTI_SCHEMA.T_BOOK_SALE</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.records.TBookToBookStoreRecord fetchTBookToBookStore() {
		return create()
			.selectFrom(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME)))
			.and(org.jooq.test.oracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID)))
			.fetchOne();
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
		return org.jooq.impl.Factory.row(field1(), field2(), field3(), field4(), field5());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.String, java.sql.Date, java.math.BigDecimal> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3(), value4(), value5());
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

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookSaleRecord
	 */
	public TBookSaleRecord() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE);
	}
}
