/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.clickhouse.information_schema.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.clickhouse.information_schema.InformationSchema;
import org.jooq.meta.clickhouse.information_schema.Keys;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Columns extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.columns</code>
     */
    public static final Columns COLUMNS = new Columns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.columns.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.column_name</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("column_name"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.ordinal_position</code>.
     */
    public final TableField<Record, ULong> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.columns.column_default</code>.
     */
    public final TableField<Record, String> COLUMN_DEFAULT = createField(DSL.name("column_default"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.is_nullable</code>.
     */
    public final TableField<Record, String> IS_NULLABLE = createField(DSL.name("is_nullable"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.data_type</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column
     * <code>information_schema.columns.character_maximum_length</code>.
     */
    public final TableField<Record, ULong> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.columns.character_octet_length</code>.
     */
    public final TableField<Record, ULong> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.columns.numeric_precision</code>.
     */
    public final TableField<Record, ULong> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column
     * <code>information_schema.columns.numeric_precision_radix</code>.
     */
    public final TableField<Record, ULong> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.columns.numeric_scale</code>.
     */
    public final TableField<Record, ULong> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.columns.datetime_precision</code>.
     */
    public final TableField<Record, ULong> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.columns.character_set_catalog</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.character_set_schema</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.character_set_name</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.collation_catalog</code>.
     */
    public final TableField<Record, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.collation_schema</code>.
     */
    public final TableField<Record, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.collation_name</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("collation_name"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.domain_catalog</code>.
     */
    public final TableField<Record, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.domain_schema</code>.
     */
    public final TableField<Record, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.domain_name</code>.
     */
    public final TableField<Record, String> DOMAIN_NAME = createField(DSL.name("domain_name"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.extra</code>.
     */
    public final TableField<Record, String> EXTRA = createField(DSL.name("extra"), SQLDataType.CHAR.defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.column_comment</code>.
     */
    public final TableField<Record, String> COLUMN_COMMENT = createField(DSL.name("column_comment"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    /**
     * The column <code>information_schema.columns.column_type</code>.
     */
    public final TableField<Record, String> COLUMN_TYPE = createField(DSL.name("column_type"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "");

    private Columns(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Columns(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>information_schema.columns</code> table reference
     */
    public Columns(String alias) {
        this(DSL.name(alias), COLUMNS);
    }

    /**
     * Create an aliased <code>information_schema.columns</code> table reference
     */
    public Columns(Name alias) {
        this(alias, COLUMNS);
    }

    /**
     * Create a <code>information_schema.columns</code> table reference
     */
    public Columns() {
        this(DSL.name("columns"), null);
    }

    public <O extends Record> Columns(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_TABLES, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_SCHEMATA);
    }

    private transient Tables _tables;

    /**
     * Get the implicit join path to the <code>information_schema.tables</code>
     * table.
     */
    public Tables tables() {
        if (_tables == null)
            _tables = new Tables(this, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_TABLES, null);

        return _tables;
    }

    private transient Schemata _schemata;

    /**
     * Get the implicit join path to the
     * <code>information_schema.schemata</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    @Override
    public Columns as(String alias) {
        return new Columns(DSL.name(alias), this);
    }

    @Override
    public Columns as(Name alias) {
        return new Columns(alias, this);
    }

    @Override
    public Columns as(Table<?> alias) {
        return new Columns(alias.getQualifiedName(), this);
    }
}
