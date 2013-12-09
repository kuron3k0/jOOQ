/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "ScrapReason", schema = "Production")
public class ScrapReason extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ScrapReason> implements org.jooq.Record3<java.lang.Short, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -354641819;

	/**
	 * Setter for <code>Production.ScrapReason.ScrapReasonID</code>. 
	 */
	public void setScrapReasonID(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Production.ScrapReason.ScrapReasonID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ScrapReasonID", unique = true, nullable = false, precision = 5)
	@javax.validation.constraints.NotNull
	public java.lang.Short getScrapReasonID() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>Production.ScrapReason.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Production.ScrapReason.Name</code>. 
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>Production.ScrapReason.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Production.ScrapReason.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Timestamp getModifiedDate() {
		return (java.sql.Timestamp) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Short> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Short, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.ScrapReasonID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.Name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getScrapReasonID();
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
	public java.sql.Timestamp value3() {
		return getModifiedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScrapReason value1(java.lang.Short value) {
		setScrapReasonID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScrapReason value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScrapReason value3(java.sql.Timestamp value) {
		setModifiedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScrapReason values(java.lang.Short value1, java.lang.String value2, java.sql.Timestamp value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ScrapReason
	 */
	public ScrapReason() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason);
	}

	/**
	 * Create a detached, initialised ScrapReason
	 */
	public ScrapReason(java.lang.Short ScrapReasonID, java.lang.String Name, java.sql.Timestamp ModifiedDate) {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.ScrapReason.ScrapReason);

		setValue(0, ScrapReasonID);
		setValue(1, Name);
		setValue(2, ModifiedDate);
	}
}
