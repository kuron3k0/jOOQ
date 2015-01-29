/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;


import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.mysql.generatedclasses.tables.XTestCase_85;
import org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record;


/**
 * An unused table in the same schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85Dao extends DAOImpl<XTestCase_85Record, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85, Integer> {

	/**
	 * Create a new XTestCase_85Dao without any configuration
	 */
	public XTestCase_85Dao() {
		super(XTestCase_85.X_TEST_CASE_85, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85.class);
	}

	/**
	 * Create a new XTestCase_85Dao with an attached configuration
	 */
	public XTestCase_85Dao(Configuration configuration) {
		super(XTestCase_85.X_TEST_CASE_85, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85 object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85> fetchById(Integer... values) {
		return fetch(XTestCase_85.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85 fetchOneById(Integer value) {
		return fetchOne(XTestCase_85.ID, value);
	}

	/**
	 * Fetch records that have <code>x_unused_id IN (values)</code>
	 */
	public List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85> fetchByXUnusedId(Integer... values) {
		return fetch(XTestCase_85.X_UNUSED_ID, values);
	}

	/**
	 * Fetch records that have <code>x_unused_name IN (values)</code>
	 */
	public List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85> fetchByXUnusedName(String... values) {
		return fetch(XTestCase_85.X_UNUSED_NAME, values);
	}
}
