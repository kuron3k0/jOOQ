/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITTriggers extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_TRIGGERS.ID_GENERATED</code>. 
	 */
	public void setIdGenerated(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_TRIGGERS.ID_GENERATED</code>. 
	 */
	public java.lang.Integer getIdGenerated();

	/**
	 * Setter for <code>PUBLIC.T_TRIGGERS.ID</code>. 
	 */
	public void setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_TRIGGERS.ID</code>. 
	 */
	public java.lang.Integer getId();

	/**
	 * Setter for <code>PUBLIC.T_TRIGGERS.COUNTER</code>. 
	 */
	public void setCounter(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_TRIGGERS.COUNTER</code>. 
	 */
	public java.lang.Integer getCounter();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITTriggers
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITTriggers from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITTriggers
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITTriggers> E into(E into);
}
