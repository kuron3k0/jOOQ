/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.packages.test_synonym_package;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PublicObject extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 1450445806;

	/**
	 * The parameter <code>TEST.TEST_SYNONYM_PACKAGE.PUBLIC_OBJECT.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("OBJECT"));

	/**
	 * Create a new routine call instance
	 */
	public PublicObject() {
		super("PUBLIC_OBJECT", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.packages.TestSynonymPackage.TEST_SYNONYM_PACKAGE, org.jooq.impl.DefaultDataType.getDefaultDataType("OBJECT"));

		setReturnParameter(RETURN_VALUE);
	}
}
