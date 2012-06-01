/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_TO_BOOK_STORE", schema = "TEST", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"BOOK_STORE_NAME", "BOOK_ID"})
})
public class T_BOOK_TO_BOOK_STORE_POJO extends java.lang.Object implements java.io.Serializable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_TO_BOOK_STORE_INTERFACE {

	private static final long serialVersionUID = -190747740;

	private java.lang.String  BOOK_STORE_NAME;
	private java.lang.Integer BOOK_ID;
	private java.lang.Integer STOCK;

	@javax.persistence.Column(name = "BOOK_STORE_NAME", nullable = false, length = 400)
	@Override
	public java.lang.String getBOOK_STORE_NAME() {
		return this.BOOK_STORE_NAME;
	}

	@Override
	public void setBOOK_STORE_NAME(java.lang.String BOOK_STORE_NAME) {
		this.BOOK_STORE_NAME = BOOK_STORE_NAME;
	}

	@javax.persistence.Column(name = "BOOK_ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getBOOK_ID() {
		return this.BOOK_ID;
	}

	@Override
	public void setBOOK_ID(java.lang.Integer BOOK_ID) {
		this.BOOK_ID = BOOK_ID;
	}

	@javax.persistence.Column(name = "STOCK", precision = 7)
	@Override
	public java.lang.Integer getSTOCK() {
		return this.STOCK;
	}

	@Override
	public void setSTOCK(java.lang.Integer STOCK) {
		this.STOCK = STOCK;
	}
}
