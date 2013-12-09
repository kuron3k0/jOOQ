/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "Address", schema = "Person")
public class Address implements java.io.Serializable {

	private static final long serialVersionUID = -268608758;

	private java.lang.Integer  AddressID;
	private java.lang.String   AddressLine1;
	private java.lang.String   AddressLine2;
	private java.lang.String   City;
	private java.lang.Integer  StateProvinceID;
	private java.lang.String   PostalCode;
	private java.lang.Object   SpatialLocation;
	private java.util.UUID     rowguid;
	private java.sql.Timestamp ModifiedDate;

	public Address() {}

	public Address(
		java.lang.Integer  AddressID,
		java.lang.String   AddressLine1,
		java.lang.String   AddressLine2,
		java.lang.String   City,
		java.lang.Integer  StateProvinceID,
		java.lang.String   PostalCode,
		java.lang.Object   SpatialLocation,
		java.util.UUID     rowguid,
		java.sql.Timestamp ModifiedDate
	) {
		this.AddressID = AddressID;
		this.AddressLine1 = AddressLine1;
		this.AddressLine2 = AddressLine2;
		this.City = City;
		this.StateProvinceID = StateProvinceID;
		this.PostalCode = PostalCode;
		this.SpatialLocation = SpatialLocation;
		this.rowguid = rowguid;
		this.ModifiedDate = ModifiedDate;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "AddressID", unique = true, nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getAddressID() {
		return this.AddressID;
	}

	public void setAddressID(java.lang.Integer AddressID) {
		this.AddressID = AddressID;
	}

	@javax.persistence.Column(name = "AddressLine1", nullable = false, length = 60)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 60)
	public java.lang.String getAddressLine1() {
		return this.AddressLine1;
	}

	public void setAddressLine1(java.lang.String AddressLine1) {
		this.AddressLine1 = AddressLine1;
	}

	@javax.persistence.Column(name = "AddressLine2", length = 60)
	@javax.validation.constraints.Size(max = 60)
	public java.lang.String getAddressLine2() {
		return this.AddressLine2;
	}

	public void setAddressLine2(java.lang.String AddressLine2) {
		this.AddressLine2 = AddressLine2;
	}

	@javax.persistence.Column(name = "City", nullable = false, length = 30)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 30)
	public java.lang.String getCity() {
		return this.City;
	}

	public void setCity(java.lang.String City) {
		this.City = City;
	}

	@javax.persistence.Column(name = "StateProvinceID", nullable = false, precision = 10)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getStateProvinceID() {
		return this.StateProvinceID;
	}

	public void setStateProvinceID(java.lang.Integer StateProvinceID) {
		this.StateProvinceID = StateProvinceID;
	}

	@javax.persistence.Column(name = "PostalCode", nullable = false, length = 15)
	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 15)
	public java.lang.String getPostalCode() {
		return this.PostalCode;
	}

	public void setPostalCode(java.lang.String PostalCode) {
		this.PostalCode = PostalCode;
	}

	@javax.persistence.Column(name = "SpatialLocation")
	public java.lang.Object getSpatialLocation() {
		return this.SpatialLocation;
	}

	public void setSpatialLocation(java.lang.Object SpatialLocation) {
		this.SpatialLocation = SpatialLocation;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	@javax.validation.constraints.NotNull
	public java.util.UUID getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.util.UUID rowguid) {
		this.rowguid = rowguid;
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
