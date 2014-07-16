/**
 * This class is generated by jOOQ
 */
package org.jooq.util.firebird.rdb.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rdb$fields extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -145746609;

	/**
	 * The singleton instance of <code>RDB$FIELDS</code>
	 */
	public static final org.jooq.util.firebird.rdb.tables.Rdb$fields RDB$FIELDS = new org.jooq.util.firebird.rdb.tables.Rdb$fields();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>RDB$FIELDS.RDB$FIELD_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$FIELD_NAME = createField("RDB$FIELD_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$QUERY_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$QUERY_NAME = createField("RDB$QUERY_NAME", org.jooq.impl.SQLDataType.CHAR, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$VALIDATION_BLR</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$VALIDATION_BLR = createField("RDB$VALIDATION_BLR", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$VALIDATION_SOURCE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$VALIDATION_SOURCE = createField("RDB$VALIDATION_SOURCE", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$COMPUTED_BLR</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$COMPUTED_BLR = createField("RDB$COMPUTED_BLR", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$COMPUTED_SOURCE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$COMPUTED_SOURCE = createField("RDB$COMPUTED_SOURCE", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$DEFAULT_VALUE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$DEFAULT_VALUE = createField("RDB$DEFAULT_VALUE", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$DEFAULT_SOURCE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DEFAULT_SOURCE = createField("RDB$DEFAULT_SOURCE", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$FIELD_LENGTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_LENGTH = createField("RDB$FIELD_LENGTH", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$FIELD_SCALE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_SCALE = createField("RDB$FIELD_SCALE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$FIELD_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_TYPE = createField("RDB$FIELD_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$FIELD_SUB_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_SUB_TYPE = createField("RDB$FIELD_SUB_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$MISSING_VALUE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, byte[]> RDB$MISSING_VALUE = createField("RDB$MISSING_VALUE", org.jooq.impl.SQLDataType.BLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$MISSING_SOURCE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$MISSING_SOURCE = createField("RDB$MISSING_SOURCE", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$DESCRIPTION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$DESCRIPTION = createField("RDB$DESCRIPTION", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$SYSTEM_FLAG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$SYSTEM_FLAG = createField("RDB$SYSTEM_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$QUERY_HEADER</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$QUERY_HEADER = createField("RDB$QUERY_HEADER", org.jooq.impl.SQLDataType.CLOB, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$SEGMENT_LENGTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$SEGMENT_LENGTH = createField("RDB$SEGMENT_LENGTH", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$EDIT_STRING</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RDB$EDIT_STRING = createField("RDB$EDIT_STRING", org.jooq.impl.SQLDataType.VARCHAR, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$EXTERNAL_LENGTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$EXTERNAL_LENGTH = createField("RDB$EXTERNAL_LENGTH", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$EXTERNAL_SCALE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$EXTERNAL_SCALE = createField("RDB$EXTERNAL_SCALE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$EXTERNAL_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$EXTERNAL_TYPE = createField("RDB$EXTERNAL_TYPE", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$DIMENSIONS</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$DIMENSIONS = createField("RDB$DIMENSIONS", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$NULL_FLAG</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$NULL_FLAG = createField("RDB$NULL_FLAG", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$CHARACTER_LENGTH</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$CHARACTER_LENGTH = createField("RDB$CHARACTER_LENGTH", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$COLLATION_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$COLLATION_ID = createField("RDB$COLLATION_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$CHARACTER_SET_ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$CHARACTER_SET_ID = createField("RDB$CHARACTER_SET_ID", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>RDB$FIELDS.RDB$FIELD_PRECISION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> RDB$FIELD_PRECISION = createField("RDB$FIELD_PRECISION", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * Create a <code>RDB$FIELDS</code> table reference
	 */
	public Rdb$fields() {
		this("RDB$FIELDS", null);
	}

	/**
	 * Create an aliased <code>RDB$FIELDS</code> table reference
	 */
	public Rdb$fields(java.lang.String alias) {
		this(alias, org.jooq.util.firebird.rdb.tables.Rdb$fields.RDB$FIELDS);
	}

	private Rdb$fields(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private Rdb$fields(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.firebird.rdb.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.firebird.rdb.tables.Rdb$fields as(java.lang.String alias) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$fields(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.firebird.rdb.tables.Rdb$fields rename(java.lang.String name) {
		return new org.jooq.util.firebird.rdb.tables.Rdb$fields(name, null);
	}
}
