/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test


import java.util.ArrayList
import java.util.Arrays
import java.util.List

import org.jooq.Sequence
import org.jooq.Table
import org.jooq.UDT
import org.jooq.impl.SchemaImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.MLibrary
import org.jooq.test.oraclescala.generatedclasses.test.tables.TArrays
import org.jooq.test.oraclescala.generatedclasses.test.tables.TAuthor
import org.jooq.test.oraclescala.generatedclasses.test.tables.TBook
import org.jooq.test.oraclescala.generatedclasses.test.tables.TBookStore
import org.jooq.test.oraclescala.generatedclasses.test.tables.TBookToBookStore
import org.jooq.test.oraclescala.generatedclasses.test.tables.TBooleans
import org.jooq.test.oraclescala.generatedclasses.test.tables.TDates
import org.jooq.test.oraclescala.generatedclasses.test.tables.TDirectory
import org.jooq.test.oraclescala.generatedclasses.test.tables.TExoticTypes
import org.jooq.test.oraclescala.generatedclasses.test.tables.TLanguage
import org.jooq.test.oraclescala.generatedclasses.test.tables.TReserved
import org.jooq.test.oraclescala.generatedclasses.test.tables.TTemp
import org.jooq.test.oraclescala.generatedclasses.test.tables.TTriggers
import org.jooq.test.oraclescala.generatedclasses.test.tables.TUnsigned
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_2155
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_2845CaseSensitivity
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_3711
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_639NumbersTable
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_725LobTest
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_785
import org.jooq.test.oraclescala.generatedclasses.test.tables.VAuthor
import org.jooq.test.oraclescala.generatedclasses.test.tables.VBook
import org.jooq.test.oraclescala.generatedclasses.test.tables.VIncomplete
import org.jooq.test.oraclescala.generatedclasses.test.tables.VLibrary
import org.jooq.test.oraclescala.generatedclasses.test.tables.XTestCase_2025
import org.jooq.test.oraclescala.generatedclasses.test.tables.XTestCase_64_69
import org.jooq.test.oraclescala.generatedclasses.test.tables.XTestCase_71
import org.jooq.test.oraclescala.generatedclasses.test.tables.XTestCase_85
import org.jooq.test.oraclescala.generatedclasses.test.tables.XUnused
import org.jooq.test.oraclescala.generatedclasses.test.udt.OInvalidType
import org.jooq.test.oraclescala.generatedclasses.test.udt.UAddressType
import org.jooq.test.oraclescala.generatedclasses.test.udt.UAuthorType
import org.jooq.test.oraclescala.generatedclasses.test.udt.UBookType
import org.jooq.test.oraclescala.generatedclasses.test.udt.UInvalidTable
import org.jooq.test.oraclescala.generatedclasses.test.udt.UInvalidType
import org.jooq.test.oraclescala.generatedclasses.test.udt.UNested_1
import org.jooq.test.oraclescala.generatedclasses.test.udt.UNested_3
import org.jooq.test.oraclescala.generatedclasses.test.udt.UStreetType
import org.jooq.test.oraclescala.generatedclasses.test.udt.U_2155Object
import org.jooq.test.oraclescala.generatedclasses.test.udt.U_3005
import org.jooq.test.oraclescala.generatedclasses.test.udt.U_3082_1
import org.jooq.test.oraclescala.generatedclasses.test.udt.U_3082_3
import org.jooq.test.oraclescala.generatedclasses.test.udt.U_3709


object Test {

	/**
	 * The reference instance of <code>TEST</code>
	 */
	val TEST = new Test
}

/**
 * This class is generated by jOOQ.
 */
class Test extends SchemaImpl("TEST") {

	override def getSequences : List[Sequence[_]] = {
		val result = new ArrayList[Sequence[_]]
		result.addAll(getSequences0)
		result
	}

	private def getSequences0() : List[Sequence[_]] = {
		return Arrays.asList[Sequence[_]](
			Sequences.S_AUTHOR_ID,
			Sequences.S_3899$,
			Sequences.S_961_BIG_INTEGER,
			Sequences.S_961_BYTE,
			Sequences.S_961_INT,
			Sequences.S_961_LONG,
			Sequences.S_961_SHORT)
	}

	override def getTables : List[Table[_]] = {
		val result = new ArrayList[Table[_]]
		result.addAll(getTables0)
		result
	}

	private def getTables0() : List[Table[_]] = {
		return Arrays.asList[Table[_]](
			MLibrary.M_LIBRARY,
			TArrays.T_ARRAYS,
			TAuthor.T_AUTHOR,
			TBook.T_BOOK,
			TBookStore.T_BOOK_STORE,
			TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			TBooleans.T_BOOLEANS,
			TDates.T_DATES,
			TDirectory.T_DIRECTORY,
			TExoticTypes.T_EXOTIC_TYPES,
			TLanguage.T_LANGUAGE,
			TReserved.T_RESERVED,
			TTemp.T_TEMP,
			TTriggers.T_TRIGGERS,
			TUnsigned.T_UNSIGNED,
			T_2155.T_2155,
			T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY,
			T_3711.T_3711,
			T_639NumbersTable.T_639_NUMBERS_TABLE,
			T_725LobTest.T_725_LOB_TEST,
			T_785.T_785,
			VAuthor.V_AUTHOR,
			VBook.V_BOOK,
			VIncomplete.V_INCOMPLETE,
			VLibrary.V_LIBRARY,
			XTestCase_2025.X_TEST_CASE_2025,
			XTestCase_64_69.X_TEST_CASE_64_69,
			XTestCase_71.X_TEST_CASE_71,
			XTestCase_85.X_TEST_CASE_85,
			XUnused.X_UNUSED)
	}

	override def getUDTs : List[UDT[_]] = {
		val result = new ArrayList[UDT[_]]
		result.addAll(getUDTs0)
		result
	}

	private def getUDTs0() : List[UDT[_]] = {
		return Arrays.asList[UDT[_]](
			OInvalidType.O_INVALID_TYPE,
			UAddressType.U_ADDRESS_TYPE,
			UAuthorType.U_AUTHOR_TYPE,
			UBookType.U_BOOK_TYPE,
			UInvalidTable.U_INVALID_TABLE,
			UInvalidType.U_INVALID_TYPE,
			UNested_1.U_NESTED_1,
			UNested_3.U_NESTED_3,
			UStreetType.U_STREET_TYPE,
			U_2155Object.U_2155_OBJECT,
			U_3005.U_3005,
			U_3082_1.U_3082_1,
			U_3082_3.U_3082_3,
			U_3709.U_3709)
	}
}
