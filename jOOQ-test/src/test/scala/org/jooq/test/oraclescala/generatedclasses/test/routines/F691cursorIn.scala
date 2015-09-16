/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.routines


import java.math.BigDecimal

import org.jooq.Field
import org.jooq.Parameter
import org.jooq.Record
import org.jooq.Result
import org.jooq.impl.AbstractRoutine
import org.jooq.test.oraclescala.generatedclasses.test.Test


object F691cursorIn {

	/**
	 * The parameter <code>TEST.F691CURSOR_IN.RETURN_VALUE</code>.
	 */
	val RETURN_VALUE : Parameter[BigDecimal] = AbstractRoutine.createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false)

	/**
	 * The parameter <code>TEST.F691CURSOR_IN.C</code>.
	 */
	val C : Parameter[Result[Record]] = AbstractRoutine.createParameter("C", org.jooq.impl.SQLDataType.RESULT, false)
}

/**
 * This class is generated by jOOQ.
 */
class F691cursorIn extends AbstractRoutine[BigDecimal]("F691CURSOR_IN", Test.TEST, org.jooq.impl.SQLDataType.NUMERIC) {
	{
		setReturnParameter(F691cursorIn.RETURN_VALUE)
		addInParameter(F691cursorIn.C)
	}

	/**
	 * Set the <code>C</code> parameter IN value to the routine
	 */
	def setC(value : Result[Record]) : Unit = {
		setValue(F691cursorIn.C, value)
	}

	/**
	 * Set the <code>C</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	def setC(field : Field[Result[Record]]) : Unit = {
		setField(F691cursorIn.C, field)
	}
}
