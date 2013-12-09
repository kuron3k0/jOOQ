/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DATES")
public class T_DATES extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES> implements java.lang.Cloneable, org.jooq.Record8<java.lang.Integer, java.sql.Date, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_DATES_INTERFACE {

	private static final long serialVersionUID = 1997922254;

	/**
	 * Setter for <code>T_DATES.ID</code>. 
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_DATES.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>T_DATES.D</code>. 
	 */
	@Override
	public void setD(java.sql.Date value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_DATES.D</code>. 
	 */
	@javax.persistence.Column(name = "D", length = 7)
	@Override
	public java.sql.Date getD() {
		return (java.sql.Date) getValue(1);
	}

	/**
	 * Setter for <code>T_DATES.T</code>. 
	 */
	@Override
	public void setT(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_DATES.T</code>. 
	 */
	@javax.persistence.Column(name = "T", length = 11)
	@Override
	public java.sql.Timestamp getT() {
		return (java.sql.Timestamp) getValue(2);
	}

	/**
	 * Setter for <code>T_DATES.TS</code>. 
	 */
	@Override
	public void setTS(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>T_DATES.TS</code>. 
	 */
	@javax.persistence.Column(name = "TS", length = 11)
	@Override
	public java.sql.Timestamp getTS() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>T_DATES.D_INT</code>. 
	 */
	@Override
	public void setD_INT(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>T_DATES.D_INT</code>. 
	 */
	@javax.persistence.Column(name = "D_INT", precision = 7)
	@Override
	public java.lang.Integer getD_INT() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>T_DATES.TS_BIGINT</code>. 
	 */
	@Override
	public void setTS_BIGINT(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>T_DATES.TS_BIGINT</code>. 
	 */
	@javax.persistence.Column(name = "TS_BIGINT", precision = 18)
	@Override
	public java.lang.Long getTS_BIGINT() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>T_DATES.I_Y</code>. 
	 */
	@Override
	public void setI_Y(org.jooq.types.YearToMonth value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>T_DATES.I_Y</code>. 
	 */
	@javax.persistence.Column(name = "I_Y", precision = 2)
	@Override
	public org.jooq.types.YearToMonth getI_Y() {
		return (org.jooq.types.YearToMonth) getValue(6);
	}

	/**
	 * Setter for <code>T_DATES.I_D</code>. 
	 */
	@Override
	public void setI_D(org.jooq.types.DayToSecond value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>T_DATES.I_D</code>. 
	 */
	@javax.persistence.Column(name = "I_D", precision = 2, scale = 6)
	@Override
	public org.jooq.types.DayToSecond getI_D() {
		return (org.jooq.types.DayToSecond) getValue(7);
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
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Date, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.Integer, java.sql.Date, java.sql.Timestamp, java.sql.Timestamp, java.lang.Integer, java.lang.Long, org.jooq.types.YearToMonth, org.jooq.types.DayToSecond> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.TS_BIGINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.YearToMonth> field7() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.I_Y;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.DayToSecond> field8() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.I_D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTS();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getD_INT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getTS_BIGINT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.YearToMonth value7() {
		return getI_Y();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.DayToSecond value8() {
		return getI_D();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES value1(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES value2(java.sql.Date value) {
		setD(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES value3(java.sql.Timestamp value) {
		setT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES value4(java.sql.Timestamp value) {
		setTS(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES value5(java.lang.Integer value) {
		setD_INT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES value6(java.lang.Long value) {
		setTS_BIGINT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES value7(org.jooq.types.YearToMonth value) {
		setI_Y(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES value8(org.jooq.types.DayToSecond value) {
		setI_D(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_DATES values(java.lang.Integer value1, java.sql.Date value2, java.sql.Timestamp value3, java.sql.Timestamp value4, java.lang.Integer value5, java.lang.Long value6, org.jooq.types.YearToMonth value7, org.jooq.types.DayToSecond value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_DATES_INTERFACE from) {
		setID(from.getID());
		setD(from.getD());
		setT(from.getT());
		setTS(from.getTS());
		setD_INT(from.getD_INT());
		setTS_BIGINT(from.getTS_BIGINT());
		setI_Y(from.getI_Y());
		setI_D(from.getI_D());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_DATES_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_DATES
	 */
	public T_DATES() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES);
	}

	/**
	 * Create a detached, initialised T_DATES
	 */
	public T_DATES(java.lang.Integer ID, java.sql.Date D, java.sql.Timestamp T, java.sql.Timestamp TS, java.lang.Integer D_INT, java.lang.Long TS_BIGINT, org.jooq.types.YearToMonth I_Y, org.jooq.types.DayToSecond I_D) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES);

		setValue(0, ID);
		setValue(1, D);
		setValue(2, T);
		setValue(3, TS);
		setValue(4, D_INT);
		setValue(5, TS_BIGINT);
		setValue(6, I_Y);
		setValue(7, I_D);
	}
}
