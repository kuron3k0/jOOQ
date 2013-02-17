/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings("all")
public class TBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -2075738165;

	/**
	 * The singleton instance of <code>DBA.t_book_store</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.sybase.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>DBA.t_book_store.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(400), this);

	/**
	 * Create a <code>DBA.t_book_store</code> table reference
	 */
	public TBookStore() {
		super("t_book_store", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * Create an aliased <code>DBA.t_book_store</code> table reference
	 */
	public TBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.sybase.generatedclasses.Keys.T_BOOK_STORE__UK_T_BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.sybase.generatedclasses.Keys.T_BOOK_STORE__UK_T_BOOK_STORE_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.TBookStore as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.TBookStore(alias);
	}
}
