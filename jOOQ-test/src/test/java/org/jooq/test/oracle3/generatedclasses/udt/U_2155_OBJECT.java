/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;


import java.sql.Date;

import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_ARRAY;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_2155_OBJECT extends UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_OBJECT> implements Cloneable {

	private static final long serialVersionUID = -1023037966;

	/**
	 * The reference instance of <code>U_2155_OBJECT</code>
	 */
	public static final U_2155_OBJECT U_2155_OBJECT = new U_2155_OBJECT();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_OBJECT> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_OBJECT.class;
	}

	/**
	 * The attribute <code>U_2155_OBJECT.D</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_OBJECT, Date> D = createField("D", org.jooq.impl.SQLDataType.DATE, U_2155_OBJECT, "");

	/**
	 * The attribute <code>U_2155_OBJECT.A</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_OBJECT, U_2155_ARRAY> A = createField("A", org.jooq.impl.SQLDataType.DATE.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_ARRAY.class), U_2155_OBJECT, "");

	/**
	 * No further instances allowed
	 */
	private U_2155_OBJECT() {
		super("U_2155_OBJECT", DefaultSchema.DEFAULT_SCHEMA);

		// Initialise data type
		getDataType();
	}
}
