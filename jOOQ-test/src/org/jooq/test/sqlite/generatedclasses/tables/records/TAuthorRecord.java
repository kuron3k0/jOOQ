/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord> implements org.jooq.Record6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 465817701;

	/**
	 * Setter for <code>t_author.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>t_author.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>t_author.FIRST_NAME</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>t_author.FIRST_NAME</code>. 
	 */
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>t_author.LAST_NAME</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>t_author.LAST_NAME</code>. 
	 */
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>t_author.DATE_OF_BIRTH</code>. 
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>t_author.DATE_OF_BIRTH</code>. 
	 */
	public java.sql.Date getDateOfBirth() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>t_author.YEAR_OF_BIRTH</code>. 
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>t_author.YEAR_OF_BIRTH</code>. 
	 */
	public java.lang.Integer getYearOfBirth() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>t_author.ADDRESS</code>. 
	 */
	public void setAddress(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>t_author.ADDRESS</code>. 
	 */
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(5);
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
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlite.generatedclasses.tables.TAuthor.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.sqlite.generatedclasses.tables.TAuthor.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.sqlite.generatedclasses.tables.TAuthor.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return org.jooq.test.sqlite.generatedclasses.tables.TAuthor.DATE_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.sqlite.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.jooq.test.sqlite.generatedclasses.tables.TAuthor.ADDRESS;
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
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getDateOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getYearOfBirth();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getAddress();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.TAuthor.T_AUTHOR);
	}
}
