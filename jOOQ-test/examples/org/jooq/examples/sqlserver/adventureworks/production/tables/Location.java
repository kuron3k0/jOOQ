/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Location extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location> {

	private static final long serialVersionUID = 593604999;

	/**
	 * The singleton instance of <code>Production.Location</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.production.tables.Location Location = new org.jooq.examples.sqlserver.adventureworks.production.tables.Location();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location.class;
	}

	/**
	 * The column <code>Production.Location.LocationID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location, java.lang.Short> LocationID = createField("LocationID", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this);

	/**
	 * The column <code>Production.Location.Name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR.length(50).nullable(false), this);

	/**
	 * The column <code>Production.Location.CostRate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location, java.math.BigDecimal> CostRate = createField("CostRate", org.jooq.impl.SQLDataType.NUMERIC.precision(10, 4).nullable(false).defaulted(true), this);

	/**
	 * The column <code>Production.Location.Availability</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location, java.math.BigDecimal> Availability = createField("Availability", org.jooq.impl.SQLDataType.NUMERIC.precision(8, 2).nullable(false).defaulted(true), this);

	/**
	 * The column <code>Production.Location.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>Production.Location</code> table reference
	 */
	public Location() {
		super("Location", org.jooq.examples.sqlserver.adventureworks.production.Production.Production);
	}

	/**
	 * Create an aliased <code>Production.Location</code> table reference
	 */
	public Location(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.production.Production.Production, org.jooq.examples.sqlserver.adventureworks.production.tables.Location.Location);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location, java.lang.Short> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.IDENTITY_Location;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Location_LocationID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Location>>asList(org.jooq.examples.sqlserver.adventureworks.production.Keys.PK_Location_LocationID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.production.tables.Location as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.production.tables.Location(alias);
	}
}
