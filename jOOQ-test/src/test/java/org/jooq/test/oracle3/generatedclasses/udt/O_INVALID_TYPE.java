/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;


import org.jooq.impl.UDTImpl;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class O_INVALID_TYPE extends UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.O_INVALID_TYPE> implements Cloneable {

	private static final long serialVersionUID = 140046192;

	/**
	 * The reference instance of <code>O_INVALID_TYPE</code>
	 */
	public static final O_INVALID_TYPE O_INVALID_TYPE = new O_INVALID_TYPE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<org.jooq.test.oracle3.generatedclasses.udt.records.O_INVALID_TYPE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.O_INVALID_TYPE.class;
	}

	/**
	 * No further instances allowed
	 */
	private O_INVALID_TYPE() {
		super("O_INVALID_TYPE", DefaultSchema.DEFAULT_SCHEMA);

		// Initialise data type
		getDataType();
	}
}
