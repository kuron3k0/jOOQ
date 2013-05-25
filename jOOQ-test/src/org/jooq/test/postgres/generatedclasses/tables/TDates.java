/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDates extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = -223772147;

	/**
	 * The singleton instance of <code>public.t_dates</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TDates T_DATES = new org.jooq.test.postgres.generatedclasses.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord.class;
	}

	/**
	 * The column <code>public.t_dates.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_dates.d</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord, java.sql.Date> D = createField("d", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>public.t_dates.t</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord, java.sql.Time> T = createField("t", org.jooq.impl.SQLDataType.TIME, this);

	/**
	 * The column <code>public.t_dates.ts</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("ts", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The column <code>public.t_dates.d_int</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("d_int", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_dates.ts_bigint</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("ts_bigint", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>public.t_dates</code> table reference
	 */
	public TDates() {
		super("t_dates", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_dates</code> table reference
	 */
	public TDates(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TDates.T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_DATES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TDatesRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_DATES);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TDates as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TDates(alias);
	}
}
