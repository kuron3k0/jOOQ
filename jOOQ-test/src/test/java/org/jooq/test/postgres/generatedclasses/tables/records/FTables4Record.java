/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.FTables4;
import org.jooq.test.postgres.generatedclasses.tables.interfaces.IFTables4;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FTables4Record extends TableRecordImpl<FTables4Record> implements Record2<Integer, String>, IFTables4 {

	private static final long serialVersionUID = -1826946053;

	/**
	 * Setter for <code>public.f_tables4.id</code>.
	 */
	public FTables4Record setId(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.f_tables4.id</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.f_tables4.title</code>.
	 */
	public FTables4Record setTitle(String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.f_tables4.title</code>.
	 */
	@Override
	public String getTitle() {
		return (String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return FTables4.F_TABLES4.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return FTables4.F_TABLES4.TITLE;
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
	public String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FTables4Record value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FTables4Record value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FTables4Record values(Integer value1, String value2) {
		value1(value1);
		value2(value2);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FTables4Record
	 */
	public FTables4Record() {
		super(FTables4.F_TABLES4);
	}

	/**
	 * Create a detached, initialised FTables4Record
	 */
	public FTables4Record(Integer id, String title) {
		super(FTables4.F_TABLES4);

		setValue(0, id);
		setValue(1, title);
	}
}
