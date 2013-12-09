/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDatesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord> implements org.jooq.Record6<java.lang.Integer, java.sql.Date, java.sql.Time, java.sql.Timestamp, java.lang.Integer, java.lang.Long>, org.jooq.test.postgres.generatedclasses.tables.interfaces.ITDates {

	private static final long serialVersionUID = -1218304111;

	/**
	 * Setter for <code>public.t_dates.id</code>. 
	 */
	public TDatesRecord setId(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_dates.id</code>. 
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_dates.d</code>. 
	 */
	public TDatesRecord setD(java.sql.Date value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_dates.d</code>. 
	 */
	@Override
	public java.sql.Date getD() {
		return (java.sql.Date) getValue(1);
	}

	/**
	 * Setter for <code>public.t_dates.t</code>. 
	 */
	public TDatesRecord setT(java.sql.Time value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_dates.t</code>. 
	 */
	@Override
	public java.sql.Time getT() {
		return (java.sql.Time) getValue(2);
	}

	/**
	 * Setter for <code>public.t_dates.ts</code>. 
	 */
	public TDatesRecord setTs(java.sql.Timestamp value) {
		setValue(3, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_dates.ts</code>. 
	 */
	@Override
	public java.sql.Timestamp getTs() {
		return (java.sql.Timestamp) getValue(3);
	}

	/**
	 * Setter for <code>public.t_dates.d_int</code>. 
	 */
	public TDatesRecord setDInt(java.lang.Integer value) {
		setValue(4, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_dates.d_int</code>. 
	 */
	@Override
	public java.lang.Integer getDInt() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>public.t_dates.ts_bigint</code>. 
	 */
	public TDatesRecord setTsBigint(java.lang.Long value) {
		setValue(5, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_dates.ts_bigint</code>. 
	 */
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
		return org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES.D;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Time> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES.T;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field4() {
		return org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES.TS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES.D_INT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES.TS_BIGINT;
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
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDatesRecord
	 */
	public TDatesRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES);
	}

	/**
	 * Create a detached, initialised TDatesRecord
	 */
	public TDatesRecord(java.lang.Integer id, java.sql.Date d, java.sql.Time t, java.sql.Timestamp ts, java.lang.Integer dInt, java.lang.Long tsBigint) {
		super(org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES);

		setValue(0, id);
		setValue(1, d);
		setValue(2, t);
		setValue(3, ts);
		setValue(4, dInt);
		setValue(5, tsBigint);
	}
}
