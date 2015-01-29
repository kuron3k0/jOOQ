/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.enums;


import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * The book's stock status
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum TBookStatus implements EnumType {

	SOLD_OUT("SOLD OUT"),

	ORDERED("ORDERED"),

	ON_STOCK("ON STOCK");

	private final String literal;

	private TBookStatus(String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getName() {
		return "t_book_STATUS";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String getLiteral() {
		return literal;
	}
}
