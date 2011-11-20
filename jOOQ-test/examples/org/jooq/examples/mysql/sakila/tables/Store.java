/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class Store extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> {

	private static final long serialVersionUID = 1113761706;

	/**
	 * The singleton instance of store
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Store STORE = new org.jooq.examples.mysql.sakila.tables.Store();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> __RECORD_TYPE = org.jooq.examples.mysql.sakila.tables.records.StoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, org.joou.UByte> STORE_ID = createField("store_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.store.manager_staff_id]
	 * REFERENCES staff [sakila.staff.staff_id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, org.joou.UByte> MANAGER_STAFF_ID = createField("manager_staff_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.store.address_id]
	 * REFERENCES address [sakila.address.address_id]
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, org.joou.UShort> ADDRESS_ID = createField("address_id", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Store() {
		super("store", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * No further instances allowed
	 */
	private Store(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Store.STORE);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, org.joou.UByte> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_store;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_store_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_store_PRIMARY, org.jooq.examples.mysql.sakila.Keys.KEY_store_idx_unique_manager);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.StoreRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.fk_store_staff, org.jooq.examples.mysql.sakila.Keys.fk_store_address);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Store as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Store(alias);
	}
}
