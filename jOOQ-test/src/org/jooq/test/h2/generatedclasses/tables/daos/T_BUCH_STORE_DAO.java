/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_BUCH_STORE_DAO extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TBuchStoreRecord, org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH_STORE, java.lang.String> {

	/**
	 * Create a new T_BUCH_STORE_DAO without any configuration
	 */
	public T_BUCH_STORE_DAO() {
		super(org.jooq.test.h2.generatedclasses.tables.TBuchStore.T_BUCH_STORE, org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH_STORE.class);
	}

	/**
	 * Create a new T_BUCH_STORE_DAO with an attached configuration
	 */
	public T_BUCH_STORE_DAO(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.TBuchStore.T_BUCH_STORE, org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH_STORE.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.String getId(org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH_STORE object) {
		return object.getName();
	}

	/**
	 * Fetch records that have <code>NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH_STORE> fetchByName(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TBuchStore.NAME, values);
	}

	/**
	 * Fetch a unique record that has <code>NAME = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.T_BUCH_STORE fetchOneByName(java.lang.String value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.TBuchStore.NAME, value);
	}
}
