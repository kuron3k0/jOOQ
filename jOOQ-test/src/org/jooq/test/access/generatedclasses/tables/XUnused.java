/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnused extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = -1790477855;

	/**
	 * The singleton instance of <code>x_unused</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.access.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord.class;
	}

	/**
	 * The column <code>x_unused.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>x_unused.BIG_INTEGER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Double> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * The column <code>x_unused.id_ref</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = createField("id_ref", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.CLASS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.FIELDS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.CONFIGURATION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.U_D_T</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.META_DATA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.TYPE0</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.PRIMARY_KEY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.PRIMARYKEY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>x_unused.name_ref</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = createField("name_ref", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>x_unused.FIELD 737</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord, java.lang.Double> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.DOUBLE, this);

	/**
	 * Create a <code>x_unused</code> table reference
	 */
	public XUnused() {
		super("x_unused", org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>x_unused</code> table reference
	 */
	public XUnused(java.lang.String alias) {
		super(alias, org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.access.generatedclasses.tables.XUnused.X_UNUSED);
	}

	private XUnused(java.lang.String alias, org.jooq.Table<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord> aliased) {
		super(alias, org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord> getPrimaryKey() {
		return org.jooq.test.access.generatedclasses.Keys.PK_X_UNUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.XUnusedRecord>>asList(org.jooq.test.access.generatedclasses.Keys.PK_X_UNUSED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.access.generatedclasses.tables.XUnused as(java.lang.String alias) {
		return new org.jooq.test.access.generatedclasses.tables.XUnused(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.access.generatedclasses.tables.XUnused rename(java.lang.String name) {
		return new org.jooq.test.access.generatedclasses.tables.XUnused(name, null);
	}
}
