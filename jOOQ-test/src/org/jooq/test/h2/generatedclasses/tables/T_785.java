/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.h2.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = -1753041428;

	/**
	 * The singleton instance of <code>PUBLIC.T_785</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.T_785 T_785 = new org.jooq.test.h2.generatedclasses.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.T_785Record> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.T_785Record.class;
	}

	/**
	 * The column <code>PUBLIC.T_785.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_785Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_785);

	/**
	 * The column <code>PUBLIC.T_785.NAME</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_785Record, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_785);

	/**
	 * The column <code>PUBLIC.T_785.VALUE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.T_785Record, java.lang.String> VALUE = createField("VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(50), T_785);

	/**
	 * No further instances allowed
	 */
	private T_785() {
		super("T_785", org.jooq.test.h2.generatedclasses.NonPublic.NON_PUBLIC);
	}
}
