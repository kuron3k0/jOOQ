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
public class U_ADDRESS_TABLE extends ArrayRecordImpl<U_ADDRESS_TYPE> implements Cloneable {

	private static final long serialVersionUID = -1191608997;

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #U_ADDRESS_TABLE()} constructor instead
	 */
	@java.lang.Deprecated
	public U_ADDRESS_TABLE(Configuration configuration) {
		super(DefaultSchema.DEFAULT_SCHEMA, "U_ADDRESS_TABLE", org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE.getDataType(), configuration);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #U_ADDRESS_TABLE()} constructor instead
	 */
	@java.lang.Deprecated
	public U_ADDRESS_TABLE(Configuration configuration, U_ADDRESS_TYPE... array) {
		this(configuration);
		set(array);
	}

	/**
	 * @deprecated - 3.4.0 - [#3126] - Use the {@link #U_ADDRESS_TABLE()} constructor instead
	 */
	@java.lang.Deprecated
	public U_ADDRESS_TABLE(Configuration configuration, List<? extends U_ADDRESS_TYPE> list) {
		this(configuration);
		setList(list);
	}

	/**
	 * Create a new <code>U_ADDRESS_TABLE</code> record
	 */
	public U_ADDRESS_TABLE() {
		super(DefaultSchema.DEFAULT_SCHEMA, "U_ADDRESS_TABLE", org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE.getDataType());
	}

	/**
	 * Create a new <code>U_ADDRESS_TABLE</code> record
	 */
	public U_ADDRESS_TABLE(U_ADDRESS_TYPE... array) {
		this();
		set(array);
	}

	/**
	 * Create a new <code>U_ADDRESS_TABLE</code> record
	 */
	public U_ADDRESS_TABLE(Collection<? extends U_ADDRESS_TYPE> collection) {
		this();
		set(collection);
	}
}
