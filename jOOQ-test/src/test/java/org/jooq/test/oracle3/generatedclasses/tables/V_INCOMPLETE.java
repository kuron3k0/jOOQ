/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;


import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class V_INCOMPLETE extends TableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE> implements Cloneable {

	private static final long serialVersionUID = 1705127046;

	/**
	 * The reference instance of <code>V_INCOMPLETE</code>
	 */
	public static final V_INCOMPLETE V_INCOMPLETE = new V_INCOMPLETE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE.class;
	}

	/**
	 * The column <code>V_INCOMPLETE.ID</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> ID = createField("ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.AUTHOR_ID</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.CO_AUTHOR_ID</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.DETAILS_ID</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.TITLE</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> TITLE = createField("TITLE", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.PUBLISHED_IN</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.LANGUAGE_ID</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.CONTENT_TEXT</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.CONTENT_PDF</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.REC_VERSION</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> REC_VERSION = createField("REC_VERSION", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * The column <code>V_INCOMPLETE.REC_TIMESTAMP</code>.
	 */
	public final TableField<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE, Object> REC_TIMESTAMP = createField("REC_TIMESTAMP", org.jooq.impl.DefaultDataType.getDefaultDataType("UNDEFINED"), this, "");

	/**
	 * Create a <code>V_INCOMPLETE</code> table reference
	 */
	public V_INCOMPLETE() {
		this("V_INCOMPLETE", null);
	}

	/**
	 * Create an aliased <code>V_INCOMPLETE</code> table reference
	 */
	public V_INCOMPLETE(String alias) {
		this(alias, V_INCOMPLETE);
	}

	private V_INCOMPLETE(String alias, Table<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE> aliased) {
		this(alias, aliased, null);
	}

	private V_INCOMPLETE(String alias, Table<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE as(String alias) {
		return new V_INCOMPLETE(alias, this);
	}

	/**
	 * Rename this table
	 */
	public V_INCOMPLETE rename(String name) {
		return new V_INCOMPLETE(name, null);
	}
}
