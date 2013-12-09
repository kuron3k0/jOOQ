/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "EmailAddress", schema = "Person", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"BusinessEntityID", "EmailAddressID"})
})
public class EmailAddress extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.EmailAddress> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.String, java.util.UUID, java.sql.Timestamp> {

	private static final long serialVersionUID = -527166076;

	/**
	 * Setter for <code>Person.EmailAddress.BusinessEntityID</code>. 
	 */
	public void setBusinessEntityID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Person.EmailAddress.BusinessEntityID</code>. 
	 */
	@javax.persistence.Column(name = "BusinessEntityID", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getBusinessEntityID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Person.EmailAddress.EmailAddressID</code>. 
	 */
	public void setEmailAddressID(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Person.EmailAddress.EmailAddressID</code>. 
	 */
	@javax.persistence.Column(name = "EmailAddressID", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getEmailAddressID() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>Person.EmailAddress.EmailAddress</code>. 
	 */
	public void setEmailAddress(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Person.EmailAddress.EmailAddress</code>. 
	 */
	@javax.persistence.Column(name = "EmailAddress", length = 50)
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getEmailAddress() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>Person.EmailAddress.rowguid</code>. 
	 */
	public void setrowguid(java.util.UUID value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Person.EmailAddress.rowguid</code>. 
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	@javax.validation.constraints.NotNull
	public java.util.UUID getrowguid() {
		return (java.util.UUID) getValue(3);
	}

	/**
	 * Setter for <code>Person.EmailAddress.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>Person.EmailAddress.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Timestamp getModifiedDate() {
		return (java.sql.Timestamp) getValue(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.String, java.util.UUID, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.String, java.util.UUID, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.EmailAddress.EmailAddress.BusinessEntityID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.EmailAddress.EmailAddress.EmailAddressID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.EmailAddress.EmailAddress.EmailAddress_;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field4() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.EmailAddress.EmailAddress.rowguid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field5() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.EmailAddress.EmailAddress.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getBusinessEntityID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getEmailAddressID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getEmailAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value4() {
		return getrowguid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value5() {
		return getModifiedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailAddress value1(java.lang.Integer value) {
		setBusinessEntityID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailAddress value2(java.lang.Integer value) {
		setEmailAddressID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailAddress value3(java.lang.String value) {
		setEmailAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailAddress value4(java.util.UUID value) {
		setrowguid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailAddress value5(java.sql.Timestamp value) {
		setModifiedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EmailAddress values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.util.UUID value4, java.sql.Timestamp value5) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EmailAddress
	 */
	public EmailAddress() {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.EmailAddress.EmailAddress);
	}

	/**
	 * Create a detached, initialised EmailAddress
	 */
	public EmailAddress(java.lang.Integer BusinessEntityID, java.lang.Integer EmailAddressID, java.lang.String EmailAddress, java.util.UUID rowguid, java.sql.Timestamp ModifiedDate) {
		super(org.jooq.examples.sqlserver.adventureworks.person.tables.EmailAddress.EmailAddress);

		setValue(0, BusinessEntityID);
		setValue(1, EmailAddressID);
		setValue(2, EmailAddress);
		setValue(3, rowguid);
		setValue(4, ModifiedDate);
	}
}
