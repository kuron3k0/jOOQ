/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.pojos;


import java.io.Serializable;

import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_BOOK_TYPE_INTERFACE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_BOOK_TYPE_POJO extends Object implements Serializable, U_BOOK_TYPE_INTERFACE {

	private static final long serialVersionUID = 1712709936;

	private Integer ID;
	private String  TITLE;

	public U_BOOK_TYPE_POJO() {}

	public U_BOOK_TYPE_POJO(
		Integer ID,
		String  TITLE
	) {
		this.ID = ID;
		this.TITLE = TITLE;
	}

	@Override
	public Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(Integer ID) {
		this.ID = ID;
	}

	@Override
	public String getTITLE() {
		return this.TITLE;
	}

	@Override
	public void setTITLE(String TITLE) {
		this.TITLE = TITLE;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(U_BOOK_TYPE_INTERFACE from) {
		setID(from.getID());
		setTITLE(from.getTITLE());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends U_BOOK_TYPE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
