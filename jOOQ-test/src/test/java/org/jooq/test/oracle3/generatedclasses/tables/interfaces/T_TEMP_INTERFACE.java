/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_TEMP")
public interface T_TEMP_INTERFACE extends Cloneable, Serializable {

	/**
	 * Setter for <code>T_TEMP.ID</code>.
	 */
	public void setID(Integer value);

	/**
	 * Getter for <code>T_TEMP.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	public Integer getID();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_TEMP_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_TEMP_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_TEMP_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_TEMP_INTERFACE> E into(E into);
}
