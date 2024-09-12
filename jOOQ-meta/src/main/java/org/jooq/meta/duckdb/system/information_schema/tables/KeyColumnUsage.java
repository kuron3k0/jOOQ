/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.duckdb.system.information_schema.tables;


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
import org.jooq.meta.duckdb.system.information_schema.InformationSchema;
import org.jooq.meta.duckdb.system.information_schema.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class KeyColumnUsage extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>system.information_schema.key_column_usage</code>
     */
    public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>system.information_schema.key_column_usage.constraint_catalog</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("constraint_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>system.information_schema.key_column_usage.constraint_schema</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("constraint_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>system.information_schema.key_column_usage.constraint_name</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("constraint_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>system.information_schema.key_column_usage.table_catalog</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("table_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>system.information_schema.key_column_usage.table_schema</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("table_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>system.information_schema.key_column_usage.table_name</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("table_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>system.information_schema.key_column_usage.column_name</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("column_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>system.information_schema.key_column_usage.ordinal_position</code>.
     */
    public final TableField<Record, Long> ORDINAL_POSITION = createField(DSL.name("ordinal_position"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>system.information_schema.key_column_usage.position_in_unique_constraint</code>.
     */
    public final TableField<Record, Integer> POSITION_IN_UNIQUE_CONSTRAINT = createField(DSL.name("position_in_unique_constraint"), SQLDataType.INTEGER, this, "");

    private KeyColumnUsage(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private KeyColumnUsage(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>system.information_schema.key_column_usage</code>
     * table reference
     */
    public KeyColumnUsage(String alias) {
        this(DSL.name(alias), KEY_COLUMN_USAGE);
    }

    /**
     * Create an aliased <code>system.information_schema.key_column_usage</code>
     * table reference
     */
    public KeyColumnUsage(Name alias) {
        this(alias, KEY_COLUMN_USAGE);
    }

    /**
     * Create a <code>system.information_schema.key_column_usage</code> table
     * reference
     */
    public KeyColumnUsage() {
        this(DSL.name("key_column_usage"), null);
    }

    public <O extends Record> KeyColumnUsage(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, KEY_COLUMN_USAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_SCHEMATA, Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_TABLE_CONSTRAINTS);
    }

    private transient Schemata _schemata;

    /**
     * Get the implicit join path to the
     * <code>system.information_schema.schemata</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    private transient TableConstraints _tableConstraints;

    /**
     * Get the implicit join path to the
     * <code>system.information_schema.table_constraints</code> table.
     */
    public TableConstraints tableConstraints() {
        if (_tableConstraints == null)
            _tableConstraints = new TableConstraints(this, Keys.SYNTHETIC_FK_KEY_COLUMN_USAGE__SYNTHETIC_PK_TABLE_CONSTRAINTS, null);

        return _tableConstraints;
    }

    @Override
    public KeyColumnUsage as(String alias) {
        return new KeyColumnUsage(DSL.name(alias), this);
    }

    @Override
    public KeyColumnUsage as(Name alias) {
        return new KeyColumnUsage(alias, this);
    }

    @Override
    public KeyColumnUsage as(Table<?> alias) {
        return new KeyColumnUsage(alias.getQualifiedName(), this);
    }
}
