/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;


import java.sql.Date;

import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_ADDRESS_TYPE extends UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> implements Cloneable {

	private static final long serialVersionUID = -964907;

	/**
	 * The reference instance of <code>U_ADDRESS_TYPE</code>
	 */
	public static final U_ADDRESS_TYPE U_ADDRESS_TYPE = new U_ADDRESS_TYPE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE.class;
	}

	/**
	 * The attribute <code>U_ADDRESS_TYPE.STREET</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, U_STREET_TYPE> STREET = createField("STREET", org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.U_STREET_TYPE.getDataType(), U_ADDRESS_TYPE, "");

	/**
	 * The attribute <code>U_ADDRESS_TYPE.ZIP</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, String> ZIP = createField("ZIP", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE, "");

	/**
	 * The attribute <code>U_ADDRESS_TYPE.CITY</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, String> CITY = createField("CITY", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE, "");

	/**
	 * The attribute <code>U_ADDRESS_TYPE.COUNTRY</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, String> COUNTRY = createField("COUNTRY", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE, "");

	/**
	 * The attribute <code>U_ADDRESS_TYPE.SINCE</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, Date> SINCE = createField("SINCE", org.jooq.impl.SQLDataType.DATE, U_ADDRESS_TYPE, "");

	/**
	 * The attribute <code>U_ADDRESS_TYPE.CODE</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, Integer> CODE = createField("CODE", org.jooq.impl.SQLDataType.INTEGER, U_ADDRESS_TYPE, "");

	/**
	 * The attribute <code>U_ADDRESS_TYPE.F_1323</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, byte[]> F_1323 = createField("F_1323", org.jooq.impl.SQLDataType.BLOB, U_ADDRESS_TYPE, "");

	/**
	 * The attribute <code>U_ADDRESS_TYPE.F_1326</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, String> F_1326 = createField("F_1326", org.jooq.impl.SQLDataType.CLOB, U_ADDRESS_TYPE, "");

	/**
	 * No further instances allowed
	 */
	private U_ADDRESS_TYPE() {
		super("U_ADDRESS_TYPE", DefaultSchema.DEFAULT_SCHEMA);

		// Initialise data type
		getDataType();
	}
}
