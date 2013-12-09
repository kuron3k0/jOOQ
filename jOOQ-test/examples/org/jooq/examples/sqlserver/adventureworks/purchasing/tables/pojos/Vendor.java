/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "Vendor", schema = "Purchasing")
public class Vendor implements java.io.Serializable {

	private static final long serialVersionUID = 869316986;

	private java.lang.Integer    BusinessEntityID;
	private java.lang.String     AccountNumber;
	private java.lang.String     Name;
	private org.jooq.types.UByte CreditRating;
	private java.lang.Boolean    PreferredVendorStatus;
	private java.lang.Boolean    ActiveFlag;
	private java.lang.String     PurchasingWebServiceURL;
	private java.sql.Timestamp   ModifiedDate;

	public Vendor() {}

	public Vendor(
		java.lang.Integer    BusinessEntityID,
		java.lang.String     AccountNumber,
		java.lang.String     Name,
		org.jooq.types.UByte CreditRating,
		java.lang.Boolean    PreferredVendorStatus,
		java.lang.Boolean    ActiveFlag,
		java.lang.String     PurchasingWebServiceURL,
		java.sql.Timestamp   ModifiedDate
	) {
		this.BusinessEntityID = BusinessEntityID;
		this.AccountNumber = AccountNumber;
		this.Name = Name;
		this.CreditRating = CreditRating;
		this.PreferredVendorStatus = PreferredVendorStatus;
		this.ActiveFlag = ActiveFlag;
		this.PurchasingWebServiceURL = PurchasingWebServiceURL;
		this.ModifiedDate = ModifiedDate;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "BusinessEntityID", unique = true, nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getBusinessEntityID() {
		return this.BusinessEntityID;
	}

	public void setBusinessEntityID(java.lang.Integer BusinessEntityID) {
		this.BusinessEntityID = BusinessEntityID;
	}

	@javax.persistence.Column(name = "AccountNumber", nullable = false, length = 15)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 15)
	public java.lang.String getAccountNumber() {
		return this.AccountNumber;
	}

	public void setAccountNumber(java.lang.String AccountNumber) {
		this.AccountNumber = AccountNumber;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "CreditRating", nullable = false, precision = 3)
	@javax.validation.constraints.NotNull
	public org.jooq.types.UByte getCreditRating() {
		return this.CreditRating;
	}

	public void setCreditRating(org.jooq.types.UByte CreditRating) {
		this.CreditRating = CreditRating;
	}

	@javax.persistence.Column(name = "PreferredVendorStatus", nullable = false)
	@javax.validation.constraints.NotNull
	public java.lang.Boolean getPreferredVendorStatus() {
		return this.PreferredVendorStatus;
	}

	public void setPreferredVendorStatus(java.lang.Boolean PreferredVendorStatus) {
		this.PreferredVendorStatus = PreferredVendorStatus;
	}

	@javax.persistence.Column(name = "ActiveFlag", nullable = false)
	@javax.validation.constraints.NotNull
	public java.lang.Boolean getActiveFlag() {
		return this.ActiveFlag;
	}

	public void setActiveFlag(java.lang.Boolean ActiveFlag) {
		this.ActiveFlag = ActiveFlag;
	}

	@javax.persistence.Column(name = "PurchasingWebServiceURL", length = 1024)
	@javax.validation.constraints.Size(max = 1024)
	public java.lang.String getPurchasingWebServiceURL() {
		return this.PurchasingWebServiceURL;
	}

	public void setPurchasingWebServiceURL(java.lang.String PurchasingWebServiceURL) {
		this.PurchasingWebServiceURL = PurchasingWebServiceURL;
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
