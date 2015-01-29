/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.mysql.generatedclasses.Keys;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.test.mysql.generatedclasses.tables.records.T_725LobTestRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_725LobTest extends TableImpl<T_725LobTestRecord> {

	private static final long serialVersionUID = 2004794654;

	/**
	 * The reference instance of <code>test.t_725_lob_test</code>
	 */
	public static final T_725LobTest T_725_LOB_TEST = new T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T_725LobTestRecord> getRecordType() {
		return T_725LobTestRecord.class;
	}

	/**
	 * The column <code>test.t_725_lob_test.ID</code>.
	 */
	public static final TableField<T_725LobTestRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_725_LOB_TEST, "");

	/**
	 * The column <code>test.t_725_lob_test.LOB</code>.
	 */
	public static final TableField<T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.BLOB, T_725_LOB_TEST, "");

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		this("t_725_lob_test", null);
	}

	private T_725LobTest(String alias, Table<T_725LobTestRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_725LobTest(String alias, Table<T_725LobTestRecord> aliased, Field<?>[] parameters) {
		super(alias, Test.TEST, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<T_725LobTestRecord> getPrimaryKey() {
		return Keys.KEY_T_725_LOB_TEST_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<T_725LobTestRecord>> getKeys() {
		return Arrays.<UniqueKey<T_725LobTestRecord>>asList(Keys.KEY_T_725_LOB_TEST_PRIMARY);
	}
}
