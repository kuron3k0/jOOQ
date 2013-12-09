/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesOrderHeaderSalesReason extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason> {

	private static final long serialVersionUID = 1207600877;

	/**
	 * The singleton instance of <code>Sales.SalesOrderHeaderSalesReason</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason SalesOrderHeaderSalesReason = new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason.class;
	}

	/**
	 * The column <code>Sales.SalesOrderHeaderSalesReason.SalesOrderID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, java.lang.Integer> SalesOrderID = createField("SalesOrderID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Sales.SalesOrderHeaderSalesReason.SalesReasonID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, java.lang.Integer> SalesReasonID = createField("SalesReasonID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Sales.SalesOrderHeaderSalesReason.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>Sales.SalesOrderHeaderSalesReason</code> table reference
	 */
	public SalesOrderHeaderSalesReason() {
		super("SalesOrderHeaderSalesReason", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * Create an aliased <code>Sales.SalesOrderHeaderSalesReason</code> table reference
	 */
	public SalesOrderHeaderSalesReason(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason.SalesOrderHeaderSalesReason);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesOrderHeaderSalesReason_SalesOrderID_SalesReasonID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_SalesOrderHeaderSalesReason_SalesOrderID_SalesReasonID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.SalesOrderHeaderSalesReason, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SalesOrderHeaderSalesReason_SalesOrderHeader_SalesOrderID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_SalesOrderHeaderSalesReason_SalesReason_SalesReasonID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.SalesOrderHeaderSalesReason(alias);
	}
}
