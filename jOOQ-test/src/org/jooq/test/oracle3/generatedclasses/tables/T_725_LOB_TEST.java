/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725_LOB_TEST extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1336362889;

	/**
	 * The singleton instance of <code>T_725_LOB_TEST</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST T_725_LOB_TEST = new org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST.class;
	}

	/**
	 * The column <code>T_725_LOB_TEST.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>T_725_LOB_TEST.LOB</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * Create a <code>T_725_LOB_TEST</code> table reference
	 */
	public T_725_LOB_TEST() {
		super("T_725_LOB_TEST", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>T_725_LOB_TEST</code> table reference
	 */
	public T_725_LOB_TEST(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST.T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_725_LOB_TEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_725_LOB_TEST>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_725_LOB_TEST(alias);
	}
}
