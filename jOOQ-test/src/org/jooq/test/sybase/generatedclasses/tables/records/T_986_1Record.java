/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_986_1Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.T_986_1Record> implements org.jooq.Record1<java.lang.Integer> {

	private static final long serialVersionUID = -1842860536;

	/**
	 * Setter for <code>DBA.t_986_1.REF</code>. 
	 */
	public void setRef(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>DBA.t_986_1.REF</code>. 
	 */
	public java.lang.Integer getRef() {
		return (java.lang.Integer) getValue(0);
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
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.Integer> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1.REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getRef();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_986_1Record value1(java.lang.Integer value) {
		setRef(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_986_1Record values(java.lang.Integer value1) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_986_1Record
	 */
	public T_986_1Record() {
		super(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1);
	}

	/**
	 * Create a detached, initialised T_986_1Record
	 */
	public T_986_1Record(java.lang.Integer ref) {
		super(org.jooq.test.sybase.generatedclasses.tables.T_986_1.T_986_1);

		setValue(0, ref);
	}
}
