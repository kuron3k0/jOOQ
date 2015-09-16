/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.records


import java.lang.Integer
import java.lang.String
import java.math.BigDecimal
import java.sql.Timestamp

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.validation.constraints.Size

import org.jooq.Field
import org.jooq.Record11
import org.jooq.Row11
import org.jooq.impl.TableRecordImpl
import org.jooq.test.all.scala.Test
import org.jooq.test.oraclescala.generatedclasses.test.tables.VBook

import scala.Array
import scala.Byte


/**
 * This class is generated by jOOQ.
 */
@Entity
@Table(name = "V_BOOK", schema = "TEST")
class VBookRecord extends TableRecordImpl[VBookRecord](VBook.V_BOOK) with Test with Record11[Integer, Integer, Integer, Integer, String, Integer, Integer, String, Array[Byte], BigDecimal, Timestamp] {

	/**
	 * Setter for <code>TEST.V_BOOK.ID</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.ID</code>.
	 */
	@Column(name = "ID", nullable = false, precision = 7)
	@NotNull
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.AUTHOR_ID</code>.
	 */
	def setAuthorId(value : Integer) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.AUTHOR_ID</code>.
	 */
	@Column(name = "AUTHOR_ID", nullable = false, precision = 7)
	@NotNull
	def getAuthorId : Integer = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.CO_AUTHOR_ID</code>.
	 */
	def setCoAuthorId(value : Integer) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.CO_AUTHOR_ID</code>.
	 */
	@Column(name = "CO_AUTHOR_ID", precision = 7)
	def getCoAuthorId : Integer = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.DETAILS_ID</code>.
	 */
	def setDetailsId(value : Integer) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.DETAILS_ID</code>.
	 */
	@Column(name = "DETAILS_ID", precision = 7)
	def getDetailsId : Integer = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.TITLE</code>.
	 */
	def setTitle(value : String) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.TITLE</code>.
	 */
	@Column(name = "TITLE", nullable = false, length = 400)
	@NotNull
	@Size(max = 400)
	def getTitle : String = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.PUBLISHED_IN</code>.
	 */
	def setPublishedIn(value : Integer) : Unit = {
		setValue(5, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.PUBLISHED_IN</code>.
	 */
	@Column(name = "PUBLISHED_IN", nullable = false, precision = 7)
	@NotNull
	def getPublishedIn : Integer = {
		val r = getValue(5)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.LANGUAGE_ID</code>.
	 */
	def setLanguageId(value : Integer) : Unit = {
		setValue(6, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.LANGUAGE_ID</code>.
	 */
	@Column(name = "LANGUAGE_ID", nullable = false, precision = 7)
	@NotNull
	def getLanguageId : Integer = {
		val r = getValue(6)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.CONTENT_TEXT</code>.
	 */
	def setContentText(value : String) : Unit = {
		setValue(7, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.CONTENT_TEXT</code>.
	 */
	@Column(name = "CONTENT_TEXT")
	def getContentText : String = {
		val r = getValue(7)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.CONTENT_PDF</code>.
	 */
	def setContentPdf(value : Array[Byte]) : Unit = {
		setValue(8, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.CONTENT_PDF</code>.
	 */
	@Column(name = "CONTENT_PDF")
	def getContentPdf : Array[Byte] = {
		val r = getValue(8)
		if (r == null) null else r.asInstanceOf[Array[Byte]]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.REC_VERSION</code>.
	 */
	def setRecVersion(value : BigDecimal) : Unit = {
		setValue(9, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.REC_VERSION</code>.
	 */
	@Column(name = "REC_VERSION")
	def getRecVersion : BigDecimal = {
		val r = getValue(9)
		if (r == null) null else r.asInstanceOf[BigDecimal]
	}

	/**
	 * Setter for <code>TEST.V_BOOK.REC_TIMESTAMP</code>.
	 */
	def setRecTimestamp(value : Timestamp) : Unit = {
		setValue(10, value)
	}

	/**
	 * Getter for <code>TEST.V_BOOK.REC_TIMESTAMP</code>.
	 */
	@Column(name = "REC_TIMESTAMP")
	def getRecTimestamp : Timestamp = {
		val r = getValue(10)
		if (r == null) null else r.asInstanceOf[Timestamp]
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row11[Integer, Integer, Integer, Integer, String, Integer, Integer, String, Array[Byte], BigDecimal, Timestamp] = {
		super.fieldsRow.asInstanceOf[ Row11[Integer, Integer, Integer, Integer, String, Integer, Integer, String, Array[Byte], BigDecimal, Timestamp] ]
	}

	override def valuesRow : Row11[Integer, Integer, Integer, Integer, String, Integer, Integer, String, Array[Byte], BigDecimal, Timestamp] = {
		super.valuesRow.asInstanceOf[ Row11[Integer, Integer, Integer, Integer, String, Integer, Integer, String, Array[Byte], BigDecimal, Timestamp] ]
	}
	override def field1 : Field[Integer] = VBook.V_BOOK.ID
	override def field2 : Field[Integer] = VBook.V_BOOK.AUTHOR_ID
	override def field3 : Field[Integer] = VBook.V_BOOK.CO_AUTHOR_ID
	override def field4 : Field[Integer] = VBook.V_BOOK.DETAILS_ID
	override def field5 : Field[String] = VBook.V_BOOK.TITLE
	override def field6 : Field[Integer] = VBook.V_BOOK.PUBLISHED_IN
	override def field7 : Field[Integer] = VBook.V_BOOK.LANGUAGE_ID
	override def field8 : Field[String] = VBook.V_BOOK.CONTENT_TEXT
	override def field9 : Field[Array[Byte]] = VBook.V_BOOK.CONTENT_PDF
	override def field10 : Field[BigDecimal] = VBook.V_BOOK.REC_VERSION
	override def field11 : Field[Timestamp] = VBook.V_BOOK.REC_TIMESTAMP
	override def value1 : Integer = getId
	override def value2 : Integer = getAuthorId
	override def value3 : Integer = getCoAuthorId
	override def value4 : Integer = getDetailsId
	override def value5 : String = getTitle
	override def value6 : Integer = getPublishedIn
	override def value7 : Integer = getLanguageId
	override def value8 : String = getContentText
	override def value9 : Array[Byte] = getContentPdf
	override def value10 : BigDecimal = getRecVersion
	override def value11 : Timestamp = getRecTimestamp

	override def value1(value : Integer) : VBookRecord = {
		setId(value)
		this
	}

	override def value2(value : Integer) : VBookRecord = {
		setAuthorId(value)
		this
	}

	override def value3(value : Integer) : VBookRecord = {
		setCoAuthorId(value)
		this
	}

	override def value4(value : Integer) : VBookRecord = {
		setDetailsId(value)
		this
	}

	override def value5(value : String) : VBookRecord = {
		setTitle(value)
		this
	}

	override def value6(value : Integer) : VBookRecord = {
		setPublishedIn(value)
		this
	}

	override def value7(value : Integer) : VBookRecord = {
		setLanguageId(value)
		this
	}

	override def value8(value : String) : VBookRecord = {
		setContentText(value)
		this
	}

	override def value9(value : Array[Byte]) : VBookRecord = {
		setContentPdf(value)
		this
	}

	override def value10(value : BigDecimal) : VBookRecord = {
		setRecVersion(value)
		this
	}

	override def value11(value : Timestamp) : VBookRecord = {
		setRecTimestamp(value)
		this
	}

	override def values(value1 : Integer, value2 : Integer, value3 : Integer, value4 : Integer, value5 : String, value6 : Integer, value7 : Integer, value8 : String, value9 : Array[Byte], value10 : BigDecimal, value11 : Timestamp) : VBookRecord = {
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
		this
	}

	/**
	 * Create a detached, initialised VBookRecord
	 */
	def this(id : Integer, authorId : Integer, coAuthorId : Integer, detailsId : Integer, title : String, publishedIn : Integer, languageId : Integer, contentText : String, contentPdf : Array[Byte], recVersion : BigDecimal, recTimestamp : Timestamp) = {
		this()

		setValue(0, id)
		setValue(1, authorId)
		setValue(2, coAuthorId)
		setValue(3, detailsId)
		setValue(4, title)
		setValue(5, publishedIn)
		setValue(6, languageId)
		setValue(7, contentText)
		setValue(8, contentPdf)
		setValue(9, recVersion)
		setValue(10, recTimestamp)
	}
}
