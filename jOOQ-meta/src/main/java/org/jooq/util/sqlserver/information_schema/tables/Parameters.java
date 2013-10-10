/**
 * This class is generated by jOOQ
 */
package org.jooq.util.sqlserver.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.1.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Parameters extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -246387264;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.PARAMETERS</code>
	 */
	public static final org.jooq.util.sqlserver.information_schema.tables.Parameters PARAMETERS = new org.jooq.util.sqlserver.information_schema.tables.Parameters();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_CATALOG = createField("SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_SCHEMA = createField("SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SPECIFIC_NAME = createField("SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.ORDINAL_POSITION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> ORDINAL_POSITION = createField("ORDINAL_POSITION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_MODE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PARAMETER_MODE = createField("PARAMETER_MODE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.IS_RESULT</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_RESULT = createField("IS_RESULT", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.AS_LOCATOR</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> AS_LOCATOR = createField("AS_LOCATOR", org.jooq.impl.SQLDataType.VARCHAR.length(3), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PARAMETER_NAME = createField("PARAMETER_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.FROM_SQL_SPECIFIC_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FROM_SQL_SPECIFIC_CATALOG = createField("FROM_SQL_SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.FROM_SQL_SPECIFIC_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FROM_SQL_SPECIFIC_SCHEMA = createField("FROM_SQL_SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.FROM_SQL_SPECIFIC_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> FROM_SQL_SPECIFIC_NAME = createField("FROM_SQL_SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.TO_SQL_SPECIFIC_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_CATALOG = createField("TO_SQL_SPECIFIC_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.TO_SQL_SPECIFIC_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_SCHEMA = createField("TO_SQL_SPECIFIC_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.TO_SQL_SPECIFIC_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TO_SQL_SPECIFIC_NAME = createField("TO_SQL_SPECIFIC_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.DATA_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DATA_TYPE = createField("DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_MAXIMUM_LENGTH = createField("CHARACTER_MAXIMUM_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_OCTET_LENGTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> CHARACTER_OCTET_LENGTH = createField("CHARACTER_OCTET_LENGTH", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_CATALOG = createField("CHARACTER_SET_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_SCHEMA = createField("CHARACTER_SET_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CHARACTER_SET_NAME = createField("CHARACTER_SET_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_CATALOG = createField("COLLATION_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_SCHEMA = createField("COLLATION_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLLATION_NAME = createField("COLLATION_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION = createField("NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_PRECISION_RADIX</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_PRECISION_RADIX = createField("NUMERIC_PRECISION_RADIX", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_SCALE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> NUMERIC_SCALE = createField("NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.DATETIME_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DATETIME_PRECISION = createField("DATETIME_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.INTERVAL_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INTERVAL_TYPE = createField("INTERVAL_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.INTERVAL_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> INTERVAL_PRECISION = createField("INTERVAL_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.UDT_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_CATALOG = createField("UDT_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.UDT_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_SCHEMA = createField("UDT_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.UDT_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> UDT_NAME = createField("UDT_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.SCOPE_CATALOG</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_CATALOG = createField("SCOPE_CATALOG", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.SCOPE_SCHEMA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_SCHEMA = createField("SCOPE_SCHEMA", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.SCOPE_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCOPE_NAME = createField("SCOPE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.MAXIMUM_CARDINALITY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> MAXIMUM_CARDINALITY = createField("MAXIMUM_CARDINALITY", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.DTD_IDENTIFIER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DTD_IDENTIFIER = createField("DTD_IDENTIFIER", org.jooq.impl.SQLDataType.VARCHAR.length(128), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_DATA_TYPE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DECLARED_DATA_TYPE = createField("DECLARED_DATA_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(65536), this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_NUMERIC_PRECISION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_PRECISION = createField("DECLARED_NUMERIC_PRECISION", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_NUMERIC_SCALE</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> DECLARED_NUMERIC_SCALE = createField("DECLARED_NUMERIC_SCALE", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>INFORMATION_SCHEMA.PARAMETERS</code> table reference
	 */
	public Parameters() {
		super("PARAMETERS", org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.PARAMETERS</code> table reference
	 */
	public Parameters(java.lang.String alias) {
		super(alias, org.jooq.util.sqlserver.information_schema.InformationSchema.INFORMATION_SCHEMA, org.jooq.util.sqlserver.information_schema.tables.Parameters.PARAMETERS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.sqlserver.information_schema.tables.Parameters as(java.lang.String alias) {
		return new org.jooq.util.sqlserver.information_schema.tables.Parameters(alias);
	}
}
