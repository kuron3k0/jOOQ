/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;


import java.util.List;
import java.util.UUID;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.mysql.generatedclasses.tables.TExoticTypes;
import org.jooq.test.mysql.generatedclasses.tables.records.TExoticTypesRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypesDao extends DAOImpl<TExoticTypesRecord, org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes, Integer> {

	/**
	 * Create a new TExoticTypesDao without any configuration
	 */
	public TExoticTypesDao() {
		super(TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes.class);
	}

	/**
	 * Create a new TExoticTypesDao with an attached configuration
	 */
	public TExoticTypesDao(Configuration configuration) {
		super(TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes> fetchById(Integer... values) {
		return fetch(TExoticTypes.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes fetchOneById(Integer value) {
		return fetchOne(TExoticTypes.ID, value);
	}

	/**
	 * Fetch records that have <code>UU IN (values)</code>
	 */
	public List<org.jooq.test.mysql.generatedclasses.tables.pojos.TExoticTypes> fetchByUu(UUID... values) {
		return fetch(TExoticTypes.UU, values);
	}
}
