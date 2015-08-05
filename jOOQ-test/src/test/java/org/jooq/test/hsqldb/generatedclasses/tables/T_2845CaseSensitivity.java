/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.hsqldb.generatedclasses.Keys;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.test.hsqldb.generatedclasses.tables.records.T_2845CaseSensitivityRecord;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2845CaseSensitivity extends TableImpl<T_2845CaseSensitivityRecord> {

	private static final long serialVersionUID = 562872170;

	/**
	 * The reference instance of <code>PUBLIC.T_2845_CASE_sensitivity</code>
	 */
	public static final T_2845CaseSensitivity T_2845_CASE_SENSITIVITY = new T_2845CaseSensitivity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<T_2845CaseSensitivityRecord> getRecordType() {
		return T_2845CaseSensitivityRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_2845_CASE_sensitivity.ID</code>.
	 */
	public final TableField<T_2845CaseSensitivityRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.T_2845_CASE_sensitivity.INSENSITIVE</code>.
	 */
	public final TableField<T_2845CaseSensitivityRecord, java.lang.Integer> INSENSITIVE = createField("INSENSITIVE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.T_2845_CASE_sensitivity.UPPER</code>.
	 */
	public final TableField<T_2845CaseSensitivityRecord, java.lang.Integer> UPPER = createField("UPPER", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.T_2845_CASE_sensitivity.lower</code>.
	 */
	public final TableField<T_2845CaseSensitivityRecord, java.lang.Integer> LOWER = createField("lower", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>PUBLIC.T_2845_CASE_sensitivity.Mixed</code>.
	 */
	public final TableField<T_2845CaseSensitivityRecord, java.lang.Integer> MIXED = createField("Mixed", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>PUBLIC.T_2845_CASE_sensitivity</code> table reference
	 */
	public T_2845CaseSensitivity() {
		this("T_2845_CASE_sensitivity", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_2845_CASE_sensitivity</code> table reference
	 */
	public T_2845CaseSensitivity(java.lang.String alias) {
		this(alias, T_2845_CASE_SENSITIVITY);
	}

	private T_2845CaseSensitivity(java.lang.String alias, Table<T_2845CaseSensitivityRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_2845CaseSensitivity(java.lang.String alias, Table<T_2845CaseSensitivityRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<T_2845CaseSensitivityRecord> getPrimaryKey() {
		return Keys.PK_T_2845_CASE_SENSITIVITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<T_2845CaseSensitivityRecord>> getKeys() {
		return Arrays.<UniqueKey<T_2845CaseSensitivityRecord>>asList(Keys.PK_T_2845_CASE_SENSITIVITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_2845CaseSensitivity as(java.lang.String alias) {
		return new T_2845CaseSensitivity(alias, this);
	}

	/**
	 * Rename this table
	 */
	public T_2845CaseSensitivity rename(java.lang.String name) {
		return new T_2845CaseSensitivity(name, null);
	}
}
