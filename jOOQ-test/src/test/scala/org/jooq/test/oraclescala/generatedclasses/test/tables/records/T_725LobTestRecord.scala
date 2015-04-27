/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.records


import java.lang.Integer
import java.lang.String

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record6
import org.jooq.Row6
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_725LobTest

import scala.Array


/**
 * This class is generated by jOOQ.
 */
@Entity
@Table(name = "T_725_LOB_TEST", schema = "TEST")
class T_725LobTestRecord extends UpdatableRecordImpl[T_725LobTestRecord](T_725LobTest.T_725_LOB_TEST) with Record6[Integer, Array[scala.Byte], String, Array[scala.Byte], String, Array[scala.Byte]] {

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.ID</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.LOB</code>.
	 */
	def setLob(value : Array[scala.Byte]) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.LOB</code>.
	 */
	@Column(name = "LOB")
	def getLob : Array[scala.Byte] = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[Array[scala.Byte]]
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.USER_JAVA_SQL_CLOB</code>.
	 */
	def setUserJavaSqlClob(value : String) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.USER_JAVA_SQL_CLOB</code>.
	 */
	@Column(name = "USER_JAVA_SQL_CLOB")
	def getUserJavaSqlClob : String = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.USER_JAVA_SQL_BLOB</code>.
	 */
	def setUserJavaSqlBlob(value : Array[scala.Byte]) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.USER_JAVA_SQL_BLOB</code>.
	 */
	@Column(name = "USER_JAVA_SQL_BLOB")
	def getUserJavaSqlBlob : Array[scala.Byte] = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[Array[scala.Byte]]
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_CLOB</code>.
	 */
	def setJooqJavaSqlClob(value : String) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_CLOB</code>.
	 */
	@Column(name = "JOOQ_JAVA_SQL_CLOB")
	def getJooqJavaSqlClob : String = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_BLOB</code>.
	 */
	def setJooqJavaSqlBlob(value : Array[scala.Byte]) : Unit = {
		setValue(5, value)
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.JOOQ_JAVA_SQL_BLOB</code>.
	 */
	@Column(name = "JOOQ_JAVA_SQL_BLOB")
	def getJooqJavaSqlBlob : Array[scala.Byte] = {
		val r = getValue(5)
		if (r == null) null else r.asInstanceOf[Array[scala.Byte]]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[Integer] = {
		return super.key.asInstanceOf[ Record1[Integer] ]
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row6[Integer, Array[scala.Byte], String, Array[scala.Byte], String, Array[scala.Byte]] = {
		super.fieldsRow.asInstanceOf[ Row6[Integer, Array[scala.Byte], String, Array[scala.Byte], String, Array[scala.Byte]] ]
	}

	override def valuesRow : Row6[Integer, Array[scala.Byte], String, Array[scala.Byte], String, Array[scala.Byte]] = {
		super.valuesRow.asInstanceOf[ Row6[Integer, Array[scala.Byte], String, Array[scala.Byte], String, Array[scala.Byte]] ]
	}
	override def field1 : Field[Integer] = T_725LobTest.T_725_LOB_TEST.ID
	override def field2 : Field[Array[scala.Byte]] = T_725LobTest.T_725_LOB_TEST.LOB
	override def field3 : Field[String] = T_725LobTest.T_725_LOB_TEST.USER_JAVA_SQL_CLOB
	override def field4 : Field[Array[scala.Byte]] = T_725LobTest.T_725_LOB_TEST.USER_JAVA_SQL_BLOB
	override def field5 : Field[String] = T_725LobTest.T_725_LOB_TEST.JOOQ_JAVA_SQL_CLOB
	override def field6 : Field[Array[scala.Byte]] = T_725LobTest.T_725_LOB_TEST.JOOQ_JAVA_SQL_BLOB
	override def value1 : Integer = getId
	override def value2 : Array[scala.Byte] = getLob
	override def value3 : String = getUserJavaSqlClob
	override def value4 : Array[scala.Byte] = getUserJavaSqlBlob
	override def value5 : String = getJooqJavaSqlClob
	override def value6 : Array[scala.Byte] = getJooqJavaSqlBlob

	override def value1(value : Integer) : T_725LobTestRecord = {
		setId(value)
		this
	}

	override def value2(value : Array[scala.Byte]) : T_725LobTestRecord = {
		setLob(value)
		this
	}

	override def value3(value : String) : T_725LobTestRecord = {
		setUserJavaSqlClob(value)
		this
	}

	override def value4(value : Array[scala.Byte]) : T_725LobTestRecord = {
		setUserJavaSqlBlob(value)
		this
	}

	override def value5(value : String) : T_725LobTestRecord = {
		setJooqJavaSqlClob(value)
		this
	}

	override def value6(value : Array[scala.Byte]) : T_725LobTestRecord = {
		setJooqJavaSqlBlob(value)
		this
	}

	override def values(value1 : Integer, value2 : Array[scala.Byte], value3 : String, value4 : Array[scala.Byte], value5 : String, value6 : Array[scala.Byte]) : T_725LobTestRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this.value5(value5)
		this.value6(value6)
		this
	}

	/**
	 * Create a detached, initialised T_725LobTestRecord
	 */
	def this(id : Integer, lob : Array[scala.Byte], userJavaSqlClob : String, userJavaSqlBlob : Array[scala.Byte], jooqJavaSqlClob : String, jooqJavaSqlBlob : Array[scala.Byte]) = {
		this()

		setValue(0, id)
		setValue(1, lob)
		setValue(2, userJavaSqlClob)
		setValue(3, userJavaSqlBlob)
		setValue(4, jooqJavaSqlClob)
		setValue(5, jooqJavaSqlBlob)
	}
}
