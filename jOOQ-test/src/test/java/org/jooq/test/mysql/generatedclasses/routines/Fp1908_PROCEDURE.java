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
public class Fp1908_PROCEDURE extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 2142025609;

	/**
	 * The parameter <code>test.fp1908.p1</code>.
	 */
	public static final Parameter<Integer> P1 = createParameter("p1", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>test.fp1908.p2</code>.
	 */
	public static final Parameter<Integer> P2 = createParameter("p2", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public Fp1908_PROCEDURE() {
		super("fp1908", Test.TEST);

		addInParameter(P1);
		addOutParameter(P2);
		setOverloaded(true);
	}

	/**
	 * Set the <code>p1</code> parameter IN value to the routine
	 */
	public void setP1(Integer value) {
		setValue(P1, value);
	}

	/**
	 * Get the <code>p2</code> parameter OUT value from the routine
	 */
	public Integer getP2() {
		return getValue(P2);
	}
}
