/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "V_LIBRARY", schema = "TEST")
public class V_LIBRARY extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_LIBRARY> implements java.io.Serializable, java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_LIBRARY_INTERFACE {

	private static final long serialVersionUID = 2039151458;

	/**
	 * The table column <code>TEST.V_LIBRARY.AUTHOR</code>
	 */
	@Override
	public void setAUTHOR(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY.AUTHOR, value);
	}

	/**
	 * The table column <code>TEST.V_LIBRARY.AUTHOR</code>
	 */
	@javax.persistence.Column(name = "AUTHOR", length = 101)
	@Override
	public java.lang.String getAUTHOR() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY.AUTHOR);
	}

	/**
	 * The table column <code>TEST.V_LIBRARY.TITLE</code>
	 */
	@Override
	public void setTITLE(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY.TITLE, value);
	}

	/**
	 * The table column <code>TEST.V_LIBRARY.TITLE</code>
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@Override
	public java.lang.String getTITLE() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY.TITLE);
	}

	/**
	 * Create a detached V_LIBRARY
	 */
	public V_LIBRARY() {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_LIBRARY.V_LIBRARY);
	}
}
