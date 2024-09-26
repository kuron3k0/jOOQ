/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema_2.tables;


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
public class Schemata extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SCHEMATA</code>
     */
    public static final Schemata SCHEMATA = new Schemata();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.CATALOG_NAME</code>.
     */
    public final TableField<Record, String> CATALOG_NAME = createField(DSL.name("CATALOG_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_NAME</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField(DSL.name("SCHEMA_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.SCHEMA_OWNER</code>.
     */
    public final TableField<Record, String> SCHEMA_OWNER = createField(DSL.name("SCHEMA_OWNER"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_CATALOG</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_CATALOG = createField(DSL.name("DEFAULT_CHARACTER_SET_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_SCHEMA</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_SCHEMA = createField(DSL.name("DEFAULT_CHARACTER_SET_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("DEFAULT_CHARACTER_SET_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.SQL_PATH</code>.
     */
    public final TableField<Record, String> SQL_PATH = createField(DSL.name("SQL_PATH"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SCHEMATA.DEFAULT_COLLATION_NAME</code>.
     */
    public final TableField<Record, String> DEFAULT_COLLATION_NAME = createField(DSL.name("DEFAULT_COLLATION_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SCHEMATA.REMARKS</code>.
     */
    public final TableField<Record, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(1000000000), this, "");

    private Schemata(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Schemata(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SCHEMATA</code> table
     * reference
     */
    public Schemata(String alias) {
        this(DSL.name(alias), SCHEMATA);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SCHEMATA</code> table
     * reference
     */
    public Schemata(Name alias) {
        this(alias, SCHEMATA);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.SCHEMATA</code> table reference
     */
    public Schemata() {
        this(DSL.name("SCHEMATA"), null);
    }

    public <O extends Record> Schemata(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, SCHEMATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_SCHEMATA;
    }

    private transient Columns _columns;

    /**
     * Get the implicit to-many join path to the
     * <code>INFORMATION_SCHEMA.COLUMNS</code> table
     */
    public Columns columns() {
        if (_columns == null)
            _columns = new Columns(this, null, Keys.SYNTHETIC_FK_COLUMNS__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _columns;
    }

    private transient Sequences _sequences;

    /**
     * Get the implicit to-many join path to the
     * <code>INFORMATION_SCHEMA.SEQUENCES</code> table
     */
    public Sequences sequences() {
        if (_sequences == null)
            _sequences = new Sequences(this, null, Keys.SYNTHETIC_FK_SEQUENCES__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _sequences;
    }

    private transient Tables _tables;

    /**
     * Get the implicit to-many join path to the
     * <code>INFORMATION_SCHEMA.TABLES</code> table
     */
    public Tables tables() {
        if (_tables == null)
            _tables = new Tables(this, null, Keys.SYNTHETIC_FK_TABLES__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _tables;
    }

    private transient Views _views;

    /**
     * Get the implicit to-many join path to the
     * <code>INFORMATION_SCHEMA.VIEWS</code> table
     */
    public Views views() {
        if (_views == null)
            _views = new Views(this, null, Keys.SYNTHETIC_FK_VIEWS__SYNTHETIC_PK_SCHEMATA.getInverseKey());

        return _views;
    }

    @Override
    public Schemata as(String alias) {
        return new Schemata(DSL.name(alias), this);
    }

    @Override
    public Schemata as(Name alias) {
        return new Schemata(alias, this);
    }

    @Override
    public Schemata as(Table<?> alias) {
        return new Schemata(alias.getQualifiedName(), this);
    }
}
