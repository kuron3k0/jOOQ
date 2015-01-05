/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;


import java.util.Collection;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.ArrayRecordImpl;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_STRING_ARRAY extends ArrayRecordImpl<String> implements Cloneable {

	private static final long serialVersionUID = 476063079;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #U_STRING_ARRAY()} constructor instead
	 */
	@java.lang.Deprecated
	public U_STRING_ARRAY(Configuration configuration) {
		super(DefaultSchema.DEFAULT_SCHEMA, "U_STRING_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.length(20), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #U_STRING_ARRAY()} constructor instead
	 */
	@java.lang.Deprecated
	public U_STRING_ARRAY(Configuration configuration, String... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #U_STRING_ARRAY()} constructor instead
	 */
	@java.lang.Deprecated
	public U_STRING_ARRAY(Configuration configuration, List<? extends String> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>U_STRING_ARRAY</code> record
	 */
	public U_STRING_ARRAY() {
		super(DefaultSchema.DEFAULT_SCHEMA, "U_STRING_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.length(20));
	}

	/**
	 * Create a new <code>U_STRING_ARRAY</code> record
	 */
	public U_STRING_ARRAY(String... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>U_STRING_ARRAY</code> record
	 */
	public U_STRING_ARRAY(Collection<? extends String> collection) {
		this();
		set(collection);
	}
}
