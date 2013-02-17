/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TLanguage extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord> {

	private static final long serialVersionUID = 1887838542;

	/**
	 * The singleton instance of <code>t_language</code>
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.TLanguage T_LANGUAGE = new org.jooq.test.sqlite.generatedclasses.tables.TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord.class;
	}

	/**
	 * The column <code>t_language.cd</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord, java.lang.String> CD = createField("cd", org.jooq.impl.SQLDataType.CHAR.length(2), T_LANGUAGE);

	/**
	 * The column <code>t_language.description</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE);

	/**
	 * The column <code>t_language.description_english</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord, java.lang.String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE);

	/**
	 * The column <code>t_language.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_LANGUAGE);

	/**
	 * No further instances allowed
	 */
	private TLanguage() {
		super("t_language", org.jooq.test.sqlite.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord> getPrimaryKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_LANGUAGE);
	}
}
