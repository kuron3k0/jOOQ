/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Customer extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer> {

	private static final long serialVersionUID = -1955435142;

	/**
	 * The singleton instance of <code>Sales.Customer</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer Customer = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer.class;
	}

	/**
	 * The column <code>Sales.Customer.CustomerID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.lang.Integer> CustomerID = createField("CustomerID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Sales.Customer.PersonID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.lang.Integer> PersonID = createField("PersonID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.Customer.StoreID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.lang.Integer> StoreID = createField("StoreID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.Customer.TerritoryID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.lang.Integer> TerritoryID = createField("TerritoryID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.Customer.AccountNumber</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.lang.String> AccountNumber = createField("AccountNumber", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this);

	/**
	 * The column <code>Sales.Customer.rowguid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.util.UUID> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaulted(true), this);

	/**
	 * The column <code>Sales.Customer.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>Sales.Customer</code> table reference
	 */
	public Customer() {
		super("Customer", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * Create an aliased <code>Sales.Customer</code> table reference
	 */
	public Customer(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer.Customer);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.IDENTITY_Customer;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_Customer_CustomerID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_Customer_CustomerID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Customer, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_Customer_Person_PersonID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_Customer_Store_StoreID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_Customer_SalesTerritory_TerritoryID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Customer(alias);
	}
}
