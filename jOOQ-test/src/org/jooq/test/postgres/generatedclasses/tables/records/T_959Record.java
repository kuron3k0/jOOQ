/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_959Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_959Record> implements org.jooq.Record1<org.jooq.test.postgres.generatedclasses.enums.U_959> {

	private static final long serialVersionUID = 2007996428;

	/**
	 * Setter for <code>public.t_959.java_keywords</code>. 
	 */
	public void setJavaKeywords(org.jooq.test.postgres.generatedclasses.enums.U_959 value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.t_959.java_keywords</code>. 
	 */
	public org.jooq.test.postgres.generatedclasses.enums.U_959 getJavaKeywords() {
		return (org.jooq.test.postgres.generatedclasses.enums.U_959) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<org.jooq.test.postgres.generatedclasses.enums.U_959> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<org.jooq.test.postgres.generatedclasses.enums.U_959> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.postgres.generatedclasses.enums.U_959> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.T_959.T_959.JAVA_KEYWORDS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.enums.U_959 value1() {
		return getJavaKeywords();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_959Record
	 */
	public T_959Record() {
		super(org.jooq.test.postgres.generatedclasses.tables.T_959.T_959);
	}
}
