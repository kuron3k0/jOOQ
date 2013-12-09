/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CreditCard extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard> {

	private static final long serialVersionUID = -698343760;

	/**
	 * The singleton instance of <code>Sales.CreditCard</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard CreditCard = new org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard.class;
	}

	/**
	 * The column <code>Sales.CreditCard.CreditCardID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard, java.lang.Integer> CreditCardID = createField("CreditCardID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Sales.CreditCard.CardType</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard, java.lang.String> CardType = createField("CardType", org.jooq.impl.SQLDataType.NVARCHAR.length(50).nullable(false), this);

	/**
	 * The column <code>Sales.CreditCard.CardNumber</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard, java.lang.String> CardNumber = createField("CardNumber", org.jooq.impl.SQLDataType.NVARCHAR.length(25).nullable(false), this);

	/**
	 * The column <code>Sales.CreditCard.ExpMonth</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard, org.jooq.types.UByte> ExpMonth = createField("ExpMonth", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this);

	/**
	 * The column <code>Sales.CreditCard.ExpYear</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard, java.lang.Short> ExpYear = createField("ExpYear", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this);

	/**
	 * The column <code>Sales.CreditCard.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>Sales.CreditCard</code> table reference
	 */
	public CreditCard() {
		super("CreditCard", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * Create an aliased <code>Sales.CreditCard</code> table reference
	 */
	public CreditCard(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard.CreditCard);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_CreditCard;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CreditCard_CreditCardID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CreditCard>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_CreditCard_CreditCardID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.CreditCard(alias);
	}
}
