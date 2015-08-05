/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;


import java.io.Serializable;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITUnsigned extends Serializable {

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_BYTE</code>.
	 */
	public void setUByte(UByte value);

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_BYTE</code>.
	 */
	public UByte getUByte();

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_SHORT</code>.
	 */
	public void setUShort(UShort value);

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_SHORT</code>.
	 */
	public UShort getUShort();

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_INT</code>.
	 */
	public void setUInt(UInteger value);

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_INT</code>.
	 */
	public UInteger getUInt();

	/**
	 * Setter for <code>PUBLIC.T_UNSIGNED.U_LONG</code>.
	 */
	public void setULong(ULong value);

	/**
	 * Getter for <code>PUBLIC.T_UNSIGNED.U_LONG</code>.
	 */
	public ULong getULong();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITUnsigned
	 */
	public void from(org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITUnsigned from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITUnsigned
	 */
	public <E extends org.jooq.test.hsqldb.generatedclasses.tables.interfaces.ITUnsigned> E into(E into);
}
