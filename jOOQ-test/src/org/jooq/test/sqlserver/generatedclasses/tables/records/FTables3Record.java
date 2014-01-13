/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FTables3Record extends org.jooq.impl.TableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.FTables3Record> implements org.jooq.Record1<java.lang.String> {

	private static final long serialVersionUID = 2028463990;

	/**
	 * Setter for <code>dbo.f_tables3.column_value</code>. 
	 */
	public void setColumnValue(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>dbo.f_tables3.column_value</code>. 
	 */
	public java.lang.String getColumnValue() {
		return (java.lang.String) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return (org.jooq.Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return (org.jooq.Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.sqlserver.generatedclasses.tables.FTables3.F_TABLES3.COLUMN_VALUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getColumnValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FTables3Record value1(java.lang.String value) {
		setColumnValue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FTables3Record values(java.lang.String value1) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FTables3Record
	 */
	public FTables3Record() {
		super(org.jooq.test.sqlserver.generatedclasses.tables.FTables3.F_TABLES3);
	}

	/**
	 * Create a detached, initialised FTables3Record
	 */
	public FTables3Record(java.lang.String columnValue) {
		super(org.jooq.test.sqlserver.generatedclasses.tables.FTables3.F_TABLES3);

		setValue(0, columnValue);
	}
}
