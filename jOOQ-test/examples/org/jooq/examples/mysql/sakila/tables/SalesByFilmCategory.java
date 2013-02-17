/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class SalesByFilmCategory extends org.jooq.impl.TableImpl<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord> {

	private static final long serialVersionUID = -365723703;

	/**
	 * The singleton instance of <code>sakila.sales_by_film_category</code>
	 */
	public static final org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory SALES_BY_FILM_CATEGORY = new org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord.class;
	}

	/**
	 * The column <code>sakila.sales_by_film_category.category</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord, java.lang.String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.VARCHAR.length(25), this);

	/**
	 * The column <code>sakila.sales_by_film_category.total_sales</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.SalesByFilmCategoryRecord, java.math.BigDecimal> TOTAL_SALES = createField("total_sales", org.jooq.impl.SQLDataType.DECIMAL.precision(27, 2), this);

	/**
	 * Create a <code>sakila.sales_by_film_category</code> table reference
	 */
	public SalesByFilmCategory() {
		super("sales_by_film_category", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	/**
	 * Create an aliased <code>sakila.sales_by_film_category</code> table reference
	 */
	public SalesByFilmCategory(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory.SALES_BY_FILM_CATEGORY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.SalesByFilmCategory(alias);
	}
}
