/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.daos


import java.io.Serializable
import java.lang.Integer
import java.lang.Object
import java.lang.String
import java.util.List
import java.util.UUID

import org.jooq.Configuration
import org.jooq.impl.DAOImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.TExoticTypes
import org.jooq.test.oraclescala.generatedclasses.test.tables.records.TExoticTypesRecord


/**
 * This class is generated by jOOQ.
 */
class TExoticTypesDao(configuration : Configuration) extends DAOImpl[TExoticTypesRecord, org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes, Integer](TExoticTypes.T_EXOTIC_TYPES, classOf[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes], configuration) {

	/**
	 * Create a new TExoticTypesDao without any configuration
	 */
	def this() = {
		this(null)
	}

	override protected def getId(o : org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes) : Integer = {
		o.getId
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	def fetchById(values : Integer*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes] = {
		fetch(TExoticTypes.T_EXOTIC_TYPES.ID, values:_*)
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	def fetchOneById(value : Integer) : org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes = {
		fetchOne(TExoticTypes.T_EXOTIC_TYPES.ID, value)
	}

	/**
	 * Fetch records that have <code>UU IN (values)</code>
	 */
	def fetchByUu(values : UUID*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes] = {
		fetch(TExoticTypes.T_EXOTIC_TYPES.UU, values:_*)
	}

	/**
	 * Fetch records that have <code>JAVA_IO_SERIALIZABLE IN (values)</code>
	 */
	def fetchByJavaIoSerializable(values : Serializable*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes] = {
		fetch(TExoticTypes.T_EXOTIC_TYPES.JAVA_IO_SERIALIZABLE, values:_*)
	}

	/**
	 * Fetch records that have <code>PLAIN_SQL_CONVERTER_XML IN (values)</code>
	 */
	def fetchByPlainSqlConverterXml(values : String*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes] = {
		fetch(TExoticTypes.T_EXOTIC_TYPES.PLAIN_SQL_CONVERTER_XML, values:_*)
	}

	/**
	 * Fetch records that have <code>PLAIN_SQL_BINDING_XML IN (values)</code>
	 */
	def fetchByPlainSqlBindingXml(values : String*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes] = {
		fetch(TExoticTypes.T_EXOTIC_TYPES.PLAIN_SQL_BINDING_XML, values:_*)
	}

	/**
	 * Fetch records that have <code>ORACLE_XML_AS_IS IN (values)</code>
	 */
	def fetchByOracleXmlAsIs(values : Object*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes] = {
		fetch(TExoticTypes.T_EXOTIC_TYPES.ORACLE_XML_AS_IS, values:_*)
	}

	/**
	 * Fetch records that have <code>ORACLE_XML_AS_DOCUMENT IN (values)</code>
	 */
	def fetchByOracleXmlAsDocument(values : Object*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes] = {
		fetch(TExoticTypes.T_EXOTIC_TYPES.ORACLE_XML_AS_DOCUMENT, values:_*)
	}

	/**
	 * Fetch records that have <code>ORACLE_XML_AS_SQLXML IN (values)</code>
	 */
	def fetchByOracleXmlAsSqlxml(values : Object*) : List[org.jooq.test.oraclescala.generatedclasses.test.tables.pojos.TExoticTypes] = {
		fetch(TExoticTypes.T_EXOTIC_TYPES.ORACLE_XML_AS_SQLXML, values:_*)
	}
}
