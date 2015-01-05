/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;


import java.math.BigDecimal;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row;
import org.jooq.Row3;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_AUTHOR_TYPE_INTERFACE;
import org.jooq.test.oracle3.generatedclasses.udt.u_author_type.COUNT_BOOKS;
import org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_AUTHOR;
import org.jooq.test.oracle3.generatedclasses.udt.u_author_type.GET_BOOKS;
import org.jooq.test.oracle3.generatedclasses.udt.u_author_type.LOAD;
import org.jooq.test.oracle3.generatedclasses.udt.u_author_type.NEW_AUTHOR;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_AUTHOR_TYPE extends UDTRecordImpl<U_AUTHOR_TYPE> implements Cloneable, Record3<Integer, String, String>, U_AUTHOR_TYPE_INTERFACE {

	private static final long serialVersionUID = -1270256311;

	/**
	 * Setter for <code>U_AUTHOR_TYPE.ID</code>.
	 */
	@Override
	public void setID(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>U_AUTHOR_TYPE.ID</code>.
	 */
	@Override
	public Integer getID() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>U_AUTHOR_TYPE.FIRST_NAME</code>.
	 */
	@Override
	public void setFIRST_NAME(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>U_AUTHOR_TYPE.FIRST_NAME</code>.
	 */
	@Override
	public String getFIRST_NAME() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>U_AUTHOR_TYPE.LAST_NAME</code>.
	 */
	@Override
	public void setLAST_NAME(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>U_AUTHOR_TYPE.LAST_NAME</code>.
	 */
	@Override
	public String getLAST_NAME() {
		return (String) getValue(2);
	}

	/**
	 * Call <code>U_AUTHOR_TYPE.COUNT_BOOKS</code>
	 */
	public BigDecimal call_COUNT_BOOKS() {
		COUNT_BOOKS f = new COUNT_BOOKS();
		f.setSELF(this);

		f.execute(configuration());
		return f.getReturnValue();
	}

	/**
	 * Call <code>U_AUTHOR_TYPE.GET_AUTHOR</code>
	 */
	public static org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE call_GET_AUTHOR(Configuration configuration, Number P_ID) {
		GET_AUTHOR f = new GET_AUTHOR();
		f.setP_ID(P_ID);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Call <code>U_AUTHOR_TYPE.GET_BOOKS</code>
	 */
	public GET_BOOKS call_GET_BOOKS() {
		GET_BOOKS p = new GET_BOOKS();
		p.setSELF(this);

		p.execute(configuration());
		from((U_AUTHOR_TYPE_INTERFACE) p.getSELF());
		return p;
	}

	/**
	 * Call <code>U_AUTHOR_TYPE.LOAD</code>
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE call_LOAD() {
		LOAD p = new LOAD();
		p.setSELF(this);

		p.execute(configuration());
		from((U_AUTHOR_TYPE_INTERFACE) p.getSELF());
		return p.getSELF();
	}

	/**
	 * Call <code>U_AUTHOR_TYPE.NEW_AUTHOR</code>
	 */
	public static org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE call_NEW_AUTHOR(Configuration configuration, Number P_ID, String P_FIRST_NAME, String P_LAST_NAME) {
		NEW_AUTHOR p = new NEW_AUTHOR();
		p.setP_ID(P_ID);
		p.setP_FIRST_NAME(P_FIRST_NAME);
		p.setP_LAST_NAME(P_LAST_NAME);

		p.execute(configuration);
		return p.getP_AUTHOR();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, String> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, String, String> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.LAST_NAME;
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
	public U_AUTHOR_TYPE value1(Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_AUTHOR_TYPE value2(String value) {
		setFIRST_NAME(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_AUTHOR_TYPE value3(String value) {
		setLAST_NAME(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_AUTHOR_TYPE values(Integer value1, String value2, String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(U_AUTHOR_TYPE_INTERFACE from) {
		setID(from.getID());
		setFIRST_NAME(from.getFIRST_NAME());
		setLAST_NAME(from.getLAST_NAME());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends U_AUTHOR_TYPE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_AUTHOR_TYPE
	 */
	public U_AUTHOR_TYPE() {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE);
	}

	/**
	 * Create a detached, initialised U_AUTHOR_TYPE
	 */
	public U_AUTHOR_TYPE(Integer ID, String FIRST_NAME, String LAST_NAME) {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE);

		setValue(0, ID);
		setValue(1, FIRST_NAME);
		setValue(2, LAST_NAME);
	}
}
