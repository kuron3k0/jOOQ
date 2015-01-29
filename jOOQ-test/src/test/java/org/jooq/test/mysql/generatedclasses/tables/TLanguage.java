/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.mysql.generatedclasses.Keys;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.test.mysql.generatedclasses.tables.records.TLanguageRecord;


/**
 * An entity holding language master data
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguage extends TableImpl<TLanguageRecord> {

	private static final long serialVersionUID = -1053310667;

	/**
	 * The reference instance of <code>test.t_language</code>
	 */
	public static final TLanguage T_LANGUAGE = new TLanguage();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TLanguageRecord> getRecordType() {
		return TLanguageRecord.class;
	}

	/**
	 * The column <code>test.t_language.CD</code>. The language ISO code
	 */
	public static final TableField<TLanguageRecord, String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false), T_LANGUAGE, "The language ISO code");

	/**
	 * The column <code>test.t_language.DESCRIPTION</code>. The language description
	 */
	public static final TableField<TLanguageRecord, String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE, "The language description");

	/**
	 * The column <code>test.t_language.description_english</code>.
	 */
	public static final TableField<TLanguageRecord, String> DESCRIPTION_ENGLISH = createField("description_english", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_LANGUAGE, "");

	/**
	 * The column <code>test.t_language.ID</code>. The language ID
	 */
	public static final TableField<TLanguageRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_LANGUAGE, "The language ID");

	/**
	 * No further instances allowed
	 */
	private TLanguage() {
		this("t_language", null);
	}

	private TLanguage(String alias, Table<TLanguageRecord> aliased) {
		this(alias, aliased, null);
	}

	private TLanguage(String alias, Table<TLanguageRecord> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "An entity holding language master data");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TLanguageRecord> getPrimaryKey() {
		return Keys.KEY_T_LANGUAGE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TLanguageRecord>> getKeys() {
		return Arrays.<UniqueKey<TLanguageRecord>>asList(Keys.KEY_T_LANGUAGE_PRIMARY);
	}
}
