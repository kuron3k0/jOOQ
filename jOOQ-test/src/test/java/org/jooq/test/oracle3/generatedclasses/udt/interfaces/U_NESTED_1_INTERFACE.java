/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.interfaces;


import java.io.Serializable;

import org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface U_NESTED_1_INTERFACE extends Cloneable, Serializable {

	/**
	 * Setter for <code>U_NESTED_1.ID</code>.
	 */
	public void setID(Integer value);

	/**
	 * Getter for <code>U_NESTED_1.ID</code>.
	 */
	public Integer getID();

	/**
	 * Setter for <code>U_NESTED_1.NESTED</code>.
	 */
	public void setNESTED(U_NUMBER_TABLE value);

	/**
	 * Getter for <code>U_NESTED_1.NESTED</code>.
	 */
	public U_NUMBER_TABLE getNESTED();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface U_NESTED_1_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_NESTED_1_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface U_NESTED_1_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_NESTED_1_INTERFACE> E into(E into);
}
