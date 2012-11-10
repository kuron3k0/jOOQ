/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_book", schema = "public")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 896457213;

	/**
	 * Setter for <code>public.t_book.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * Getter for <code>public.t_book.id</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 32)
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.ID);
	}

	/**
	 * Setter for <code>public.t_book.author_id</code>. 
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord}
	 */
	public void setAuthorId(org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, value.getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID));
		}
	}

	/**
	 * Getter for <code>public.t_book.author_id</code>. 
	 */
	@javax.persistence.Column(name = "author_id", nullable = false, precision = 32)
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * Setter for <code>public.t_book.co_author_id</code>. 
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord}
	 */
	public void setCoAuthorId(org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, value.getValue(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID));
		}
	}

	/**
	 * Getter for <code>public.t_book.co_author_id</code>. 
	 */
	@javax.persistence.Column(name = "co_author_id", precision = 32)
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * Setter for <code>public.t_book.details_id</code>. 
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * Getter for <code>public.t_book.details_id</code>. 
	 */
	@javax.persistence.Column(name = "details_id", precision = 32)
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * Setter for <code>public.t_book.title</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * Getter for <code>public.t_book.title</code>. 
	 */
	@javax.persistence.Column(name = "title", nullable = false, length = 400)
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * Setter for <code>public.t_book.published_in</code>. 
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * Getter for <code>public.t_book.published_in</code>. 
	 */
	@javax.persistence.Column(name = "published_in", nullable = false, precision = 32)
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * Setter for <code>public.t_book.language_id</code>. 
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord}
	 */
	public void setLanguageId(org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord value) {
		if (value == null) {
			setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID, null);
		}
		else {
			setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID, value.getValue(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.ID));
		}
	}

	/**
	 * Getter for <code>public.t_book.language_id</code>. 
	 */
	@javax.persistence.Column(name = "language_id", nullable = false, precision = 32)
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * Setter for <code>public.t_book.content_text</code>. 
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * Getter for <code>public.t_book.content_text</code>. 
	 */
	@javax.persistence.Column(name = "content_text")
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * Setter for <code>public.t_book.content_pdf</code>. 
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * Getter for <code>public.t_book.content_pdf</code>. 
	 */
	@javax.persistence.Column(name = "content_pdf")
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	/**
	 * Setter for <code>public.t_book.status</code>. 
	 */
	public void setStatus(org.jooq.test.postgres.generatedclasses.enums.UBookStatus value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.STATUS, value);
	}

	/**
	 * Getter for <code>public.t_book.status</code>. 
	 */
	@javax.persistence.Column(name = "status")
	public org.jooq.test.postgres.generatedclasses.enums.UBookStatus getStatus() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.STATUS);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>public.t_book_to_book_store</code> referencing this <code>public.t_book</code>
	 */
	public org.jooq.Result<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.ID)))
			.fetch();
	}

	/**
	 * Fetch a <code>public.t_author</code> referenced by this <code>public.t_book</code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>public.t_author</code> referenced by this <code>public.t_book</code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.postgres.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * Fetch a <code>public.t_language</code> referenced by this <code>public.t_book</code>
	 */
	public org.jooq.test.postgres.generatedclasses.tables.records.TLanguageRecord fetchTLanguage() {
		return create()
			.selectFrom(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE)
			.where(org.jooq.test.postgres.generatedclasses.tables.TLanguage.T_LANGUAGE.ID.equal(getValue(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID)))
			.fetchOne();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TBook.T_BOOK);
	}
}
