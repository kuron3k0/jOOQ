/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;


import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.hsqldb.generatedclasses.Keys;
import org.jooq.test.hsqldb.generatedclasses.Public;
import org.jooq.test.hsqldb.generatedclasses.tables.records.TIdentityRecord;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentity extends TableImpl<TIdentityRecord> {

	private static final long serialVersionUID = 604934016;

	/**
	 * The reference instance of <code>PUBLIC.T_IDENTITY</code>
	 */
	public static final TIdentity T_IDENTITY = new TIdentity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<TIdentityRecord> getRecordType() {
		return TIdentityRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_IDENTITY.ID</code>.
	 */
	public final TableField<TIdentityRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.T_IDENTITY.VAL</code>.
	 */
	public final TableField<TIdentityRecord, java.lang.Integer> VAL = createField("VAL", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>PUBLIC.T_IDENTITY</code> table reference
	 */
	public TIdentity() {
		this("T_IDENTITY", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_IDENTITY</code> table reference
	 */
	public TIdentity(java.lang.String alias) {
		this(alias, T_IDENTITY);
	}

	private TIdentity(java.lang.String alias, Table<TIdentityRecord> aliased) {
		this(alias, aliased, null);
	}

	private TIdentity(java.lang.String alias, Table<TIdentityRecord> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TIdentityRecord, java.lang.Integer> getIdentity() {
		return Keys.IDENTITY_T_IDENTITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TIdentity as(java.lang.String alias) {
		return new TIdentity(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TIdentity rename(java.lang.String name) {
		return new TIdentity(name, null);
	}
}
