/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = -1289605651;

	/**
	 * The singleton instance of <code>t_exotic_types</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.cubrid.generatedclasses.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>t_exotic_types.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_EXOTIC_TYPES);

	/**
	 * The column <code>t_exotic_types.uu</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("uu", org.jooq.impl.SQLDataType.UUID, T_EXOTIC_TYPES);

	/**
	 * No further instances allowed
	 */
	private TExoticTypes() {
		super("t_exotic_types", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TExoticTypesRecord> getPrimaryKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.T_EXOTIC_TYPES__PK_T_EXOTIC_TYPES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TExoticTypesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TExoticTypesRecord>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_EXOTIC_TYPES__PK_T_EXOTIC_TYPES);
	}
}
