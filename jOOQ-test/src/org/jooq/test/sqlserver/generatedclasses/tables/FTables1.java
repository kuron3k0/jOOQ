/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FTables1 extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.FTables1Record> {

	private static final long serialVersionUID = -606034996;

	/**
	 * The singleton instance of <code>dbo.f_tables1</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.FTables1 F_TABLES1 = new org.jooq.test.sqlserver.generatedclasses.tables.FTables1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.FTables1Record> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.FTables1Record.class;
	}

	/**
	 * The column <code>dbo.f_tables1.column_value</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.FTables1Record, java.lang.Integer> COLUMN_VALUE = createField("column_value", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>dbo.f_tables1</code> table reference
	 */
	public FTables1() {
		this("f_tables1", null);
	}

	/**
	 * Create an aliased <code>dbo.f_tables1</code> table reference
	 */
	public FTables1(java.lang.String alias) {
		this(alias, org.jooq.test.sqlserver.generatedclasses.tables.FTables1.F_TABLES1);
	}

	private FTables1(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.FTables1Record> aliased) {
		this(alias, aliased, null);
	}

	private FTables1(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.FTables1Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.FTables1 as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.FTables1(alias, this, parameters);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.FTables1 rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.FTables1(name, null, parameters);
	}

	/**
	 * Call this table-valued function
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.FTables1 call() {
		return new org.jooq.test.sqlserver.generatedclasses.tables.FTables1(getName(), null, new org.jooq.Field[] {  });
	}
}
