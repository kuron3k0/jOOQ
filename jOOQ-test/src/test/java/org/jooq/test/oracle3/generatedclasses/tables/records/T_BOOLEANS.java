/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOLEANS_INTERFACE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_BOOLEANS")
public class T_BOOLEANS extends UpdatableRecordImpl<T_BOOLEANS> implements Cloneable, Record11<Integer, Integer, String, String, String, String, String, String, String, String, Integer>, T_BOOLEANS_INTERFACE {

	private static final long serialVersionUID = 1040985174;

	/**
	 * Setter for <code>T_BOOLEANS.ID</code>.
	 */
	@Override
	public void setID(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public Integer getID() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>T_BOOLEANS.ONE_ZERO</code>.
	 */
	@Override
	public void setONE_ZERO(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.ONE_ZERO</code>.
	 */
	@Column(name = "ONE_ZERO", precision = 7)
	@Override
	public Integer getONE_ZERO() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>T_BOOLEANS.TRUE_FALSE_LC</code>.
	 */
	@Override
	public void setTRUE_FALSE_LC(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.TRUE_FALSE_LC</code>.
	 */
	@Column(name = "TRUE_FALSE_LC", length = 5)
	@Override
	public String getTRUE_FALSE_LC() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>T_BOOLEANS.TRUE_FALSE_UC</code>.
	 */
	@Override
	public void setTRUE_FALSE_UC(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.TRUE_FALSE_UC</code>.
	 */
	@Column(name = "TRUE_FALSE_UC", length = 5)
	@Override
	public String getTRUE_FALSE_UC() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>T_BOOLEANS.YES_NO_LC</code>.
	 */
	@Override
	public void setYES_NO_LC(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.YES_NO_LC</code>.
	 */
	@Column(name = "YES_NO_LC", length = 3)
	@Override
	public String getYES_NO_LC() {
		return (String) getValue(4);
	}

	/**
	 * Setter for <code>T_BOOLEANS.YES_NO_UC</code>.
	 */
	@Override
	public void setYES_NO_UC(String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.YES_NO_UC</code>.
	 */
	@Column(name = "YES_NO_UC", length = 3)
	@Override
	public String getYES_NO_UC() {
		return (String) getValue(5);
	}

	/**
	 * Setter for <code>T_BOOLEANS.Y_N_LC</code>.
	 */
	@Override
	public void setY_N_LC(String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.Y_N_LC</code>.
	 */
	@Column(name = "Y_N_LC", length = 1)
	@Override
	public String getY_N_LC() {
		return (String) getValue(6);
	}

	/**
	 * Setter for <code>T_BOOLEANS.Y_N_UC</code>.
	 */
	@Override
	public void setY_N_UC(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.Y_N_UC</code>.
	 */
	@Column(name = "Y_N_UC", length = 1)
	@Override
	public String getY_N_UC() {
		return (String) getValue(7);
	}

	/**
	 * Setter for <code>T_BOOLEANS.VC_BOOLEAN</code>.
	 */
	@Override
	public void setVC_BOOLEAN(String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.VC_BOOLEAN</code>.
	 */
	@Column(name = "VC_BOOLEAN", length = 1)
	@Override
	public String getVC_BOOLEAN() {
		return (String) getValue(8);
	}

	/**
	 * Setter for <code>T_BOOLEANS.C_BOOLEAN</code>.
	 */
	@Override
	public void setC_BOOLEAN(String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.C_BOOLEAN</code>.
	 */
	@Column(name = "C_BOOLEAN", length = 1)
	@Override
	public String getC_BOOLEAN() {
		return (String) getValue(9);
	}

	/**
	 * Setter for <code>T_BOOLEANS.N_BOOLEAN</code>.
	 */
	@Override
	public void setN_BOOLEAN(Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>T_BOOLEANS.N_BOOLEAN</code>.
	 */
	@Column(name = "N_BOOLEAN", precision = 7)
	@Override
	public Integer getN_BOOLEAN() {
		return (Integer) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, String, String, String, String, String, String, String, String, Integer> fieldsRow() {
		return (Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row11<Integer, Integer, String, String, String, String, String, String, String, String, Integer> valuesRow() {
		return (Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.ONE_ZERO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.TRUE_FALSE_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.TRUE_FALSE_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.YES_NO_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field6() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.YES_NO_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field7() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.Y_N_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.Y_N_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field9() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.VC_BOOLEAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field10() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.C_BOOLEAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field11() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS.N_BOOLEAN;
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
	public Integer value2() {
		return getONE_ZERO();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getTRUE_FALSE_LC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getTRUE_FALSE_UC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getYES_NO_LC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value6() {
		return getYES_NO_UC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value7() {
		return getY_N_LC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getY_N_UC();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value9() {
		return getVC_BOOLEAN();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value10() {
		return getC_BOOLEAN();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value11() {
		return getN_BOOLEAN();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value1(Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value2(Integer value) {
		setONE_ZERO(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value3(String value) {
		setTRUE_FALSE_LC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value4(String value) {
		setTRUE_FALSE_UC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value5(String value) {
		setYES_NO_LC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value6(String value) {
		setYES_NO_UC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value7(String value) {
		setY_N_LC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value8(String value) {
		setY_N_UC(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value9(String value) {
		setVC_BOOLEAN(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value10(String value) {
		setC_BOOLEAN(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS value11(Integer value) {
		setN_BOOLEAN(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_BOOLEANS values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, Integer value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(T_BOOLEANS_INTERFACE from) {
		setID(from.getID());
		setONE_ZERO(from.getONE_ZERO());
		setTRUE_FALSE_LC(from.getTRUE_FALSE_LC());
		setTRUE_FALSE_UC(from.getTRUE_FALSE_UC());
		setYES_NO_LC(from.getYES_NO_LC());
		setYES_NO_UC(from.getYES_NO_UC());
		setY_N_LC(from.getY_N_LC());
		setY_N_UC(from.getY_N_UC());
		setVC_BOOLEAN(from.getVC_BOOLEAN());
		setC_BOOLEAN(from.getC_BOOLEAN());
		setN_BOOLEAN(from.getN_BOOLEAN());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends T_BOOLEANS_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_BOOLEANS
	 */
	public T_BOOLEANS() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS);
	}

	/**
	 * Create a detached, initialised T_BOOLEANS
	 */
	public T_BOOLEANS(Integer ID, Integer ONE_ZERO, String TRUE_FALSE_LC, String TRUE_FALSE_UC, String YES_NO_LC, String YES_NO_UC, String Y_N_LC, String Y_N_UC, String VC_BOOLEAN, String C_BOOLEAN, Integer N_BOOLEAN) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_BOOLEANS.T_BOOLEANS);

		setValue(0, ID);
		setValue(1, ONE_ZERO);
		setValue(2, TRUE_FALSE_LC);
		setValue(3, TRUE_FALSE_UC);
		setValue(4, YES_NO_LC);
		setValue(5, YES_NO_UC);
		setValue(6, Y_N_LC);
		setValue(7, Y_N_UC);
		setValue(8, VC_BOOLEAN);
		setValue(9, C_BOOLEAN);
		setValue(10, N_BOOLEAN);
	}
}
