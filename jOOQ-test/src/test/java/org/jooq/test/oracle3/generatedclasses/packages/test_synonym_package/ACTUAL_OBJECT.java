/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.test_synonym_package;


import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;
import org.jooq.test.oracle3.generatedclasses.packages.TEST_SYNONYM_PACKAGE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ACTUAL_OBJECT extends AbstractRoutine<Object> implements Cloneable {

	private static final long serialVersionUID = 1712603168;

	/**
	 * The parameter <code>TEST_SYNONYM_PACKAGE.ACTUAL_OBJECT.RETURN_VALUE</code>.
	 */
	public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("OBJECT"), false);

	/**
	 * Create a new routine call instance
	 */
	public ACTUAL_OBJECT() {
		super("ACTUAL_OBJECT", DefaultSchema.DEFAULT_SCHEMA, TEST_SYNONYM_PACKAGE.TEST_SYNONYM_PACKAGE, org.jooq.impl.DefaultDataType.getDefaultDataType("OBJECT"));

		setReturnParameter(RETURN_VALUE);
	}
}
