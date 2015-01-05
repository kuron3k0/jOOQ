/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F_ARRAYS3 extends AbstractRoutine<U_STRING_ARRAY> implements Cloneable {

	private static final long serialVersionUID = -1118544236;

	/**
	 * The parameter <code>F_ARRAYS3.RETURN_VALUE</code>.
	 */
	public static final Parameter<U_STRING_ARRAY> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.VARCHAR.length(20).asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY.class), false);

	/**
	 * The parameter <code>F_ARRAYS3.IN_ARRAY</code>.
	 */
	public static final Parameter<U_STRING_ARRAY> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.VARCHAR.length(20).asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY.class), false);

	/**
	 * Create a new routine call instance
	 */
	public F_ARRAYS3() {
		super("F_ARRAYS3", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.VARCHAR.length(20).asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_STRING_ARRAY.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setIN_ARRAY(U_STRING_ARRAY value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setIN_ARRAY(Field<U_STRING_ARRAY> field) {
		setField(IN_ARRAY, field);
	}
}
