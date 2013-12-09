/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "TransactionHistoryArchive", schema = "Production")
public class TransactionHistoryArchive implements java.io.Serializable {

	private static final long serialVersionUID = -1874128834;

	private java.lang.Integer    TransactionID;
	private java.lang.Integer    ProductID;
	private java.lang.Integer    ReferenceOrderID;
	private java.lang.Integer    ReferenceOrderLineID;
	private java.sql.Timestamp   TransactionDate;
	private java.lang.String     TransactionType;
	private java.lang.Integer    Quantity;
	private java.math.BigDecimal ActualCost;
	private java.sql.Timestamp   ModifiedDate;

	public TransactionHistoryArchive() {}

	public TransactionHistoryArchive(
		java.lang.Integer    TransactionID,
		java.lang.Integer    ProductID,
		java.lang.Integer    ReferenceOrderID,
		java.lang.Integer    ReferenceOrderLineID,
		java.sql.Timestamp   TransactionDate,
		java.lang.String     TransactionType,
		java.lang.Integer    Quantity,
		java.math.BigDecimal ActualCost,
		java.sql.Timestamp   ModifiedDate
	) {
		this.TransactionID = TransactionID;
		this.ProductID = ProductID;
		this.ReferenceOrderID = ReferenceOrderID;
		this.ReferenceOrderLineID = ReferenceOrderLineID;
		this.TransactionDate = TransactionDate;
		this.TransactionType = TransactionType;
		this.Quantity = Quantity;
		this.ActualCost = ActualCost;
		this.ModifiedDate = ModifiedDate;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "TransactionID", unique = true, nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getTransactionID() {
		return this.TransactionID;
	}

	public void setTransactionID(java.lang.Integer TransactionID) {
		this.TransactionID = TransactionID;
	}

	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getProductID() {
		return this.ProductID;
	}

	public void setProductID(java.lang.Integer ProductID) {
		this.ProductID = ProductID;
	}

	@javax.persistence.Column(name = "ReferenceOrderID", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getReferenceOrderID() {
		return this.ReferenceOrderID;
	}

	public void setReferenceOrderID(java.lang.Integer ReferenceOrderID) {
		this.ReferenceOrderID = ReferenceOrderID;
	}

	@javax.persistence.Column(name = "ReferenceOrderLineID", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getReferenceOrderLineID() {
		return this.ReferenceOrderLineID;
	}

	public void setReferenceOrderLineID(java.lang.Integer ReferenceOrderLineID) {
		this.ReferenceOrderLineID = ReferenceOrderLineID;
	}

	@javax.persistence.Column(name = "TransactionDate", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Timestamp getTransactionDate() {
		return this.TransactionDate;
	}

	public void setTransactionDate(java.sql.Timestamp TransactionDate) {
		this.TransactionDate = TransactionDate;
	}

	@javax.persistence.Column(name = "TransactionType", nullable = false, length = 1)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 1)
	public java.lang.String getTransactionType() {
		return this.TransactionType;
	}

	public void setTransactionType(java.lang.String TransactionType) {
		this.TransactionType = TransactionType;
	}

	@javax.persistence.Column(name = "Quantity", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getQuantity() {
		return this.Quantity;
	}

	public void setQuantity(java.lang.Integer Quantity) {
		this.Quantity = Quantity;
	}

	@javax.persistence.Column(name = "ActualCost", nullable = false, precision = 19, scale = 4)
	@javax.validation.constraints.NotNull
	public java.math.BigDecimal getActualCost() {
		return this.ActualCost;
	}

	public void setActualCost(java.math.BigDecimal ActualCost) {
		this.ActualCost = ActualCost;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
