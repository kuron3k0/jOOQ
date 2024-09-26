/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
import org.jooq.meta.h2.information_schema.InformationSchema;
import org.jooq.meta.h2.information_schema.Keys;


/**
 * This class is generated by jOOQ.
 *
 * @deprecated - [#17388] [#17389] - 3.20.0 - Use the classes from the
 *             <code>information_schema_2</code> package, instead.
 */
@Deprecated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains extends TableImpl<Record> {

    private static final long serialVersionUID = -280782399;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.DOMAINS</code>
     */
    public static final Domains DOMAINS = new Domains();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_CATALOG</code>.
     */
    public final TableField<Record, String> DOMAIN_CATALOG = createField(DSL.name("DOMAIN_CATALOG"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_SCHEMA</code>.
     */
    public final TableField<Record, String> DOMAIN_SCHEMA = createField(DSL.name("DOMAIN_SCHEMA"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_NAME</code>.
     */
    public final TableField<Record, String> DOMAIN_NAME = createField(DSL.name("DOMAIN_NAME"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.COLUMN_DEFAULT</code>.
     */
    public final TableField<Record, String> COLUMN_DEFAULT = createField(DSL.name("COLUMN_DEFAULT"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.IS_NULLABLE</code>.
     */
    public final TableField<Record, String> IS_NULLABLE = createField(DSL.name("IS_NULLABLE"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.DATA_TYPE</code>.
     */
    public final TableField<Record, Integer> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.PRECISION</code>.
     */
    public final TableField<Record, Integer> PRECISION = createField(DSL.name("PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.SCALE</code>.
     */
    public final TableField<Record, Integer> SCALE = createField(DSL.name("SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.TYPE_NAME</code>.
     */
    public final TableField<Record, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.SELECTIVITY</code>.
     */
    public final TableField<Record, Integer> SELECTIVITY = createField(DSL.name("SELECTIVITY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.CHECK_CONSTRAINT</code>.
     */
    public final TableField<Record, String> CHECK_CONSTRAINT = createField(DSL.name("CHECK_CONSTRAINT"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.REMARKS</code>.
     */
    public final TableField<Record, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.SQL</code>.
     */
    public final TableField<Record, String> SQL = createField(DSL.name("SQL"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.ID</code>.
     */
    public final TableField<Record, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER, this, "");

    private Domains(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Domains(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.DOMAINS</code> table reference
     */
    public Domains(String alias) {
        this(DSL.name(alias), DOMAINS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.DOMAINS</code> table reference
     */
    public Domains(Name alias) {
        this(alias, DOMAINS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.DOMAINS</code> table reference
     */
    public Domains() {
        this(DSL.name("DOMAINS"), null);
    }

    public <O extends Record> Domains(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, DOMAINS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_DOMAINS;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.SYNTHETIC_PK_DOMAINS);
    }

    @Override
    public Domains as(String alias) {
        return new Domains(DSL.name(alias), this);
    }

    @Override
    public Domains as(Name alias) {
        return new Domains(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Domains rename(String name) {
        return new Domains(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Domains rename(Name name) {
        return new Domains(name, null);
    }
}
