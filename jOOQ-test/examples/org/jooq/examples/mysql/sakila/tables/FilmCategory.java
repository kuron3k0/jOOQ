/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FilmCategory extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> {

	private static final long serialVersionUID = 787424127;

	/**
	 * The singleton instance of <code>sakila.film_category</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.FilmCategory FILM_CATEGORY = new org.jooq.examples.mysql.sakila.tables.FilmCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord.class;
	}

	/**
	 * The column <code>sakila.film_category.film_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>sakila.film_category.category_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord, java.lang.Byte> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The column <code>sakila.film_category.last_update</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>sakila.film_category</code> table reference
	 */
	public FilmCategory() {
		super("film_category", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.film_category</code> table reference
	 */
	public FilmCategory(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.FilmCategory.FILM_CATEGORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord> getPrimaryKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_FILM_CATEGORY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_CATEGORY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmCategoryRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_FILM_CATEGORY_FILM, org.jooq.examples.mysql.sakila.Keys.FK_FILM_CATEGORY_CATEGORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.FilmCategory as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.FilmCategory(alias);
	}
}
