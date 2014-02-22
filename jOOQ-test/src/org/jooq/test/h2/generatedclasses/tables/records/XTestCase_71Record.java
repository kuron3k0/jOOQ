/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.h2.generatedclasses.tables.records.XTestCase_71Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Short>, org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71 {

	private static final long serialVersionUID = 401768782;

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_71.ID</code>.
	 */
	@Override
	public XTestCase_71Record setId(java.lang.Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_71.ID</code>.
	 */
	@Override
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>.
	 */
	@Override
	public XTestCase_71Record setTestCase_64_69Id(java.lang.Short value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>.
	 */
	@Override
	public java.lang.Short getTestCase_64_69Id() {
		return (java.lang.Short) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.h2.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getTestCase_64_69Id();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_71Record value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_71Record value2(java.lang.Short value) {
		setTestCase_64_69Id(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public XTestCase_71Record values(java.lang.Integer value1, java.lang.Short value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71 from) {
		setId(from.getId());
		setTestCase_64_69Id(from.getTestCase_64_69Id());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	/**
	 * Create a detached, initialised XTestCase_71Record
	 */
	public XTestCase_71Record(java.lang.Integer id, java.lang.Short testCase_64_69Id) {
		super(org.jooq.test.h2.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);

		setValue(0, id);
		setValue(1, testCase_64_69Id);
	}
}
