/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDates extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord> {

	private static final long serialVersionUID = 204424137;

	/**
	 * The singleton instance of <code>TEST.T_DATES</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TDates T_DATES = new org.jooq.test.oracle.generatedclasses.test.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord.class;
	}

	/**
	 * The column <code>TEST.T_DATES.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.precision(7), this);

	/**
	 * The column <code>TEST.T_DATES.D</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, java.sql.Date> D = createField("D", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>TEST.T_DATES.T</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, java.sql.Timestamp> T = createField("T", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>TEST.T_DATES.TS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("TS", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>TEST.T_DATES.D_INT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("D_INT", org.jooq.impl.SQLDataType.INTEGER.precision(7), this);

	/**
	 * The column <code>TEST.T_DATES.TS_BIGINT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("TS_BIGINT", org.jooq.impl.SQLDataType.BIGINT.precision(18), this);

	/**
	 * The column <code>TEST.T_DATES.I_Y</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, org.jooq.types.YearToMonth> I_Y = createField("I_Y", org.jooq.impl.SQLDataType.INTERVALYEARTOMONTH, this);

	/**
	 * The column <code>TEST.T_DATES.I_D</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord, org.jooq.types.DayToSecond> I_D = createField("I_D", org.jooq.impl.SQLDataType.INTERVALDAYTOSECOND, this);

	/**
	 * Create a <code>TEST.T_DATES</code> table reference
	 */
	public TDates() {
		super("T_DATES", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * Create an aliased <code>TEST.T_DATES</code> table reference
	 */
	public TDates(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.TDates.T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_DATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TDatesRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TDates as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TDates(alias);
	}
}
