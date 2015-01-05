/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "X_TEST_CASE_2025")
public interface X_TEST_CASE_2025_INTERFACE extends Cloneable, Serializable {

	/**
	 * Setter for <code>X_TEST_CASE_2025.REF_ID</code>.
	 */
	public void setREF_ID(Integer value);

	/**
	 * Getter for <code>X_TEST_CASE_2025.REF_ID</code>.
	 */
	@Column(name = "REF_ID", nullable = false, precision = 7)
	public Integer getREF_ID();

	/**
	 * Setter for <code>X_TEST_CASE_2025.REF_NAME</code>.
	 */
	public void setREF_NAME(String value);

	/**
	 * Getter for <code>X_TEST_CASE_2025.REF_NAME</code>.
	 */
	@Column(name = "REF_NAME", nullable = false, length = 10)
	public String getREF_NAME();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface X_TEST_CASE_2025_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_2025_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface X_TEST_CASE_2025_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_2025_INTERFACE> E into(E into);
}
