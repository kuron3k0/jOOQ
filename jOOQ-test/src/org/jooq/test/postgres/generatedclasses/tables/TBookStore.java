/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBookStore extends org.jooq.impl.TableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -728316885;

	/**
	 * The singleton instance of <code>public.t_book_store</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TBookStore T_BOOK_STORE = new org.jooq.test.postgres.generatedclasses.tables.TBookStore();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord.class;
	}

	/**
	 * The column <code>public.t_book_store.name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false).defaulted(true), this);

	/**
	 * Create a <code>public.t_book_store</code> table reference
	 */
	public TBookStore() {
		super("t_book_store", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_book_store</code> table reference
	 */
	public TBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.UK_T_BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookStoreRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.UK_T_BOOK_STORE_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TBookStore as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TBookStore(alias);
	}
}
