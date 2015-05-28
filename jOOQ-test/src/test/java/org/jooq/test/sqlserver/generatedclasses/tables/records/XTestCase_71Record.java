/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_71;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "x_test_case_71", schema = "dbo")
public class XTestCase_71Record extends UpdatableRecordImpl<XTestCase_71Record> implements Record2<Integer, Integer> {

	private static final long serialVersionUID = -414990370;

	/**
	 * Setter for <code>dbo.x_test_case_71.id</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.x_test_case_71.id</code>.
	 */
	@Id
	@Column(name = "id", unique = true, nullable = false, precision = 10)
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>dbo.x_test_case_71.test_case_64_69_id</code>.
	 */
	public void setTestCase_64_69Id(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>dbo.x_test_case_71.test_case_64_69_id</code>.
	 */
	@Column(name = "test_case_64_69_id", precision = 10)
	public Integer getTestCase_64_69Id() {
		return (Integer) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, Integer> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return XTestCase_71.X_TEST_CASE_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getTestCase_64_69Id();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_71Record value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_71Record value2(Integer value) {
		setTestCase_64_69Id(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_71Record values(Integer value1, Integer value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(XTestCase_71.X_TEST_CASE_71);
	}

	/**
	 * Create a detached, initialised XTestCase_71Record
	 */
	public XTestCase_71Record(Integer id, Integer testCase_64_69Id) {
		super(XTestCase_71.X_TEST_CASE_71);

		setValue(0, id);
		setValue(1, testCase_64_69Id);
	}
}
