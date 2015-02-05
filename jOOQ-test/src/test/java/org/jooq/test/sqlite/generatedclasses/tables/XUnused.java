/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.sqlite.generatedclasses.DefaultSchema;
import org.jooq.test.sqlite.generatedclasses.Keys;
import org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnused extends TableImpl<XUnusedRecord> {

	private static final long serialVersionUID = -205620043;

	/**
	 * The reference instance of <code>x_unused</code>
	 */
	public static final XUnused X_UNUSED = new XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XUnusedRecord> getRecordType() {
		return XUnusedRecord.class;
	}

	/**
	 * The column <code>x_unused.ID</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), X_UNUSED, "");

	/**
	 * The column <code>x_unused.NAME</code>.
	 */
	public static final TableField<XUnusedRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), X_UNUSED, "");

	/**
	 * The column <code>x_unused.BIG_INTEGER</code>.
	 */
	public static final TableField<XUnusedRecord, BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(25), X_UNUSED, "");

	/**
	 * The column <code>x_unused.ID_REF</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> ID_REF = createField("ID_REF", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.CLASS</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.FIELDS</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> FIELDS = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.CONFIGURATION</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> CONFIGURATION = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.U_D_T</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> U_D_T = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.META_DATA</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> META_DATA = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.TYPE0</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> TYPE0 = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.PRIMARY_KEY</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.PRIMARYKEY</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> PRIMARYKEY = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.NAME_REF</code>.
	 */
	public static final TableField<XUnusedRecord, String> NAME_REF = createField("NAME_REF", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_UNUSED, "");

	/**
	 * The column <code>x_unused.FIELD 737</code>.
	 */
	public static final TableField<XUnusedRecord, BigDecimal> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.NUMERIC.precision(25, 2), X_UNUSED, "");

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		this("x_unused", null);
	}

	private XUnused(String alias, Table<XUnusedRecord> aliased) {
		this(alias, aliased, null);
	}

	private XUnused(String alias, Table<XUnusedRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<XUnusedRecord> getPrimaryKey() {
		return Keys.PK_X_UNUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<XUnusedRecord>> getKeys() {
		return Arrays.<UniqueKey<XUnusedRecord>>asList(Keys.PK_X_UNUSED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<XUnusedRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<XUnusedRecord, ?>>asList(Keys.FK_X_UNUSED_X_UNUSED_1);
	}
}
