/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "Shift", schema = "HumanResources")
public class Shift implements java.io.Serializable {

	private static final long serialVersionUID = 1803105164;

	private org.jooq.types.UByte ShiftID;
	private java.lang.String     Name;
	private java.sql.Time        StartTime;
	private java.sql.Time        EndTime;
	private java.sql.Timestamp   ModifiedDate;

	public Shift() {}

	public Shift(
		org.jooq.types.UByte ShiftID,
		java.lang.String     Name,
		java.sql.Time        StartTime,
		java.sql.Time        EndTime,
		java.sql.Timestamp   ModifiedDate
	) {
		this.ShiftID = ShiftID;
		this.Name = Name;
		this.StartTime = StartTime;
		this.EndTime = EndTime;
		this.ModifiedDate = ModifiedDate;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ShiftID", unique = true, nullable = false, precision = 3)
	@javax.validation.constraints.NotNull
	public org.jooq.types.UByte getShiftID() {
		return this.ShiftID;
	}

	public void setShiftID(org.jooq.types.UByte ShiftID) {
		this.ShiftID = ShiftID;
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

	@javax.persistence.Column(name = "StartTime", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Time getStartTime() {
		return this.StartTime;
	}

	public void setStartTime(java.sql.Time StartTime) {
		this.StartTime = StartTime;
	}

	@javax.persistence.Column(name = "EndTime", nullable = false)
	@javax.validation.constraints.NotNull
	public java.sql.Time getEndTime() {
		return this.EndTime;
	}

	public void setEndTime(java.sql.Time EndTime) {
		this.EndTime = EndTime;
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
