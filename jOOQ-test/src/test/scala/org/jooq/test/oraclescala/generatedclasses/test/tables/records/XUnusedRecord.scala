/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.records


import java.lang.Integer
import java.lang.String
import java.math.BigDecimal
import java.math.BigInteger

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.UniqueConstraint
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import org.jooq.Field
import org.jooq.Record16
import org.jooq.Record2
import org.jooq.Row16
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.XUnused


/**
 * An unused table in the same schema.
 * 
 * "Its comments contain special characters"
 */
@Entity
@Table(name = "X_UNUSED", schema = "TEST", uniqueConstraints = Array(
	new UniqueConstraint(columnNames = Array("ID", "NAME"))
))
class XUnusedRecord extends UpdatableRecordImpl[XUnusedRecord](XUnused.X_UNUSED) with Record16[Integer, String, BigInteger, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, BigDecimal, Integer, String] {

	/**
	 * Setter for <code>TEST.X_UNUSED.ID</code>. An unused column of an unused table in the same schema.

"Its comments contain special characters"
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.ID</code>. An unused column of an unused table in the same schema.

"Its comments contain special characters"
	 */
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.NAME</code>.
	 */
	def setName(value : String) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.NAME</code>.
	 */
	@Column(name = "NAME", nullable = false, length = 10)
	@NotNull
	@Size(max = 10)
	def getName : String = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.BIG_INTEGER</code>.
	 */
	def setBigInteger(value : BigInteger) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.BIG_INTEGER</code>.
	 */
	@Column(name = "BIG_INTEGER", precision = 38)
	def getBigInteger : BigInteger = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[BigInteger]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.ID_REF</code>.
	 */
	def setIdRef(value : Integer) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.ID_REF</code>.
	 */
	@Column(name = "ID_REF", precision = 7)
	def getIdRef : Integer = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.CLASS</code>.
	 */
	def setClass_(value : Integer) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.CLASS</code>.
	 */
	@Column(name = "CLASS", precision = 7)
	def getClass_ : Integer = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.FIELDS</code>.
	 */
	def setFields(value : Integer) : Unit = {
		setValue(5, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.FIELDS</code>.
	 */
	@Column(name = "FIELDS", precision = 7)
	def getFields : Integer = {
		val r = getValue(5)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.CONFIGURATION</code>.
	 */
	def setConfiguration(value : Integer) : Unit = {
		setValue(6, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.CONFIGURATION</code>.
	 */
	@Column(name = "CONFIGURATION", precision = 7)
	def getConfiguration : Integer = {
		val r = getValue(6)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.U_D_T</code>.
	 */
	def setUDT(value : Integer) : Unit = {
		setValue(7, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.U_D_T</code>.
	 */
	@Column(name = "U_D_T", precision = 7)
	def getUDT : Integer = {
		val r = getValue(7)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.META_DATA</code>.
	 */
	def setMetaData(value : Integer) : Unit = {
		setValue(8, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.META_DATA</code>.
	 */
	@Column(name = "META_DATA", precision = 7)
	def getMetaData : Integer = {
		val r = getValue(8)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.TYPE0</code>.
	 */
	def setType0(value : Integer) : Unit = {
		setValue(9, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.TYPE0</code>.
	 */
	@Column(name = "TYPE0", precision = 7)
	def getType0 : Integer = {
		val r = getValue(9)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.PRIMARY_KEY</code>.
	 */
	def setPrimaryKey_(value : Integer) : Unit = {
		setValue(10, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.PRIMARY_KEY</code>.
	 */
	@Column(name = "PRIMARY_KEY", precision = 7)
	def getPrimaryKey_ : Integer = {
		val r = getValue(10)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.PRIMARYKEY</code>.
	 */
	def setPrimarykey(value : Integer) : Unit = {
		setValue(11, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.PRIMARYKEY</code>.
	 */
	@Column(name = "PRIMARYKEY", precision = 7)
	def getPrimarykey : Integer = {
		val r = getValue(11)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.NAME_REF</code>.
	 */
	def setNameRef(value : String) : Unit = {
		setValue(12, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.NAME_REF</code>.
	 */
	@Column(name = "NAME_REF", length = 10)
	@Size(max = 10)
	def getNameRef : String = {
		val r = getValue(12)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.FIELD 737</code>.
	 */
	def setField_737(value : BigDecimal) : Unit = {
		setValue(13, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.FIELD 737</code>.
	 */
	@Column(name = "FIELD 737", precision = 25, scale = 2)
	def getField_737 : BigDecimal = {
		val r = getValue(13)
		if (r == null) null else r.asInstanceOf[BigDecimal]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.MS_UNUSED_ID_REF</code>.
	 */
	def setMsUnusedIdRef(value : Integer) : Unit = {
		setValue(14, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.MS_UNUSED_ID_REF</code>.
	 */
	@Column(name = "MS_UNUSED_ID_REF", precision = 7)
	def getMsUnusedIdRef : Integer = {
		val r = getValue(14)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.X_UNUSED.MS_UNUSED_NAME_REF</code>.
	 */
	def setMsUnusedNameRef(value : String) : Unit = {
		setValue(15, value)
	}

	/**
	 * Getter for <code>TEST.X_UNUSED.MS_UNUSED_NAME_REF</code>.
	 */
	@Column(name = "MS_UNUSED_NAME_REF", length = 10)
	@Size(max = 10)
	def getMsUnusedNameRef : String = {
		val r = getValue(15)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record2[Integer, String] = {
		return super.key.asInstanceOf[ Record2[Integer, String] ]
	}

	// -------------------------------------------------------------------------
	// Record16 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row16[Integer, String, BigInteger, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, BigDecimal, Integer, String] = {
		super.fieldsRow.asInstanceOf[ Row16[Integer, String, BigInteger, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, BigDecimal, Integer, String] ]
	}

	override def valuesRow : Row16[Integer, String, BigInteger, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, BigDecimal, Integer, String] = {
		super.valuesRow.asInstanceOf[ Row16[Integer, String, BigInteger, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, String, BigDecimal, Integer, String] ]
	}
	override def field1 : Field[Integer] = XUnused.X_UNUSED.ID
	override def field2 : Field[String] = XUnused.X_UNUSED.NAME
	override def field3 : Field[BigInteger] = XUnused.X_UNUSED.BIG_INTEGER
	override def field4 : Field[Integer] = XUnused.X_UNUSED.ID_REF
	override def field5 : Field[Integer] = XUnused.X_UNUSED.CLASS
	override def field6 : Field[Integer] = XUnused.X_UNUSED.FIELDS
	override def field7 : Field[Integer] = XUnused.X_UNUSED.CONFIGURATION
	override def field8 : Field[Integer] = XUnused.X_UNUSED.U_D_T
	override def field9 : Field[Integer] = XUnused.X_UNUSED.META_DATA
	override def field10 : Field[Integer] = XUnused.X_UNUSED.TYPE0
	override def field11 : Field[Integer] = XUnused.X_UNUSED.PRIMARY_KEY
	override def field12 : Field[Integer] = XUnused.X_UNUSED.PRIMARYKEY
	override def field13 : Field[String] = XUnused.X_UNUSED.NAME_REF
	override def field14 : Field[BigDecimal] = XUnused.X_UNUSED.FIELD_737
	override def field15 : Field[Integer] = XUnused.X_UNUSED.MS_UNUSED_ID_REF
	override def field16 : Field[String] = XUnused.X_UNUSED.MS_UNUSED_NAME_REF
	override def value1 : Integer = getId
	override def value2 : String = getName
	override def value3 : BigInteger = getBigInteger
	override def value4 : Integer = getIdRef
	override def value5 : Integer = getClass_
	override def value6 : Integer = getFields
	override def value7 : Integer = getConfiguration
	override def value8 : Integer = getUDT
	override def value9 : Integer = getMetaData
	override def value10 : Integer = getType0
	override def value11 : Integer = getPrimaryKey_
	override def value12 : Integer = getPrimarykey
	override def value13 : String = getNameRef
	override def value14 : BigDecimal = getField_737
	override def value15 : Integer = getMsUnusedIdRef
	override def value16 : String = getMsUnusedNameRef

	override def value1(value : Integer) : XUnusedRecord = {
		setId(value)
		this
	}

	override def value2(value : String) : XUnusedRecord = {
		setName(value)
		this
	}

	override def value3(value : BigInteger) : XUnusedRecord = {
		setBigInteger(value)
		this
	}

	override def value4(value : Integer) : XUnusedRecord = {
		setIdRef(value)
		this
	}

	override def value5(value : Integer) : XUnusedRecord = {
		setClass_(value)
		this
	}

	override def value6(value : Integer) : XUnusedRecord = {
		setFields(value)
		this
	}

	override def value7(value : Integer) : XUnusedRecord = {
		setConfiguration(value)
		this
	}

	override def value8(value : Integer) : XUnusedRecord = {
		setUDT(value)
		this
	}

	override def value9(value : Integer) : XUnusedRecord = {
		setMetaData(value)
		this
	}

	override def value10(value : Integer) : XUnusedRecord = {
		setType0(value)
		this
	}

	override def value11(value : Integer) : XUnusedRecord = {
		setPrimaryKey_(value)
		this
	}

	override def value12(value : Integer) : XUnusedRecord = {
		setPrimarykey(value)
		this
	}

	override def value13(value : String) : XUnusedRecord = {
		setNameRef(value)
		this
	}

	override def value14(value : BigDecimal) : XUnusedRecord = {
		setField_737(value)
		this
	}

	override def value15(value : Integer) : XUnusedRecord = {
		setMsUnusedIdRef(value)
		this
	}

	override def value16(value : String) : XUnusedRecord = {
		setMsUnusedNameRef(value)
		this
	}

	override def values(value1 : Integer, value2 : String, value3 : BigInteger, value4 : Integer, value5 : Integer, value6 : Integer, value7 : Integer, value8 : Integer, value9 : Integer, value10 : Integer, value11 : Integer, value12 : Integer, value13 : String, value14 : BigDecimal, value15 : Integer, value16 : String) : XUnusedRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this.value5(value5)
		this.value6(value6)
		this.value7(value7)
		this.value8(value8)
		this.value9(value9)
		this.value10(value10)
		this.value11(value11)
		this.value12(value12)
		this.value13(value13)
		this.value14(value14)
		this.value15(value15)
		this.value16(value16)
		this
	}

	/**
	 * Create a detached, initialised XUnusedRecord
	 */
	def this(id : Integer, name : String, bigInteger : BigInteger, idRef : Integer, `class` : Integer, fields : Integer, configuration : Integer, uDT : Integer, metaData : Integer, type0 : Integer, primaryKey : Integer, primarykey : Integer, nameRef : String, field_737 : BigDecimal, msUnusedIdRef : Integer, msUnusedNameRef : String) = {
		this()

		setValue(0, id)
		setValue(1, name)
		setValue(2, bigInteger)
		setValue(3, idRef)
		setValue(4, `class`)
		setValue(5, fields)
		setValue(6, configuration)
		setValue(7, uDT)
		setValue(8, metaData)
		setValue(9, type0)
		setValue(10, primaryKey)
		setValue(11, primarykey)
		setValue(12, nameRef)
		setValue(13, field_737)
		setValue(14, msUnusedIdRef)
		setValue(15, msUnusedNameRef)
	}
}
