/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.interfaces;


import java.io.Serializable;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface U_3082_3_INTERFACE extends Cloneable, Serializable {

	/**
	 * Setter for <code>U_3082_3.O</code>.
	 */
	public void setO(U_3082_1_INTERFACE value);

	/**
	 * Getter for <code>U_3082_3.O</code>.
	 */
	public U_3082_1_INTERFACE getO();

	/**
	 * Setter for <code>U_3082_3.T</code>.
	 */
	public void setT(List<? extends org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_3082_1_INTERFACE> value);

	/**
	 * Getter for <code>U_3082_3.T</code>.
	 */
	public List<? extends org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_3082_1_INTERFACE> getT();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface U_3082_3_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_3082_3_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface U_3082_3_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_3082_3_INTERFACE> E into(E into);
}
