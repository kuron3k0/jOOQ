/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema_2.tables;


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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.h2.information_schema_2.InformationSchema;
import org.jooq.meta.h2.information_schema_2.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TABLES</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
     */
    public final TableField<Record, String> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.IS_INSERTABLE_INTO</code>.
     */
    public final TableField<Record, String> IS_INSERTABLE_INTO = createField(DSL.name("IS_INSERTABLE_INTO"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.COMMIT_ACTION</code>.
     */
    public final TableField<Record, String> COMMIT_ACTION = createField(DSL.name("COMMIT_ACTION"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.STORAGE_TYPE</code>.
     */
    public final TableField<Record, String> STORAGE_TYPE = createField(DSL.name("STORAGE_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.REMARKS</code>.
     */
    public final TableField<Record, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.LAST_MODIFICATION</code>.
     */
    public final TableField<Record, Long> LAST_MODIFICATION = createField(DSL.name("LAST_MODIFICATION"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CLASS</code>.
     */
    public final TableField<Record, String> TABLE_CLASS = createField(DSL.name("TABLE_CLASS"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.ROW_COUNT_ESTIMATE</code>.
     */
    public final TableField<Record, Long> ROW_COUNT_ESTIMATE = createField(DSL.name("ROW_COUNT_ESTIMATE"), SQLDataType.BIGINT, this, "");

    private Tables(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Tables(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables() {
        this(DSL.name("TABLES"), null);
    }

    public <O extends Record> Tables(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_TABLES;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA);
    }

    private transient Schemata _schemata;

    /**
     * Get the implicit join path to the
     * <code>INFORMATION_SCHEMA.SCHEMATA</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    private transient Columns _columns;

    /**
     * Get the implicit to-many join path to the
     * <code>INFORMATION_SCHEMA.COLUMNS</code> table
     */
    public Columns columns() {
        if (_columns == null)
            _columns = new Columns(this, null, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_TABLES.getInverseKey());

        return _columns;
    }

    private transient Views _views;

    /**
     * Get the implicit to-many join path to the
     * <code>INFORMATION_SCHEMA.VIEWS</code> table
     */
    public Views views() {
        if (_views == null)
            _views = new Views(this, null, Keys.SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_TABLES.getInverseKey());

        return _views;
    }

    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    @Override
    public Tables as(Table<?> alias) {
        return new Tables(alias.getQualifiedName(), this);
    }
}
