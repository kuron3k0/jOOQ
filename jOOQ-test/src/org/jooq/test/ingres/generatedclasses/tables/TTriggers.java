/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggers extends org.jooq.impl.TableImpl<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord> {

	private static final long serialVersionUID = -583053774;

	/**
	 * The singleton instance of <code>test.t_triggers</code>
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.TTriggers T_TRIGGERS = new org.jooq.test.ingres.generatedclasses.tables.TTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord> getRecordType() {
		return org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord.class;
	}

	/**
	 * The column <code>test.t_triggers.id_generated</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID_GENERATED = createField("id_generated", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), T_TRIGGERS);

	/**
	 * The column <code>test.t_triggers.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * The column <code>test.t_triggers.counter</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS);

	/**
	 * No further instances allowed
	 */
	private TTriggers() {
		super("t_triggers", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.ingres.generatedclasses.Keys.IDENTITY_T_TRIGGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord> getPrimaryKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.PK_T_TRIGGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.TTriggersRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.PK_T_TRIGGERS);
	}
}
