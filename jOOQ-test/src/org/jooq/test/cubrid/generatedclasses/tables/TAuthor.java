/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = -10656663;

	/**
	 * The singleton instance of <code>t_author</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.cubrid.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>t_author.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>t_author.first_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("first_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * The column <code>t_author.last_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("last_name", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_AUTHOR);

	/**
	 * The column <code>t_author.date_of_birth</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("date_of_birth", org.jooq.impl.SQLDataType.DATE, T_AUTHOR);

	/**
	 * The column <code>t_author.year_of_birth</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("year_of_birth", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * The column <code>t_author.address</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR.length(200), T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("t_author", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord> getPrimaryKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.T_AUTHOR__PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_AUTHOR__PK_T_AUTHOR);
	}
}
