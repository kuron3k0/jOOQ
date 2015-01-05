/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F317 extends AbstractRoutine<BigDecimal> implements Cloneable {

	private static final long serialVersionUID = 2103558729;

	/**
	 * The parameter <code>F317.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>F317.P1</code>.
	 */
	public static final Parameter<BigDecimal> P1 = createParameter("P1", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>F317.P2</code>.
	 */
	public static final Parameter<BigDecimal> P2 = createParameter("P2", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>F317.P3</code>.
	 */
	public static final Parameter<BigDecimal> P3 = createParameter("P3", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>F317.P4</code>.
	 */
	public static final Parameter<BigDecimal> P4 = createParameter("P4", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * Create a new routine call instance
	 */
	public F317() {
		super("F317", DefaultSchema.DEFAULT_SCHEMA, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
		addInParameter(P2);
		addInParameter(P3);
		addInParameter(P4);
	}

	/**
	 * Set the <code>P1</code> parameter IN value to the routine
	 */
	public void setP1(Number value) {
		setNumber(P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP1(Field<? extends Number> field) {
		setNumber(P1, field);
	}

	/**
	 * Set the <code>P2</code> parameter IN value to the routine
	 */
	public void setP2(Number value) {
		setNumber(P2, value);
	}

	/**
	 * Set the <code>P2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP2(Field<? extends Number> field) {
		setNumber(P2, field);
	}

	/**
	 * Set the <code>P3</code> parameter IN value to the routine
	 */
	public void setP3(Number value) {
		setNumber(P3, value);
	}

	/**
	 * Set the <code>P3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP3(Field<? extends Number> field) {
		setNumber(P3, field);
	}

	/**
	 * Set the <code>P4</code> parameter IN value to the routine
	 */
	public void setP4(Number value) {
		setNumber(P4, value);
	}

	/**
	 * Set the <code>P4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP4(Field<? extends Number> field) {
		setNumber(P4, field);
	}
}
