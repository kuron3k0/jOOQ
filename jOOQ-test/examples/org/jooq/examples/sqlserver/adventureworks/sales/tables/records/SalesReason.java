/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesReason", schema = "Sales")
public class SalesReason extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesReason> implements org.jooq.Record4<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -904790999;

	/**
	 * Setter for <code>Sales.SalesReason.SalesReasonID</code>. 
	 */
	public void setSalesReasonID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Sales.SalesReason.SalesReasonID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "SalesReasonID", unique = true, nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getSalesReasonID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Sales.SalesReason.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Sales.SalesReason.Name</code>. 
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>Sales.SalesReason.ReasonType</code>. 
	 */
	public void setReasonType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Sales.SalesReason.ReasonType</code>. 
	 */
	@javax.persistence.Column(name = "ReasonType", nullable = false, length = 50)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getReasonType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>Sales.SalesReason.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Sales.SalesReason.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Timestamp getModifiedDate() {
		return (java.sql.Timestamp) getValue(3);
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
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.SalesReasonID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.Name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.ReasonType;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getSalesReasonID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getReasonType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getModifiedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesReason value1(java.lang.Integer value) {
		setSalesReasonID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesReason value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesReason value3(java.lang.String value) {
		setReasonType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesReason value4(java.sql.Timestamp value) {
		setModifiedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SalesReason values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.sql.Timestamp value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SalesReason
	 */
	public SalesReason() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason);
	}

	/**
	 * Create a detached, initialised SalesReason
	 */
	public SalesReason(java.lang.Integer SalesReasonID, java.lang.String Name, java.lang.String ReasonType, java.sql.Timestamp ModifiedDate) {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesReason.SalesReason);

		setValue(0, SalesReasonID);
		setValue(1, Name);
		setValue(2, ReasonType);
		setValue(3, ModifiedDate);
	}
}
