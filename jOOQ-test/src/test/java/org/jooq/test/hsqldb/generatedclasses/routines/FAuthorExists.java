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
public class FAuthorExists extends AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 1907014805;

	/**
	 * The parameter <code>PUBLIC.F_AUTHOR_EXISTS.RETURN_VALUE</code>.
	 */
	public static final Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>PUBLIC.F_AUTHOR_EXISTS.AUTHOR_NAME</code>.
	 */
	public static final Parameter<java.lang.String> AUTHOR_NAME = createParameter("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(50), false);

	/**
	 * Create a new routine call instance
	 */
	public FAuthorExists() {
		super("F_AUTHOR_EXISTS", Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(AUTHOR_NAME);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter IN value to the routine
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setAuthorName(Field<java.lang.String> field) {
		setField(AUTHOR_NAME, field);
	}
}
