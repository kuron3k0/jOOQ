/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ISystem extends Serializable {

	/**
	 * Setter for <code>PUBLIC.SYSTEM.ID</code>.
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.SYSTEM.ID</code>.
	 */
	public java.lang.Integer getId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ISystem
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ISystem from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ISystem
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ISystem> E into(E into);
}
