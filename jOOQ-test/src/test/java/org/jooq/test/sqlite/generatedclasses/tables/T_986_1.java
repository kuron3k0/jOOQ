/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.sqlite.generatedclasses.DefaultSchema;
import org.jooq.test.sqlite.generatedclasses.Keys;
import org.jooq.test.sqlite.generatedclasses.tables.records.T_986_1Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_986_1 extends TableImpl<T_986_1Record> {

	private static final long serialVersionUID = -457913135;

	/**
	 * The reference instance of <code>t_986_1</code>
	 */
	public static final T_986_1 T_986_1 = new T_986_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T_986_1Record> getRecordType() {
		return T_986_1Record.class;
	}

	/**
	 * The column <code>t_986_1.REF</code>.
	 */
	public static final TableField<T_986_1Record, Integer> REF = createField("REF", org.jooq.impl.SQLDataType.INTEGER, T_986_1, "");

	/**
	 * No further instances allowed
	 */
	private T_986_1() {
		this("t_986_1", null);
	}

	private T_986_1(String alias, Table<T_986_1Record> aliased) {
		this(alias, aliased, null);
	}

	private T_986_1(String alias, Table<T_986_1Record> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<T_986_1Record> getPrimaryKey() {
		return Keys.PK_T_986_1;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<T_986_1Record>> getKeys() {
		return Arrays.<UniqueKey<T_986_1Record>>asList(Keys.PK_T_986_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<T_986_1Record, ?>> getReferences() {
		return Arrays.<ForeignKey<T_986_1Record, ?>>asList(Keys.FK_T_986_1_X_UNUSED_1);
	}
}
