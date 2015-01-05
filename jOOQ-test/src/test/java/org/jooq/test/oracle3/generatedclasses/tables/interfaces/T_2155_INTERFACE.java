/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_2155_OBJECT_INTERFACE;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_ARRAY;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_2155")
public interface T_2155_INTERFACE extends Cloneable, Serializable {

	/**
	 * Setter for <code>T_2155.ID</code>.
	 */
	public void setID(Integer value);

	/**
	 * Getter for <code>T_2155.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	public Integer getID();

	/**
	 * Setter for <code>T_2155.D1</code>.
	 */
	public void setD1(Date value);

	/**
	 * Getter for <code>T_2155.D1</code>.
	 */
	@Column(name = "D1")
	public Date getD1();

	/**
	 * Setter for <code>T_2155.D2</code>.
	 */
	public void setD2(U_2155_OBJECT_INTERFACE value);

	/**
	 * Getter for <code>T_2155.D2</code>.
	 */
	@Column(name = "D2")
	public U_2155_OBJECT_INTERFACE getD2();

	/**
	 * Setter for <code>T_2155.D3</code>.
	 */
	public void setD3(U_2155_ARRAY value);

	/**
	 * Getter for <code>T_2155.D3</code>.
	 */
	@Column(name = "D3")
	public U_2155_ARRAY getD3();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_2155_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_2155_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_2155_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_2155_INTERFACE> E into(E into);
}
