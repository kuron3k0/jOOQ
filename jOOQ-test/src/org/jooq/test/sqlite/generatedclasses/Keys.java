/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code></code> 
 * schema
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = UniqueKeys0.PK_T_639_NUMBERS_TABLE;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = UniqueKeys0.PK_T_725_LOB_TEST;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_1Record> PK_T_986_1 = UniqueKeys0.PK_T_986_1;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_2Record> PK_T_986_2 = UniqueKeys0.PK_T_986_2;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord> PK_T_AUTHOR = UniqueKeys0.PK_T_AUTHOR;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> PK_T_BOOK = UniqueKeys0.PK_T_BOOK;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> PK_T_BOOK_STORE = UniqueKeys0.PK_T_BOOK_STORE;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord> PK_T_BOOK_TO_BOOK_STORE = UniqueKeys0.PK_T_BOOK_TO_BOOK_STORE;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBooleansRecord> PK_T_BOOLEANS = UniqueKeys0.PK_T_BOOLEANS;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord> PK_T_DATES = UniqueKeys0.PK_T_DATES;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TExoticTypesRecord> PK_T_EXOTIC_TYPES = UniqueKeys0.PK_T_EXOTIC_TYPES;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord> PK_T_LANGUAGE = UniqueKeys0.PK_T_LANGUAGE;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord> PK_T_TRIGGERS = UniqueKeys0.PK_T_TRIGGERS;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = UniqueKeys0.PK_X_TEST_CASE_64_69;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> PK_X_TEST_CASE_71 = UniqueKeys0.PK_X_TEST_CASE_71;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> PK_X_TEST_CASE_85 = UniqueKeys0.PK_X_TEST_CASE_85;
	public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> PK_X_UNUSED = UniqueKeys0.PK_X_UNUSED;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_1Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_T_986_1_X_UNUSED_1 = ForeignKeys0.FK_T_986_1_X_UNUSED_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_2Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_T_986_2_X_UNUSED_1 = ForeignKeys0.FK_T_986_2_X_UNUSED_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord> FK_T_BOOK_T_AUTHOR_2 = ForeignKeys0.FK_T_BOOK_T_AUTHOR_2;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord> FK_T_BOOK_T_AUTHOR_1 = ForeignKeys0.FK_T_BOOK_T_AUTHOR_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord> FK_T_BOOK_T_LANGUAGE_1 = ForeignKeys0.FK_T_BOOK_T_LANGUAGE_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> FK_T_BOOK_TO_BOOK_STORE_T_BOOK_STORE_1 = ForeignKeys0.FK_T_BOOK_TO_BOOK_STORE_T_BOOK_STORE_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> FK_T_BOOK_TO_BOOK_STORE_T_BOOK_1 = ForeignKeys0.FK_T_BOOK_TO_BOOK_STORE_T_BOOK_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_2025_X_UNUSED_1 = ForeignKeys0.FK_X_TEST_CASE_2025_X_UNUSED_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> FK_X_TEST_CASE_2025_X_TEST_CASE_71_1 = ForeignKeys0.FK_X_TEST_CASE_2025_X_TEST_CASE_71_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> FK_X_TEST_CASE_2025_X_TEST_CASE_85_1 = ForeignKeys0.FK_X_TEST_CASE_2025_X_TEST_CASE_85_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69_X_UNUSED_1 = ForeignKeys0.FK_X_TEST_CASE_64_69_X_UNUSED_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69_X_UNUSED_2 = ForeignKeys0.FK_X_TEST_CASE_64_69_X_UNUSED_2;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record> FK_X_TEST_CASE_71_X_TEST_CASE_64_69_1 = ForeignKeys0.FK_X_TEST_CASE_71_X_TEST_CASE_64_69_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_85_X_UNUSED_1 = ForeignKeys0.FK_X_TEST_CASE_85_X_UNUSED_1;
	public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_UNUSED_X_UNUSED_1 = ForeignKeys0.FK_X_UNUSED_X_UNUSED_1;

	/**
	 * No further instances allowed
	 */
	private Keys() {}

	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_639NumbersTableRecord> PK_T_639_NUMBERS_TABLE = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE, org.jooq.test.sqlite.generatedclasses.tables.T_639NumbersTable.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord> PK_T_725_LOB_TEST = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.sqlite.generatedclasses.tables.T_725LobTest.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_1Record> PK_T_986_1 = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.T_986_1.T_986_1, org.jooq.test.sqlite.generatedclasses.tables.T_986_1.REF);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_2Record> PK_T_986_2 = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.T_986_2.T_986_2, org.jooq.test.sqlite.generatedclasses.tables.T_986_2.REF);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord> PK_T_AUTHOR = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TAuthor.T_AUTHOR, org.jooq.test.sqlite.generatedclasses.tables.TAuthor.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> PK_T_BOOK = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sqlite.generatedclasses.tables.TBook.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> PK_T_BOOK_STORE = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBookStore.T_BOOK_STORE, org.jooq.test.sqlite.generatedclasses.tables.TBookStore.NAME);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord> PK_T_BOOK_TO_BOOK_STORE = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME, org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.BOOK_ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBooleansRecord> PK_T_BOOLEANS = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TBooleans.T_BOOLEANS, org.jooq.test.sqlite.generatedclasses.tables.TBooleans.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TDatesRecord> PK_T_DATES = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TDates.T_DATES, org.jooq.test.sqlite.generatedclasses.tables.TDates.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TExoticTypesRecord> PK_T_EXOTIC_TYPES = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.sqlite.generatedclasses.tables.TExoticTypes.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord> PK_T_LANGUAGE = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TLanguage.T_LANGUAGE, org.jooq.test.sqlite.generatedclasses.tables.TLanguage.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.TTriggersRecord> PK_T_TRIGGERS = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.TTriggers.T_TRIGGERS, org.jooq.test.sqlite.generatedclasses.tables.TTriggers.ID_GENERATED);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record> PK_X_TEST_CASE_64_69 = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> PK_X_TEST_CASE_71 = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> PK_X_TEST_CASE_85 = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.ID);
		public static final org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> PK_X_UNUSED = createUniqueKey(org.jooq.test.sqlite.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID, org.jooq.test.sqlite.generatedclasses.tables.XUnused.NAME);
	}

	private static class ForeignKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_1Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_T_986_1_X_UNUSED_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.T_986_1.T_986_1, org.jooq.test.sqlite.generatedclasses.tables.T_986_1.REF);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_2Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_T_986_2_X_UNUSED_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.T_986_2.T_986_2, org.jooq.test.sqlite.generatedclasses.tables.T_986_2.REF);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord> FK_T_BOOK_T_AUTHOR_2 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_AUTHOR, org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sqlite.generatedclasses.tables.TBook.AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TAuthorRecord> FK_T_BOOK_T_AUTHOR_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_AUTHOR, org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sqlite.generatedclasses.tables.TBook.CO_AUTHOR_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TLanguageRecord> FK_T_BOOK_T_LANGUAGE_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_LANGUAGE, org.jooq.test.sqlite.generatedclasses.tables.TBook.T_BOOK, org.jooq.test.sqlite.generatedclasses.tables.TBook.LANGUAGE_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> FK_T_BOOK_TO_BOOK_STORE_T_BOOK_STORE_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK_STORE, org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord, org.jooq.test.sqlite.generatedclasses.tables.records.TBookRecord> FK_T_BOOK_TO_BOOK_STORE_T_BOOK_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_BOOK, org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE, org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.BOOK_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_2025_X_UNUSED_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_2025.REF_ID, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_2025.REF_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> FK_X_TEST_CASE_2025_X_TEST_CASE_71_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_71, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_2025Record, org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record> FK_X_TEST_CASE_2025_X_TEST_CASE_85_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_85, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_2025.REF_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69_X_UNUSED_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_64_69_X_UNUSED_2 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_64_69.UNUSED_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record, org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_64_69Record> FK_X_TEST_CASE_71_X_TEST_CASE_64_69_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_TEST_CASE_64_69, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_TEST_CASE_85_X_UNUSED_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, org.jooq.test.sqlite.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME);
		public static final org.jooq.ForeignKey<org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord, org.jooq.test.sqlite.generatedclasses.tables.records.XUnusedRecord> FK_X_UNUSED_X_UNUSED_1 = createForeignKey(org.jooq.test.sqlite.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XUnused.X_UNUSED, org.jooq.test.sqlite.generatedclasses.tables.XUnused.ID_REF, org.jooq.test.sqlite.generatedclasses.tables.XUnused.NAME_REF);
	}
}
