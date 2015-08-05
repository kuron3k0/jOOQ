/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.test.hsqldb.generatedclasses.Sequences;
import org.jooq.test.hsqldb.generatedclasses.tables.BigDecimal;
import org.jooq.test.hsqldb.generatedclasses.tables.Class;
import org.jooq.test.hsqldb.generatedclasses.tables.Connection;
import org.jooq.test.hsqldb.generatedclasses.tables.Integer;
import org.jooq.test.hsqldb.generatedclasses.tables.Long;
import org.jooq.test.hsqldb.generatedclasses.tables.Object;
import org.jooq.test.hsqldb.generatedclasses.tables.PreparedStatement;
import org.jooq.test.hsqldb.generatedclasses.tables.String;
import org.jooq.test.hsqldb.generatedclasses.tables.System;
import org.jooq.test.hsqldb.generatedclasses.tables.TArrays;
import org.jooq.test.hsqldb.generatedclasses.tables.TAuthor;
import org.jooq.test.hsqldb.generatedclasses.tables.TBook;
import org.jooq.test.hsqldb.generatedclasses.tables.TBookStore;
import org.jooq.test.hsqldb.generatedclasses.tables.TBookToBookStore;
import org.jooq.test.hsqldb.generatedclasses.tables.TBooleans;
import org.jooq.test.hsqldb.generatedclasses.tables.TDates;
import org.jooq.test.hsqldb.generatedclasses.tables.TExoticTypes;
import org.jooq.test.hsqldb.generatedclasses.tables.TIdentity;
import org.jooq.test.hsqldb.generatedclasses.tables.TIdentityPk;
import org.jooq.test.hsqldb.generatedclasses.tables.TLanguage;
import org.jooq.test.hsqldb.generatedclasses.tables.TTriggers;
import org.jooq.test.hsqldb.generatedclasses.tables.TUnsigned;
import org.jooq.test.hsqldb.generatedclasses.tables.T_2845CaseSensitivity;
import org.jooq.test.hsqldb.generatedclasses.tables.T_639NumbersTable;
import org.jooq.test.hsqldb.generatedclasses.tables.T_725LobTest;
import org.jooq.test.hsqldb.generatedclasses.tables.T_785;
import org.jooq.test.hsqldb.generatedclasses.tables.VAuthor;
import org.jooq.test.hsqldb.generatedclasses.tables.VBook;
import org.jooq.test.hsqldb.generatedclasses.tables.VLibrary;
import org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_2025;
import org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_71;
import org.jooq.test.hsqldb.generatedclasses.tables.XTestCase_85;
import org.jooq.test.hsqldb.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

	private static final long serialVersionUID = -516366175;

	/**
	 * The reference instance of <code>PUBLIC</code>
	 */
	public static final Public PUBLIC = new Public();

	/**
	 * No further instances allowed
	 */
	private Public() {
		super("PUBLIC");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			Sequences.S_AUTHOR_ID);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			BigDecimal.BIG_DECIMAL,
			Class.CLASS,
			Connection.CONNECTION,
			Integer.INTEGER,
			Long.LONG,
			Object.OBJECT,
			PreparedStatement.PREPARED_STATEMENT,
			String.STRING,
			System.SYSTEM,
			T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY,
			T_639NumbersTable.T_639_NUMBERS_TABLE,
			T_725LobTest.T_725_LOB_TEST,
			T_785.T_785,
			org.jooq.test.hsqldb.generatedclasses.tables.T_937.T_937,
			TArrays.T_ARRAYS,
			TAuthor.T_AUTHOR,
			TBook.T_BOOK,
			TBookStore.T_BOOK_STORE,
			TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			TBooleans.T_BOOLEANS,
			TDates.T_DATES,
			TExoticTypes.T_EXOTIC_TYPES,
			TIdentity.T_IDENTITY,
			TIdentityPk.T_IDENTITY_PK,
			TLanguage.T_LANGUAGE,
			TTriggers.T_TRIGGERS,
			TUnsigned.T_UNSIGNED,
			VAuthor.V_AUTHOR,
			VBook.V_BOOK,
			VLibrary.V_LIBRARY,
			XTestCase_2025.X_TEST_CASE_2025,
			XTestCase_64_69.X_TEST_CASE_64_69,
			XTestCase_71.X_TEST_CASE_71,
			XTestCase_85.X_TEST_CASE_85,
			XUnused.X_UNUSED);
	}
}
