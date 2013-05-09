/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MultiSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 712546500;

	/**
	 * The singleton instance of <code>MULTI_SCHEMA</code>
	 */
	public static final MultiSchema MULTI_SCHEMA = new MultiSchema();

	/**
	 * No further instances allowed
	 */
	private MultiSchema() {
		super("MULTI_SCHEMA");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR,
			org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBook.T_BOOK,
			org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE);
	}
}
