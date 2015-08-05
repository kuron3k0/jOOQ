/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.hsqldb.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FArrays2 extends AbstractRoutine<java.lang.Long[]> {

	private static final long serialVersionUID = -408897684;

	/**
	 * The parameter <code>PUBLIC.F_ARRAYS2.RETURN_VALUE</code>.
	 */
	public static final Parameter<java.lang.Long[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), false);

	/**
	 * The parameter <code>PUBLIC.F_ARRAYS2.IN_ARRAY</code>.
	 */
	public static final Parameter<java.lang.Long[]> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), false);

	/**
	 * Create a new routine call instance
	 */
	public FArrays2() {
		super("F_ARRAYS2", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.Long[] value) {
		setValue(IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInArray(Field<java.lang.Long[]> field) {
		setField(IN_ARRAY, field);
	}
}
