/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_71", schema = "TEST")
public class X_TEST_CASE_71 extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_71_INTERFACE {

	private static final long serialVersionUID = -1028539085;

	/**
	 * The table column <code>TEST.X_TEST_CASE_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.ID, value);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_71.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.ID);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES TEST.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	@Override
	public void setTEST_CASE_64_69_ID(java.lang.Short value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES TEST.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "TEST_CASE_64_69_ID", precision = 4)
	@Override
	public java.lang.Short getTEST_CASE_64_69_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69 
	 * X_TEST_CASE_64_69}
	 */
	public void setTEST_CASE_64_69_ID(org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69 value) {
		if (value == null) {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, value.getValueAsShort(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID));
		}
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_71
	 * FOREIGN KEY (TEST_CASE_64_69_ID)
	 * REFERENCES TEST.X_TEST_CASE_64_69 (ID)
	 * </pre></code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69 fetchX_TEST_CASE_64_69() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69)
			.where(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID.equal(getValueAsInteger(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID)))
			.fetchOne();
	}

	/**
	 * Create a detached X_TEST_CASE_71
	 */
	public X_TEST_CASE_71() {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71);
	}
}
