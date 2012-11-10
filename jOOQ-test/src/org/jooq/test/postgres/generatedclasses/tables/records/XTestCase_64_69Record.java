/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "x_test_case_64_69", schema = "public")
public class XTestCase_64_69Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_64_69Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1275065155;

	/**
	 * Setter for <code>public.x_test_case_64_69.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID, value);
	}

	/**
	 * Getter for <code>public.x_test_case_64_69.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID);
	}

	/**
	 * Setter for <code>public.x_test_case_64_69.unused_id</code>. 
	 */
	public void setUnusedId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord}
	 */
	public void setUnusedId(org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord value) {
		if (value == null) {
			setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, null);
		}
		else {
			setValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID, value.getValue(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID));
		}
	}

	/**
	 * Getter for <code>public.x_test_case_64_69.unused_id</code>. 
	 */
	@javax.persistence.Column(name = "unused_id", precision = 32)
	public java.lang.Integer getUnusedId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>public.x_test_case_71</code> referencing this <code>public.x_test_case_64_69</code>
	 */
	public org.jooq.Result<org.jooq.test.postgres.generatedclasses.tables.records.XTestCase_71Record> fetchXTestCase_71List() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71)
			.where(org.jooq.test.postgres.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID, Short.class)))
			.fetch();
	}

	/**
	 * Fetch a <code>public.x_unused</code> referenced by this <code>public.x_test_case_64_69</code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.postgres.generatedclasses.tables.XUnused.X_UNUSED.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID)))
			.fetchOne();
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
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69.UNUSED_ID;
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
	public java.lang.Integer value2() {
		return getUnusedId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached XTestCase_64_69Record
	 */
	public XTestCase_64_69Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}
}
