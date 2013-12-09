/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductInventory extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> {

	private static final long serialVersionUID = 868149203;

	/**
	 * The singleton instance of <code>Production.ProductInventory</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory ProductInventory = new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory.class;
	}

	/**
	 * The column <code>Production.ProductInventory.ProductID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Integer> ProductID = createField("ProductID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Production.ProductInventory.LocationID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Short> LocationID = createField("LocationID", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this);

	/**
	 * The column <code>Production.ProductInventory.Shelf</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.String> Shelf = createField("Shelf", org.jooq.impl.SQLDataType.NVARCHAR.length(10).nullable(false), this);

	/**
	 * The column <code>Production.ProductInventory.Bin</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, org.jooq.types.UByte> Bin = createField("Bin", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this);

	/**
	 * The column <code>Production.ProductInventory.Quantity</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.lang.Short> Quantity = createField("Quantity", org.jooq.impl.SQLDataType.SMALLINT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>Production.ProductInventory.rowguid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.util.UUID> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaulted(true), this);

	/**
	 * The column <code>Production.ProductInventory.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>Production.ProductInventory</code> table reference
	 */
	public ProductInventory() {
		super("ProductInventory", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.ProductInventory</code> table reference
	 */
	public ProductInventory(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory.ProductInventory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductInventory_ProductID_LocationID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_ProductInventory_ProductID_LocationID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.ProductInventory, ?>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductInventory_Product_ProductID, org.jooq.examples.sqlserver.adventureworks.production.Keys.FK_ProductInventory_Location_LocationID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.ProductInventory(alias);
	}
}
