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
public class PResultsAndOutParameters extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1556735059;

	/**
	 * The parameter <code>test.p_results_and_out_parameters.p_result_sets</code>.
	 */
	public static final Parameter<Integer> P_RESULT_SETS = createParameter("p_result_sets", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>test.p_results_and_out_parameters.p_count</code>.
	 */
	public static final Parameter<Integer> P_COUNT = createParameter("p_count", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public PResultsAndOutParameters() {
		super("p_results_and_out_parameters", Test.TEST);

		addInParameter(P_RESULT_SETS);
		addOutParameter(P_COUNT);
	}

	/**
	 * Set the <code>p_result_sets</code> parameter IN value to the routine
	 */
	public void setPResultSets(Integer value) {
		setValue(P_RESULT_SETS, value);
	}

	/**
	 * Get the <code>p_count</code> parameter OUT value from the routine
	 */
	public Integer getPCount() {
		return getValue(P_COUNT);
	}
}
