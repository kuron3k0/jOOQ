/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnusedDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.h2.generatedclasses.tables.pojos.XUnused, org.jooq.Record2<java.lang.Integer, java.lang.String>> {

	/**
	 * Create a new XUnusedDao without any configuration
	 */
	public XUnusedDao() {
		super(org.jooq.test.h2.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.h2.generatedclasses.tables.pojos.XUnused.class);
	}

	/**
	 * Create a new XUnusedDao with an attached configuration
	 */
	public XUnusedDao(org.jooq.Configuration configuration) {
		super(org.jooq.test.h2.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.h2.generatedclasses.tables.pojos.XUnused.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Integer, java.lang.String> getId(org.jooq.test.h2.generatedclasses.tables.pojos.XUnused object) {
		return compositeKeyRecord(object.getId(), object.getName());
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.XUnused fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.XUnused.ID, value);
	}

	/**
	 * Fetch records that have <code>NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByName(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.NAME, values);
	}

	/**
	 * Fetch records that have <code>BIG_INTEGER IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByBigInteger(java.math.BigInteger... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.BIG_INTEGER, values);
	}

	/**
	 * Fetch records that have <code>ID_REF IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByIdRef(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.ID_REF, values);
	}

	/**
	 * Fetch records that have <code>NAME_REF IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByNameRef(java.lang.String... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.NAME_REF, values);
	}

	/**
	 * Fetch records that have <code>CLASS IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByClass(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.CLASS, values);
	}

	/**
	 * Fetch records that have <code>FIELDS IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByFields(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.FIELDS, values);
	}

	/**
	 * Fetch records that have <code>TABLE IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByTable(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.TABLE, values);
	}

	/**
	 * Fetch records that have <code>CONFIGURATION IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByConfiguration(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.CONFIGURATION, values);
	}

	/**
	 * Fetch records that have <code>U_D_T IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByUDT(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.U_D_T, values);
	}

	/**
	 * Fetch records that have <code>META_DATA IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByMetaData(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.META_DATA, values);
	}

	/**
	 * Fetch records that have <code>VALUES IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByValues(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.VALUES, values);
	}

	/**
	 * Fetch records that have <code>TYPE0 IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByType0(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.TYPE0, values);
	}

	/**
	 * Fetch records that have <code>PRIMARY_KEY IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByPrimaryKey(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.PRIMARY_KEY, values);
	}

	/**
	 * Fetch records that have <code>PRIMARYKEY IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByPrimarykey(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.PRIMARYKEY, values);
	}

	/**
	 * Fetch records that have <code>FIELD 737 IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.XUnused> fetchByField_737(java.math.BigDecimal... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.XUnused.FIELD_737, values);
	}
}
