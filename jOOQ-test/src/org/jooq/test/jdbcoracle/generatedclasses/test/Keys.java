/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>TEST</code> 
 * schema
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord> PK_T_ARRAYS = UniqueKeys0.PK_T_ARRAYS;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TAuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBookStoreRecord> PK_T_BOOK_STORE = UniqueKeys0.PK_T_BOOK_STORE;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> PK_T_BOOK_TO_BOOK_STORE = UniqueKeys0.PK_T_BOOK_TO_BOOK_STORE;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBooleansRecord> PK_T_BOOLEANS = UniqueKeys0.PK_T_BOOLEANS;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord> PK_T_DATES = UniqueKeys0.PK_T_DATES;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDirectoryRecord> PK_T_DIRECTORY = UniqueKeys0.PK_T_DIRECTORY;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TExoticTypesRecord> PK_T_EXOTIC_TYPES = UniqueKeys0.PK_T_EXOTIC_TYPES;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TLanguageRecord> PK_T_LANGUAGE = UniqueKeys0.PK_T_LANGUAGE;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TTriggersRecord> PK_T_TRIGGERS = UniqueKeys0.PK_T_TRIGGERS;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_2845CaseSensitivityRecord> PK_T_2845_CASE_SENSITIVITY = UniqueKeys0.PK_T_2845_CASE_SENSITIVITY;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = UniqueKeys0.PK_T_639_NUMBERS_TABLE;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = UniqueKeys0.PK_T_725_LOB_TEST;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = UniqueKeys0.PK_X_TEST_CASE_64_69;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_71Record> PK_X_TEST_CASE_71 = UniqueKeys0.PK_X_TEST_CASE_71;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record> PK_X_TEST_CASE_85 = UniqueKeys0.PK_X_TEST_CASE_85;
	public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XUnusedRecord> PK_X_UNUSED = UniqueKeys0.PK_X_UNUSED;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TArraysRecord> PK_T_ARRAYS = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.T_ARRAYS, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TArrays.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TAuthorRecord> PK_T_AUTHOR = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TAuthor.T_AUTHOR, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TAuthor.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBookRecord> PK_T_BOOK = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.T_BOOK, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBook.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBookStoreRecord> PK_T_BOOK_STORE = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookStore.T_BOOK_STORE, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookStore.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBookToBookStoreRecord> PK_T_BOOK_TO_BOOK_STORE = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookToBookStore.BOOK_STORE_NAME, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBookToBookStore.BOOK_ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TBooleansRecord> PK_T_BOOLEANS = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBooleans.T_BOOLEANS, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TBooleans.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDatesRecord> PK_T_DATES = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TDates.T_DATES, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TDates.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TDirectoryRecord> PK_T_DIRECTORY = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TDirectory.T_DIRECTORY, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TDirectory.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TExoticTypesRecord> PK_T_EXOTIC_TYPES = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TExoticTypes.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TLanguageRecord> PK_T_LANGUAGE = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TLanguage.T_LANGUAGE, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TLanguage.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TTriggersRecord> PK_T_TRIGGERS = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.TTriggers.T_TRIGGERS, org.jooq.test.jdbcoracle.generatedclasses.test.tables.TTriggers.ID_GENERATED);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_2845CaseSensitivityRecord> PK_T_2845_CASE_SENSITIVITY = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY, org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_2845CaseSensitivity.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_639NumbersTable.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.jdbcoracle.generatedclasses.test.tables.T_725LobTest.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_64_69.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_71Record> PK_X_TEST_CASE_71 = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_71.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XTestCase_85Record> PK_X_TEST_CASE_85 = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.jdbcoracle.generatedclasses.test.tables.XTestCase_85.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.XUnusedRecord> PK_X_UNUSED = createUniqueKey(org.jooq.test.jdbcoracle.generatedclasses.test.tables.XUnused.X_UNUSED, org.jooq.test.jdbcoracle.generatedclasses.test.tables.XUnused.ID, org.jooq.test.jdbcoracle.generatedclasses.test.tables.XUnused.NAME);
	}
}
