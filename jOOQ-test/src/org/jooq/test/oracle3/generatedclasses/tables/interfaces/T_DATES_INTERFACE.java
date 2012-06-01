/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_DATES", schema = "TEST")
public interface T_DATES_INTERFACE extends java.lang.Cloneable {

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setID(java.lang.Integer value);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * An uncommented item
	 */
	public void setD(java.sql.Date value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "D", length = 7)
	public java.sql.Date getD();

	/**
	 * An uncommented item
	 */
	public void setT(java.sql.Timestamp value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "T", length = 11)
	public java.sql.Timestamp getT();

	/**
	 * An uncommented item
	 */
	public void setTS(java.sql.Timestamp value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TS", length = 11)
	public java.sql.Timestamp getTS();

	/**
	 * An uncommented item
	 */
	public void setD_INT(java.lang.Integer value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "D_INT", precision = 7)
	public java.lang.Integer getD_INT();

	/**
	 * An uncommented item
	 */
	public void setTS_BIGINT(java.lang.Long value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "TS_BIGINT", precision = 18)
	public java.lang.Long getTS_BIGINT();

	/**
	 * An uncommented item
	 */
	public void setI_Y(org.jooq.types.YearToMonth value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "I_Y", precision = 2)
	public org.jooq.types.YearToMonth getI_Y();

	/**
	 * An uncommented item
	 */
	public void setI_D(org.jooq.types.DayToSecond value);

	/**
	 * An uncommented item
	 */
	@javax.persistence.Column(name = "I_D", precision = 2, scale = 6)
	public org.jooq.types.DayToSecond getI_D();
}
