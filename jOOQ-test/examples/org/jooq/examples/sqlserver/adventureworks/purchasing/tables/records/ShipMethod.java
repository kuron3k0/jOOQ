/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "ShipMethod", schema = "Purchasing")
public class ShipMethod extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.ShipMethod> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.util.UUID, java.sql.Timestamp> {

	private static final long serialVersionUID = 1450633878;

	/**
	 * Setter for <code>Purchasing.ShipMethod.ShipMethodID</code>. 
	 */
	public void setShipMethodID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.ShipMethodID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ShipMethodID", unique = true, nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getShipMethodID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.Name</code>. 
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.ShipBase</code>. 
	 */
	public void setShipBase(java.math.BigDecimal value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.ShipBase</code>. 
	 */
	@javax.persistence.Column(name = "ShipBase", nullable = false, precision = 19, scale = 4)
	@javax.validation.constraints.NotNull
	public java.math.BigDecimal getShipBase() {
		return (java.math.BigDecimal) getValue(2);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.ShipRate</code>. 
	 */
	public void setShipRate(java.math.BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.ShipRate</code>. 
	 */
	@javax.persistence.Column(name = "ShipRate", nullable = false, precision = 19, scale = 4)
	@javax.validation.constraints.NotNull
	public java.math.BigDecimal getShipRate() {
		return (java.math.BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.rowguid</code>. 
	 */
	public void setrowguid(java.util.UUID value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.rowguid</code>. 
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	@javax.validation.constraints.NotNull
	public java.util.UUID getrowguid() {
		return (java.util.UUID) getValue(4);
	}

	/**
	 * Setter for <code>Purchasing.ShipMethod.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>Purchasing.ShipMethod.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Timestamp getModifiedDate() {
		return (java.sql.Timestamp) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.util.UUID, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.util.UUID, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipMethodID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.Name;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field3() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipBase;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ShipRate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field5() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.rowguid;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field6() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod.ModifiedDate;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getShipMethodID();
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
	public java.math.BigDecimal value3() {
		return getShipBase();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getShipRate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value5() {
		return getrowguid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value6() {
		return getModifiedDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShipMethod value1(java.lang.Integer value) {
		setShipMethodID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShipMethod value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShipMethod value3(java.math.BigDecimal value) {
		setShipBase(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShipMethod value4(java.math.BigDecimal value) {
		setShipRate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShipMethod value5(java.util.UUID value) {
		setrowguid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShipMethod value6(java.sql.Timestamp value) {
		setModifiedDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ShipMethod values(java.lang.Integer value1, java.lang.String value2, java.math.BigDecimal value3, java.math.BigDecimal value4, java.util.UUID value5, java.sql.Timestamp value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ShipMethod
	 */
	public ShipMethod() {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod);
	}

	/**
	 * Create a detached, initialised ShipMethod
	 */
	public ShipMethod(java.lang.Integer ShipMethodID, java.lang.String Name, java.math.BigDecimal ShipBase, java.math.BigDecimal ShipRate, java.util.UUID rowguid, java.sql.Timestamp ModifiedDate) {
		super(org.jooq.examples.sqlserver.adventureworks.purchasing.tables.ShipMethod.ShipMethod);

		setValue(0, ShipMethodID);
		setValue(1, Name);
		setValue(2, ShipBase);
		setValue(3, ShipRate);
		setValue(4, rowguid);
		setValue(5, ModifiedDate);
	}
}
