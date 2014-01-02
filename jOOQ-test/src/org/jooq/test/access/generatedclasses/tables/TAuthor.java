/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthor extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = -2145014484;

	/**
	 * The singleton instance of <code>t_author</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.access.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>t_author.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>t_author.first_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>t_author.last_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), this);

	/**
	 * The column <code>t_author.date_of_birth</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>t_author.year_of_birth</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>t_author.address</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(200), this);

	/**
	 * Create a <code>t_author</code> table reference
	 */
	public TAuthor() {
		super("t_author", org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>t_author</code> table reference
	 */
	public TAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.access.generatedclasses.tables.TAuthor.T_AUTHOR);
	}

	private TAuthor(java.lang.String alias, org.jooq.Table<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord> aliased) {
		super(alias, org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, aliased);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord> getPrimaryKey() {
		return org.jooq.test.access.generatedclasses.Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.access.generatedclasses.Keys.PK_T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.access.generatedclasses.tables.TAuthor as(java.lang.String alias) {
		return new org.jooq.test.access.generatedclasses.tables.TAuthor(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.access.generatedclasses.tables.TAuthor rename(java.lang.String name) {
		return new org.jooq.test.access.generatedclasses.tables.TAuthor(name, null);
	}
}
