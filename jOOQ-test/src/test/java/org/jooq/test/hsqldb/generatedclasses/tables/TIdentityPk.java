/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.hsqldb.generatedclasses.Keys;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TIdentityPkRecord;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentityPk extends TableImpl<TIdentityPkRecord> {

	private static final long serialVersionUID = 1458202851;

	/**
	 * The reference instance of <code>PUBLIC.T_IDENTITY_PK</code>
	 */
	public static final TIdentityPk T_IDENTITY_PK = new TIdentityPk();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<TIdentityPkRecord> getRecordType() {
		return TIdentityPkRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_IDENTITY_PK.ID</code>.
	 */
	public final TableField<TIdentityPkRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.T_IDENTITY_PK.VAL</code>.
	 */
	public final TableField<TIdentityPkRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>PUBLIC.T_IDENTITY_PK</code> table reference
	 */
	public TIdentityPk() {
		this("T_IDENTITY_PK", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_IDENTITY_PK</code> table reference
	 */
	public TIdentityPk(java.lang.String alias) {
		this(alias, T_IDENTITY_PK);
	}

	private TIdentityPk(java.lang.String alias, Table<TIdentityPkRecord> aliased) {
		this(alias, aliased, null);
	}

	private TIdentityPk(java.lang.String alias, Table<TIdentityPkRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TIdentityPkRecord, java.lang.Integer> getIdentity() {
		return Keys.IDENTITY_T_IDENTITY_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TIdentityPkRecord> getPrimaryKey() {
		return Keys.PK_T_IDENTITY_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TIdentityPkRecord>> getKeys() {
		return Arrays.<UniqueKey<TIdentityPkRecord>>asList(Keys.PK_T_IDENTITY_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TIdentityPk as(java.lang.String alias) {
		return new TIdentityPk(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TIdentityPk rename(java.lang.String name) {
		return new TIdentityPk(name, null);
	}
}
