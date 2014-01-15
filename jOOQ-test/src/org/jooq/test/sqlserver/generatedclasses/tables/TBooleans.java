/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBooleans extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord> {

	private static final long serialVersionUID = -266059690;

	/**
	 * The singleton instance of <code>dbo.t_booleans</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TBooleans T_BOOLEANS = new org.jooq.test.sqlserver.generatedclasses.tables.TBooleans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord.class;
	}

	/**
	 * The column <code>dbo.t_booleans.id</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dbo.t_booleans.one_zero</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_10> ONE_ZERO = createField("one_zero", org.jooq.impl.SQLDataType.INTEGER.asConvertedDataType(new org.jooq.test._.converters.Boolean_10_Converter()), this, "");

	/**
	 * The column <code>dbo.t_booleans.true_false_lc</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_LC> TRUE_FALSE_LC = createField("true_false_lc", org.jooq.impl.SQLDataType.VARCHAR.length(5).asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_LC_Converter()), this, "");

	/**
	 * The column <code>dbo.t_booleans.true_false_uc</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_TF_UC> TRUE_FALSE_UC = createField("true_false_uc", org.jooq.impl.SQLDataType.VARCHAR.length(5).asConvertedDataType(new org.jooq.test._.converters.Boolean_TF_UC_Converter()), this, "");

	/**
	 * The column <code>dbo.t_booleans.yes_no_lc</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_LC> YES_NO_LC = createField("yes_no_lc", org.jooq.impl.SQLDataType.VARCHAR.length(3).asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_LC_Converter()), this, "");

	/**
	 * The column <code>dbo.t_booleans.yes_no_uc</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YES_NO_UC> YES_NO_UC = createField("yes_no_uc", org.jooq.impl.SQLDataType.VARCHAR.length(3).asConvertedDataType(new org.jooq.test._.converters.Boolean_YES_NO_UC_Converter()), this, "");

	/**
	 * The column <code>dbo.t_booleans.y_n_lc</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_LC> Y_N_LC = createField("y_n_lc", org.jooq.impl.SQLDataType.CHAR.length(1).asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_LC_Converter()), this, "");

	/**
	 * The column <code>dbo.t_booleans.y_n_uc</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, org.jooq.test._.converters.Boolean_YN_UC> Y_N_UC = createField("y_n_uc", org.jooq.impl.SQLDataType.CHAR.length(1).asConvertedDataType(new org.jooq.test._.converters.Boolean_YN_UC_Converter()), this, "");

	/**
	 * The column <code>dbo.t_booleans.vc_boolean</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> VC_BOOLEAN = createField("vc_boolean", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * The column <code>dbo.t_booleans.c_boolean</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> C_BOOLEAN = createField("c_boolean", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * The column <code>dbo.t_booleans.n_boolean</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord, java.lang.Boolean> N_BOOLEAN = createField("n_boolean", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * Create a <code>dbo.t_booleans</code> table reference
	 */
	public TBooleans() {
		this("t_booleans", null);
	}

	/**
	 * Create an aliased <code>dbo.t_booleans</code> table reference
	 */
	public TBooleans(java.lang.String alias) {
		this(alias, org.jooq.test.sqlserver.generatedclasses.tables.TBooleans.T_BOOLEANS);
	}

	private TBooleans(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBooleans(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_BOOLEANS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TBooleansRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_BOOLEANS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TBooleans as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TBooleans(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.TBooleans rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TBooleans(name, null);
	}
}
