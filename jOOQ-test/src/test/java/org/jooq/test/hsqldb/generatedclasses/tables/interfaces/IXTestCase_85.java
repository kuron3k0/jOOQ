/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IXTestCase_85 extends Serializable {

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_85.ID</code>.
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_85.ID</code>.
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_ID</code>.
	 */
	public void setXUnusedId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_ID</code>.
	 */
	public java.lang.Integer getXUnusedId();

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME</code>.
	 */
	public void setXUnusedName(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_85.X_UNUSED_NAME</code>.
	 */
	public java.lang.String getXUnusedName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_85
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IXTestCase_85 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_85
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IXTestCase_85> E into(E into);
}
