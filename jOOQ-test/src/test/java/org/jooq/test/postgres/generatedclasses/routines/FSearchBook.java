/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.postgres.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FSearchBook extends AbstractRoutine<Object> {

	private static final long serialVersionUID = -2089508963;

	/**
	 * The parameter <code>public.f_search_book.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), false);

	/**
	 * The parameter <code>public.f_search_book.p_title</code>.
	 */
	public static final Parameter<String> P_TITLE = createParameter("p_title", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public FSearchBook() {
		super("f_search_book", Public.PUBLIC, org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_TITLE);
	}

	/**
	 * Set the <code>p_title</code> parameter IN value to the routine
	 */
	public void setPTitle(String value) {
		setValue(P_TITLE, value);
	}

	/**
	 * Set the <code>p_title</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public FSearchBook setPTitle(Field<String> field) {
		setField(P_TITLE, field);
		return this;
	}
}
