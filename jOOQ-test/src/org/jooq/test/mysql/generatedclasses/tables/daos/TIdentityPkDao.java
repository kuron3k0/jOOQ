/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
public class TIdentityPkDao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.TIdentityPkRecord, org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk, java.lang.Integer> {

	/**
	 * Create a new TIdentityPkDao without any factory
	 */
	public TIdentityPkDao() {
		super(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk.class);
	}

	/**
	 * Create a new TIdentityPkDao with an attached factory
	 */
	public TIdentityPkDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk object) {
		return object.getId();
	}
}
