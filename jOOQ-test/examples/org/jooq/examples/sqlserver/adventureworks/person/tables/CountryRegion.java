/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CountryRegion extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion> {

	private static final long serialVersionUID = -854666704;

	/**
	 * The singleton instance of <code>Person.CountryRegion</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion CountryRegion = new org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion.class;
	}

	/**
	 * The column <code>Person.CountryRegion.CountryRegionCode</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion, java.lang.String> CountryRegionCode = createField("CountryRegionCode", org.jooq.impl.SQLDataType.NVARCHAR.length(3).nullable(false), this);

	/**
	 * The column <code>Person.CountryRegion.Name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR.length(50).nullable(false), this);

	/**
	 * The column <code>Person.CountryRegion.ModifiedDate</code>. 
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this);

	/**
	 * Create a <code>Person.CountryRegion</code> table reference
	 */
	public CountryRegion() {
		super("CountryRegion", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	/**
	 * Create an aliased <code>Person.CountryRegion</code> table reference
	 */
	public CountryRegion(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion.CountryRegion);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion> getPrimaryKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_CountryRegion_CountryRegionCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.CountryRegion>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_CountryRegion_CountryRegionCode);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.CountryRegion(alias);
	}
}
