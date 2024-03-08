/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.clickhouse.system.tables;


import java.sql.Timestamp;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.clickhouse.system.System;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * Lists all tables of the current server.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>system.tables</code>
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
     * The column <code>system.tables.database</code>. The name of the database
     * the table is in.
     */
    public final TableField<Record, String> DATABASE = createField(DSL.name("database"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "The name of the database the table is in.");

    /**
     * The column <code>system.tables.name</code>. Table name.
     */
    public final TableField<Record, String> NAME = createField(DSL.name("name"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "Table name.");

    /**
     * The column <code>system.tables.uuid</code>. Table uuid (Atomic database).
     */
    public final TableField<Record, java.util.UUID> UUID = createField(DSL.name("uuid"), SQLDataType.UUID.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.UUID)), this, "Table uuid (Atomic database).");

    /**
     * The column <code>system.tables.engine</code>. Table engine name (without
     * parameters).
     */
    public final TableField<Record, String> ENGINE = createField(DSL.name("engine"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "Table engine name (without parameters).");

    /**
     * The column <code>system.tables.is_temporary</code>. Flag that indicates
     * whether the table is temporary.
     */
    public final TableField<Record, UByte> IS_TEMPORARY = createField(DSL.name("is_temporary"), SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.TINYINTUNSIGNED)), this, "Flag that indicates whether the table is temporary.");

    /**
     * The column <code>system.tables.data_paths</code>. Paths to the table data
     * in the file systems.
     */
    public final TableField<Record, String[]> DATA_PATHS = createField(DSL.name("data_paths"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)).array(), this, "Paths to the table data in the file systems.");

    /**
     * The column <code>system.tables.metadata_path</code>. Path to the table
     * metadata in the file system.
     */
    public final TableField<Record, String> METADATA_PATH = createField(DSL.name("metadata_path"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "Path to the table metadata in the file system.");

    /**
     * The column <code>system.tables.metadata_modification_time</code>. Time of
     * latest modification of the table metadata.
     */
    public final TableField<Record, Timestamp> METADATA_MODIFICATION_TIME = createField(DSL.name("metadata_modification_time"), SQLDataType.TIMESTAMP(0).nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.TIMESTAMP)), this, "Time of latest modification of the table metadata.");

    /**
     * The column <code>system.tables.metadata_version</code>. Metadata version
     * for ReplicatedMergeTree table, 0 for non ReplicatedMergeTree table.
     */
    public final TableField<Record, Integer> METADATA_VERSION = createField(DSL.name("metadata_version"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.INTEGER)), this, "Metadata version for ReplicatedMergeTree table, 0 for non ReplicatedMergeTree table.");

    /**
     * The column <code>system.tables.dependencies_database</code>. Database
     * dependencies.
     */
    public final TableField<Record, String[]> DEPENDENCIES_DATABASE = createField(DSL.name("dependencies_database"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)).array(), this, "Database dependencies.");

    /**
     * The column <code>system.tables.dependencies_table</code>. Table
     * dependencies (materialized views the current table).
     */
    public final TableField<Record, String[]> DEPENDENCIES_TABLE = createField(DSL.name("dependencies_table"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)).array(), this, "Table dependencies (materialized views the current table).");

    /**
     * The column <code>system.tables.create_table_query</code>. The query that
     * was used to create the table.
     */
    public final TableField<Record, String> CREATE_TABLE_QUERY = createField(DSL.name("create_table_query"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "The query that was used to create the table.");

    /**
     * The column <code>system.tables.engine_full</code>. Parameters of the
     * table engine.
     */
    public final TableField<Record, String> ENGINE_FULL = createField(DSL.name("engine_full"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "Parameters of the table engine.");

    /**
     * The column <code>system.tables.as_select</code>. SELECT query for view.
     */
    public final TableField<Record, String> AS_SELECT = createField(DSL.name("as_select"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "SELECT query for view.");

    /**
     * The column <code>system.tables.partition_key</code>. The partition key
     * expression specified in the table.
     */
    public final TableField<Record, String> PARTITION_KEY = createField(DSL.name("partition_key"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "The partition key expression specified in the table.");

    /**
     * The column <code>system.tables.sorting_key</code>. The sorting key
     * expression specified in the table.
     */
    public final TableField<Record, String> SORTING_KEY = createField(DSL.name("sorting_key"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "The sorting key expression specified in the table.");

    /**
     * The column <code>system.tables.primary_key</code>. The primary key
     * expression specified in the table.
     */
    public final TableField<Record, String> PRIMARY_KEY = createField(DSL.name("primary_key"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "The primary key expression specified in the table.");

    /**
     * The column <code>system.tables.sampling_key</code>. The sampling key
     * expression specified in the table.
     */
    public final TableField<Record, String> SAMPLING_KEY = createField(DSL.name("sampling_key"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "The sampling key expression specified in the table.");

    /**
     * The column <code>system.tables.storage_policy</code>. The storage policy.
     */
    public final TableField<Record, String> STORAGE_POLICY = createField(DSL.name("storage_policy"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "The storage policy.");

    /**
     * The column <code>system.tables.total_rows</code>. Total number of rows,
     * if it is possible to quickly determine exact number of rows in the table,
     * otherwise NULL (including underlying Buffer table).
     */
    public final TableField<Record, ULong> TOTAL_ROWS = createField(DSL.name("total_rows"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "Total number of rows, if it is possible to quickly determine exact number of rows in the table, otherwise NULL (including underlying Buffer table).");

    /**
     * The column <code>system.tables.total_bytes</code>. Total number of bytes,
     * if it is possible to quickly determine exact number of bytes for the
     * table on storage, otherwise NULL (does not includes any underlying
     * storage). If the table stores data on disk, returns used space on disk
     * (i.e. compressed). If the table stores data in memory, returns
     * approximated number of used bytes in memory.
     */
    public final TableField<Record, ULong> TOTAL_BYTES = createField(DSL.name("total_bytes"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "Total number of bytes, if it is possible to quickly determine exact number of bytes for the table on storage, otherwise NULL (does not includes any underlying storage). If the table stores data on disk, returns used space on disk (i.e. compressed). If the table stores data in memory, returns approximated number of used bytes in memory.");

    /**
     * The column <code>system.tables.total_bytes_uncompressed</code>. Total
     * number of uncompressed bytes, if it's possible to quickly determine the
     * exact number of bytes from the part checksums for the table on storage,
     * otherwise NULL (does not take underlying storage (if any) into account).
     */
    public final TableField<Record, ULong> TOTAL_BYTES_UNCOMPRESSED = createField(DSL.name("total_bytes_uncompressed"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "Total number of uncompressed bytes, if it's possible to quickly determine the exact number of bytes from the part checksums for the table on storage, otherwise NULL (does not take underlying storage (if any) into account).");

    /**
     * The column <code>system.tables.parts</code>.
     */
    public final TableField<Record, ULong> PARTS = createField(DSL.name("parts"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>system.tables.active_parts</code>.
     */
    public final TableField<Record, ULong> ACTIVE_PARTS = createField(DSL.name("active_parts"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>system.tables.total_marks</code>.
     */
    public final TableField<Record, ULong> TOTAL_MARKS = createField(DSL.name("total_marks"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>system.tables.lifetime_rows</code>. Total number of rows
     * INSERTed since server start (only for Buffer tables).
     */
    public final TableField<Record, ULong> LIFETIME_ROWS = createField(DSL.name("lifetime_rows"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "Total number of rows INSERTed since server start (only for Buffer tables).");

    /**
     * The column <code>system.tables.lifetime_bytes</code>. Total number of
     * bytes INSERTed since server start (only for Buffer tables).
     */
    public final TableField<Record, ULong> LIFETIME_BYTES = createField(DSL.name("lifetime_bytes"), SQLDataType.BIGINTUNSIGNED.defaultValue(DSL.field(DSL.raw(""), SQLDataType.BIGINTUNSIGNED)), this, "Total number of bytes INSERTed since server start (only for Buffer tables).");

    /**
     * The column <code>system.tables.comment</code>. The comment for the table.
     */
    public final TableField<Record, String> COMMENT = createField(DSL.name("comment"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)), this, "The comment for the table.");

    /**
     * The column <code>system.tables.has_own_data</code>. Flag that indicates
     * whether the table itself stores some data on disk or only accesses some
     * other source.
     */
    public final TableField<Record, UByte> HAS_OWN_DATA = createField(DSL.name("has_own_data"), SQLDataType.TINYINTUNSIGNED.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.TINYINTUNSIGNED)), this, "Flag that indicates whether the table itself stores some data on disk or only accesses some other source.");

    /**
     * The column <code>system.tables.loading_dependencies_database</code>.
     * Database loading dependencies (list of objects which should be loaded
     * before the current object).
     */
    public final TableField<Record, String[]> LOADING_DEPENDENCIES_DATABASE = createField(DSL.name("loading_dependencies_database"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)).array(), this, "Database loading dependencies (list of objects which should be loaded before the current object).");

    /**
     * The column <code>system.tables.loading_dependencies_table</code>. Table
     * loading dependencies (list of objects which should be loaded before the
     * current object).
     */
    public final TableField<Record, String[]> LOADING_DEPENDENCIES_TABLE = createField(DSL.name("loading_dependencies_table"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)).array(), this, "Table loading dependencies (list of objects which should be loaded before the current object).");

    /**
     * The column <code>system.tables.loading_dependent_database</code>.
     * Dependent loading database.
     */
    public final TableField<Record, String[]> LOADING_DEPENDENT_DATABASE = createField(DSL.name("loading_dependent_database"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)).array(), this, "Dependent loading database.");

    /**
     * The column <code>system.tables.loading_dependent_table</code>. Dependent
     * loading table.
     */
    public final TableField<Record, String[]> LOADING_DEPENDENT_TABLE = createField(DSL.name("loading_dependent_table"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw(""), SQLDataType.CHAR)).array(), this, "Dependent loading table.");

    /**
     * The column <code>system.tables.table</code>.
     */
    public final TableField<Record, String> TABLE = createField(DSL.name("table"), SQLDataType.CHAR.nullable(false).defaultValue(DSL.field(DSL.raw("name"), SQLDataType.CHAR)), this, "");

    private Tables(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Tables(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("Lists all tables of the current server."), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>system.tables</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>system.tables</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    /**
     * Create a <code>system.tables</code> table reference
     */
    public Tables() {
        this(DSL.name("tables"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : System.SYSTEM;
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
