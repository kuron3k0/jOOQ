/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StateProvince extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince> {

	private static final long serialVersionUID = 475043234;

	/**
	 * The singleton instance of <code>Person.StateProvince</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince StateProvince = new org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince.class;
	}

	/**
	 * The column <code>Person.StateProvince.StateProvinceID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.Integer> StateProvinceID = createField("StateProvinceID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Person.StateProvince.StateProvinceCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.String> StateProvinceCode = createField("StateProvinceCode", org.jooq.impl.SQLDataType.NCHAR.length(3).nullable(false), this);

	/**
	 * The column <code>Person.StateProvince.CountryRegionCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.String> CountryRegionCode = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR.length(3).nullable(false), this);

	/**
	 * The column <code>Person.StateProvince.IsOnlyStateProvinceFlag</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.Boolean> IsOnlyStateProvinceFlag = createField("IsOnlyStateProvinceFlag", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>Person.StateProvince.Name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR.length(50).nullable(false), this);

	/**
	 * The column <code>Person.StateProvince.TerritoryID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.Integer> TerritoryID = createField("TerritoryID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>Person.StateProvince.rowguid</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.util.UUID> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaulted(true), this);

	/**
	 * The column <code>Person.StateProvince.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>Person.StateProvince</code> table reference
	 */
	public StateProvince() {
		super("StateProvince", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	/**
	 * Create an aliased <code>Person.StateProvince</code> table reference
	 */
	public StateProvince(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince.StateProvince);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_StateProvince;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_StateProvince_StateProvinceID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_StateProvince_StateProvinceID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.StateProvince, ?>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.FK_StateProvince_CountryRegion_CountryRegionCode, org.jooq.examples.sqlserver.adventureworks.person.Keys.FK_StateProvince_SalesTerritory_TerritoryID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.StateProvince(alias);
	}
}
