/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.VLibrary;


/**
 * VIEW
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VLibraryRecord extends TableRecordImpl<VLibraryRecord> implements Record2<String, String> {

	private static final long serialVersionUID = 1826896005;

	/**
	 * Setter for <code>test.v_library.AUTHOR</code>.
	 */
	public void setAuthor(String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test.v_library.AUTHOR</code>.
	 */
	public String getAuthor() {
		return (String) getValue(0);
	}

	/**
	 * Setter for <code>test.v_library.TITLE</code>. The book's title
	 */
	public void setTitle(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test.v_library.TITLE</code>. The book's title
	 */
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
	public Row2<String, String> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<String, String> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field1() {
		return VLibrary.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return VLibrary.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value1() {
		return getAuthor();
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
	public VLibraryRecord value1(String value) {
		setAuthor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VLibraryRecord value2(String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VLibraryRecord values(String value1, String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(VLibrary.V_LIBRARY);
	}

	/**
	 * Create a detached, initialised VLibraryRecord
	 */
	public VLibraryRecord(String author, String title) {
		super(VLibrary.V_LIBRARY);

		setValue(0, author);
		setValue(1, title);
	}
}
