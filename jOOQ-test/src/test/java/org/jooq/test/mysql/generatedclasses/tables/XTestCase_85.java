/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.mysql.generatedclasses.Keys;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record;


/**
 * An unused table in the same schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_85 extends TableImpl<XTestCase_85Record> {

	private static final long serialVersionUID = -583845674;

	/**
	 * The reference instance of <code>test.x_test_case_85</code>
	 */
	public static final XTestCase_85 X_TEST_CASE_85 = new XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XTestCase_85Record> getRecordType() {
		return XTestCase_85Record.class;
	}

	/**
	 * The column <code>test.x_test_case_85.id</code>.
	 */
	public static final TableField<XTestCase_85Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), X_TEST_CASE_85, "");

	/**
	 * The column <code>test.x_test_case_85.x_unused_id</code>.
	 */
	public static final TableField<XTestCase_85Record, Integer> X_UNUSED_ID = createField("x_unused_id", org.jooq.impl.SQLDataType.INTEGER, X_TEST_CASE_85, "");

	/**
	 * The column <code>test.x_test_case_85.x_unused_name</code>.
	 */
	public static final TableField<XTestCase_85Record, String> X_UNUSED_NAME = createField("x_unused_name", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_TEST_CASE_85, "");

	/**
	 * No further instances allowed
	 */
	private XTestCase_85() {
		this("x_test_case_85", null);
	}

	private XTestCase_85(String alias, Table<XTestCase_85Record> aliased) {
		this(alias, aliased, null);
	}

	private XTestCase_85(String alias, Table<XTestCase_85Record> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "An unused table in the same schema.");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<XTestCase_85Record> getPrimaryKey() {
		return Keys.KEY_X_TEST_CASE_85_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<XTestCase_85Record>> getKeys() {
		return Arrays.<UniqueKey<XTestCase_85Record>>asList(Keys.KEY_X_TEST_CASE_85_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<XTestCase_85Record, ?>> getReferences() {
		return Arrays.<ForeignKey<XTestCase_85Record, ?>>asList(Keys.FK_X_TEST_CASE_85);
	}
}
