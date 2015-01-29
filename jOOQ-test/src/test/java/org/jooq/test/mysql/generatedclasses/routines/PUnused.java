/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.routines;


import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.mysql.generatedclasses.Test;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PUnused extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -767079731;

	/**
	 * The parameter <code>test.p_unused.in1</code>.
	 */
	public static final Parameter<String> IN1 = createParameter("in1", org.jooq.impl.SQLDataType.VARCHAR.length(50), false);

	/**
	 * The parameter <code>test.p_unused.out1</code>.
	 */
	public static final Parameter<Byte> OUT1 = createParameter("out1", org.jooq.impl.SQLDataType.TINYINT, false);

	/**
	 * The parameter <code>test.p_unused.out2</code>.
	 */
	public static final Parameter<Byte> OUT2 = createParameter("out2", org.jooq.impl.SQLDataType.TINYINT, false);

	/**
	 * Create a new routine call instance
	 */
	public PUnused() {
		super("p_unused", Test.TEST);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	/**
	 * Set the <code>in1</code> parameter IN value to the routine
	 */
	public void setIn1(String value) {
		setValue(IN1, value);
	}

	/**
	 * Set the <code>out2</code> parameter IN value to the routine
	 */
	public void setOut2(Byte value) {
		setValue(OUT2, value);
	}

	/**
	 * Get the <code>out1</code> parameter OUT value from the routine
	 */
	public Byte getOut1() {
		return getValue(OUT1);
	}

	/**
	 * Get the <code>out2</code> parameter OUT value from the routine
	 */
	public Byte getOut2() {
		return getValue(OUT2);
	}
}
