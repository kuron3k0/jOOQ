/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class vStateProvinceCountryRegion extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion> {

	private static final long serialVersionUID = -1043505451;

	/**
	 * The singleton instance of <code>Person.vStateProvinceCountryRegion</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion vStateProvinceCountryRegion = new org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion.class;
	}

	/**
	 * The column <code>Person.vStateProvinceCountryRegion.StateProvinceID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.Integer> StateProvinceID = createField("StateProvinceID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Person.vStateProvinceCountryRegion.StateProvinceCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.String> StateProvinceCode = createField("StateProvinceCode", org.jooq.impl.SQLDataType.NCHAR.length(3).nullable(false), this);

	/**
	 * The column <code>Person.vStateProvinceCountryRegion.IsOnlyStateProvinceFlag</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.Boolean> IsOnlyStateProvinceFlag = createField("IsOnlyStateProvinceFlag", org.jooq.impl.SQLDataType.BIT.nullable(false), this);

	/**
	 * The column <code>Person.vStateProvinceCountryRegion.StateProvinceName</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.String> StateProvinceName = createField("StateProvinceName", org.jooq.impl.SQLDataType.NVARCHAR.length(50).nullable(false), this);

	/**
	 * The column <code>Person.vStateProvinceCountryRegion.TerritoryID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.Integer> TerritoryID = createField("TerritoryID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Person.vStateProvinceCountryRegion.CountryRegionCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.String> CountryRegionCode = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR.length(3).nullable(false), this);

	/**
	 * The column <code>Person.vStateProvinceCountryRegion.CountryRegionName</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.vStateProvinceCountryRegion, java.lang.String> CountryRegionName = createField("CountryRegionName", org.jooq.impl.SQLDataType.NVARCHAR.length(50).nullable(false), this);

	/**
	 * Create a <code>Person.vStateProvinceCountryRegion</code> table reference
	 */
	public vStateProvinceCountryRegion() {
		super("vStateProvinceCountryRegion", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	/**
	 * Create an aliased <code>Person.vStateProvinceCountryRegion</code> table reference
	 */
	public vStateProvinceCountryRegion(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion.vStateProvinceCountryRegion);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.vStateProvinceCountryRegion(alias);
	}
}
