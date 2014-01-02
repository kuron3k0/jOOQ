/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_639NumbersTable extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 488923797;

	/**
	 * The singleton instance of <code>t_639_numbers_table</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.access.generatedclasses.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord.class;
	}

	/**
	 * The column <code>t_639_numbers_table.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>t_639_numbers_table.BYTE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE = createField("BYTE", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>t_639_numbers_table.SHORT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>t_639_numbers_table.INTEGER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>t_639_numbers_table.LONG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>t_639_numbers_table.BYTE_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>t_639_numbers_table.SHORT_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>t_639_numbers_table.INTEGER_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>t_639_numbers_table.LONG_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>t_639_numbers_table.BIG_INTEGER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>t_639_numbers_table.BIG_DECIMAL</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>t_639_numbers_table.FLOAT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Float> FLOAT = createField("FLOAT", org.jooq.impl.SQLDataType.REAL, this);

	/**
	 * The column <code>t_639_numbers_table.DOUBLE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> DOUBLE = createField("DOUBLE", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * Create a <code>t_639_numbers_table</code> table reference
	 */
	public T_639NumbersTable() {
		super("t_639_numbers_table", org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>t_639_numbers_table</code> table reference
	 */
	public T_639NumbersTable(java.lang.String alias) {
		super(alias, org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}

	private T_639NumbersTable(java.lang.String alias, org.jooq.Table<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> aliased) {
		super(alias, org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> getPrimaryKey() {
		return org.jooq.test.access.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.access.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.access.generatedclasses.tables.T_639NumbersTable as(java.lang.String alias) {
		return new org.jooq.test.access.generatedclasses.tables.T_639NumbersTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.access.generatedclasses.tables.T_639NumbersTable rename(java.lang.String name) {
		return new org.jooq.test.access.generatedclasses.tables.T_639NumbersTable(name, null);
	}
}
