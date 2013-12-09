/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DATES")
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.TDatesRecord> implements org.jooq.Record6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long>, org.jooq.test.firebird.generatedclasses.tables.interfaces.ITDates {

	private static final long serialVersionUID = -589471639;

	/**
	 * Setter for <code>T_DATES.ID</code>. 
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_DATES.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, length = 4)
	@javax.validation.constraints.NotNull
	@Override
	public java.lang.Integer getId() {
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
	@javax.persistence.Column(name = "D", length = 4)
	@Override
	public java.sql.Date getD() {
		return (java.sql.Date) getValue(1);
	}

	/**
	 * Setter for <code>T_DATES.T</code>. 
	 */
	@Override
	public void setT(java.sql.Time value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_DATES.T</code>. 
	 */
	@javax.persistence.Column(name = "T", length = 4)
	@Override
	public java.sql.Time getT() {
		return (java.sql.Time) getValue(2);
	}

	/**
	 * Setter for <code>T_DATES.TS</code>. 
	 */
	@Override
	public void setTs(java.sql.Timestamp value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>T_DATES.TS</code>. 
	 */
	@javax.persistence.Column(name = "TS", length = 8)
	@Override
	public java.sql.Timestamp getTs() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>T_DATES.D_INT</code>. 
	 */
	@Override
	public void setDInt(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>T_DATES.D_INT</code>. 
	 */
	@javax.persistence.Column(name = "D_INT", length = 4)
	@Override
	public java.lang.Integer getDInt() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>T_DATES.TS_BIGINT</code>. 
	 */
	@Override
	public void setTsBigint(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>T_DATES.TS_BIGINT</code>. 
	 */
	@javax.persistence.Column(name = "TS_BIGINT", length = 8)
	@Override
	public java.lang.Long getTsBigint() {
		return (java.lang.Long) getValue(5);
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
	public org.jooq.Row6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field3() {
		return org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES.TS_BIGINT;
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
	public java.sql.Date value2() {
		return getD();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Time value3() {
		return getT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value4() {
		return getTs();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getDInt();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getTsBigint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value2(java.sql.Date value) {
		setD(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value3(java.sql.Time value) {
		setT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value4(java.sql.Timestamp value) {
		setTs(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value5(java.lang.Integer value) {
		setDInt(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord value6(java.lang.Long value) {
		setTsBigint(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDatesRecord values(java.lang.Integer value1, java.sql.Date value2, java.sql.Time value3, java.sql.Timestamp value4, java.lang.Integer value5, java.lang.Long value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.firebird.generatedclasses.tables.interfaces.ITDates from) {
		setId(from.getId());
		setD(from.getD());
		setT(from.getT());
		setTs(from.getTs());
		setDInt(from.getDInt());
		setTsBigint(from.getTsBigint());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.firebird.generatedclasses.tables.interfaces.ITDates> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES);
	}

	/**
	 * Create a detached, initialised TDatesRecord
	 */
	public TDatesRecord(java.lang.Integer id, java.sql.Date d, java.sql.Time t, java.sql.Timestamp ts, java.lang.Integer dInt, java.lang.Long tsBigint) {
		super(org.jooq.test.firebird.generatedclasses.tables.TDates.T_DATES);

		setValue(0, id);
		setValue(1, d);
		setValue(2, t);
		setValue(3, ts);
		setValue(4, dInt);
		setValue(5, tsBigint);
	}
}
