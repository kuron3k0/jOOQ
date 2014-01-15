/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBook extends org.jooq.impl.TableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> {

	private static final long serialVersionUID = -1311844618;

	/**
	 * The singleton instance of <code>TEST.T_BOOK</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.TBook T_BOOK = new org.jooq.test.oracle.generatedclasses.test.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>TEST.T_BOOK.ID</code>. The book ID
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The book ID");

	/**
	 * The column <code>TEST.T_BOOK.AUTHOR_ID</code>. The author ID in entity 'author'
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The author ID in entity 'author'");

	/**
	 * The column <code>TEST.T_BOOK.CO_AUTHOR_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>TEST.T_BOOK.DETAILS_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>TEST.T_BOOK.TITLE</code>. The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "The book's title");

	/**
	 * The column <code>TEST.T_BOOK.PUBLISHED_IN</code>. The year the book was published in
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The year the book was published in");

	/**
	 * The column <code>TEST.T_BOOK.LANGUAGE_ID</code>. The language of the book
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "The language of the book");

	/**
	 * The column <code>TEST.T_BOOK.CONTENT_TEXT</code>. Some textual content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this, "Some textual content of the book");

	/**
	 * The column <code>TEST.T_BOOK.CONTENT_PDF</code>. Some binary content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this, "Some binary content of the book");

	/**
	 * The column <code>TEST.T_BOOK.REC_VERSION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.math.BigDecimal> REC_VERSION = createField("REC_VERSION", org.jooq.impl.SQLDataType.NUMERIC, this, "");

	/**
	 * The column <code>TEST.T_BOOK.REC_TIMESTAMP</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.sql.Timestamp> REC_TIMESTAMP = createField("REC_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * Create a <code>TEST.T_BOOK</code> table reference
	 */
	public TBook() {
		this("T_BOOK", null);
	}

	/**
	 * Create an aliased <code>TEST.T_BOOK</code> table reference
	 */
	public TBook(java.lang.String alias) {
		this(alias, org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK);
	}

	private TBook(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private TBook(java.lang.String alias, org.jooq.Table<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, aliased, parameters, "An entity holding books");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord> getPrimaryKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, ?>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.oracle.generatedclasses.test.Keys.FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.oracle.generatedclasses.test.Keys.FK_T_BOOK_LANGUAGE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.math.BigDecimal> getRecordVersion() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.REC_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.TBookRecord, java.sql.Timestamp> getRecordTimestamp() {
		return org.jooq.test.oracle.generatedclasses.test.tables.TBook.T_BOOK.REC_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.TBook as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TBook(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.TBook rename(java.lang.String name) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.TBook(name, null);
	}
}
