/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_AUTHOR_INTERFACE;
import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_ADDRESS_TYPE_INTERFACE;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "V_AUTHOR")
public class V_AUTHOR extends TableRecordImpl<V_AUTHOR> implements Cloneable, Record6<Integer, String, String, Date, Integer, U_ADDRESS_TYPE>, V_AUTHOR_INTERFACE {

	private static final long serialVersionUID = 777282541;

	/**
	 * Setter for <code>V_AUTHOR.ID</code>.
	 */
	@Override
	public void setID(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.ID</code>.
	 */
	@Column(name = "ID", nullable = false, precision = 7)
	@Override
	public Integer getID() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>V_AUTHOR.FIRST_NAME</code>.
	 */
	@Override
	public void setFIRST_NAME(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.FIRST_NAME</code>.
	 */
	@Column(name = "FIRST_NAME", length = 50)
	@Override
	public String getFIRST_NAME() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>V_AUTHOR.LAST_NAME</code>.
	 */
	@Override
	public void setLAST_NAME(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.LAST_NAME</code>.
	 */
	@Column(name = "LAST_NAME", nullable = false, length = 50)
	@Override
	public String getLAST_NAME() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>V_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	@Override
	public void setDATE_OF_BIRTH(Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.DATE_OF_BIRTH</code>.
	 */
	@Column(name = "DATE_OF_BIRTH")
	@Override
	public Date getDATE_OF_BIRTH() {
		return (Date) getValue(3);
	}

	/**
	 * Setter for <code>V_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	@Override
	public void setYEAR_OF_BIRTH(Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>V_AUTHOR.YEAR_OF_BIRTH</code>.
	 */
	@Column(name = "YEAR_OF_BIRTH", precision = 7)
	@Override
	public Integer getYEAR_OF_BIRTH() {
		return (Integer) getValue(4);
	}

	/**
	 * Setter for <code>V_AUTHOR.ADDRESS</code>.
	 */
	public void setADDRESS(U_ADDRESS_TYPE value) {
		setValue(5, value);
	}

	/**
	 * Setter for <code>V_AUTHOR.ADDRESS</code>.
	 */
	@Override
	public void setADDRESS(U_ADDRESS_TYPE_INTERFACE value) {
		if (value == null)
			setValue(5, null);
		else
			setValue(5, value.into(new U_ADDRESS_TYPE()));
	}

	/**
	 * Getter for <code>V_AUTHOR.ADDRESS</code>.
	 */
	@Column(name = "ADDRESS")
	@Override
	public U_ADDRESS_TYPE getADDRESS() {
		return (U_ADDRESS_TYPE) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Date, Integer, U_ADDRESS_TYPE> fieldsRow() {
		return (Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row6<Integer, String, String, Date, Integer, U_ADDRESS_TYPE> valuesRow() {
		return (Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field5() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<U_ADDRESS_TYPE> field6() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getFIRST_NAME();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getLAST_NAME();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value4() {
		return getDATE_OF_BIRTH();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value5() {
		return getYEAR_OF_BIRTH();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value6() {
		return getADDRESS();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value1(Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value2(String value) {
		setFIRST_NAME(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value3(String value) {
		setLAST_NAME(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value4(Date value) {
		setDATE_OF_BIRTH(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value5(Integer value) {
		setYEAR_OF_BIRTH(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR value6(U_ADDRESS_TYPE value) {
		setADDRESS(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_AUTHOR values(Integer value1, String value2, String value3, Date value4, Integer value5, U_ADDRESS_TYPE value6) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(V_AUTHOR_INTERFACE from) {
		setID(from.getID());
		setFIRST_NAME(from.getFIRST_NAME());
		setLAST_NAME(from.getLAST_NAME());
		setDATE_OF_BIRTH(from.getDATE_OF_BIRTH());
		setYEAR_OF_BIRTH(from.getYEAR_OF_BIRTH());
		setADDRESS(from.getADDRESS());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends V_AUTHOR_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached V_AUTHOR
	 */
	public V_AUTHOR() {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR);
	}

	/**
	 * Create a detached, initialised V_AUTHOR
	 */
	public V_AUTHOR(Integer ID, String FIRST_NAME, String LAST_NAME, Date DATE_OF_BIRTH, Integer YEAR_OF_BIRTH, U_ADDRESS_TYPE ADDRESS) {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_AUTHOR.V_AUTHOR);

		setValue(0, ID);
		setValue(1, FIRST_NAME);
		setValue(2, LAST_NAME);
		setValue(3, DATE_OF_BIRTH);
		setValue(4, YEAR_OF_BIRTH);
		setValue(5, ADDRESS);
	}
}
