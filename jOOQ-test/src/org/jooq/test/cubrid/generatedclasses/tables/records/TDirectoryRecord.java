/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDirectoryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TDirectoryRecord> implements org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 1798906023;

	/**
	 * Setter for <code>t_directory.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>t_directory.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>t_directory.parent_id</code>. 
	 */
	public void setParentId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>t_directory.parent_id</code>. 
	 */
	public java.lang.Integer getParentId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>t_directory.is_directory</code>. 
	 */
	public void setIsDirectory(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>t_directory.is_directory</code>. 
	 */
	public java.lang.Integer getIsDirectory() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>t_directory.name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>t_directory.name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.cubrid.generatedclasses.tables.TDirectory.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.cubrid.generatedclasses.tables.TDirectory.PARENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.cubrid.generatedclasses.tables.TDirectory.IS_DIRECTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.test.cubrid.generatedclasses.tables.TDirectory.NAME;
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
		return getParentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getIsDirectory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDirectoryRecord
	 */
	public TDirectoryRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.TDirectory.T_DIRECTORY);
	}
}
