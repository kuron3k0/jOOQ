/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;


import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.hsqldb.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PUnused extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1968484073;

	/**
	 * The parameter <code>PUBLIC.P_UNUSED.IN1</code>.
	 */
	public static final Parameter<java.lang.String> IN1 = createParameter("IN1", org.jooq.impl.SQLDataType.VARCHAR.length(50), false);

	/**
	 * The parameter <code>PUBLIC.P_UNUSED.OUT1</code>.
	 */
	public static final Parameter<java.lang.Integer> OUT1 = createParameter("OUT1", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>PUBLIC.P_UNUSED.OUT2</code>.
	 */
	public static final Parameter<java.lang.Integer> OUT2 = createParameter("OUT2", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public PUnused() {
		super("P_UNUSED", Public.PUBLIC);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	/**
	 * Set the <code>IN1</code> parameter IN value to the routine
	 */
	public void setIn1(java.lang.String value) {
		setValue(IN1, value);
	}

	/**
	 * Set the <code>OUT2</code> parameter IN value to the routine
	 */
	public void setOut2(java.lang.Integer value) {
		setValue(OUT2, value);
	}

	/**
	 * Get the <code>OUT1</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getOut1() {
		return getValue(OUT1);
	}

	/**
	 * Get the <code>OUT2</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getOut2() {
		return getValue(OUT2);
	}
}
