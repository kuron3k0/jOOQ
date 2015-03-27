/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.packages.pls_objects;


import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.oracle.generatedclasses.test.Test;
import org.jooq.test.oracle.generatedclasses.test.packages.PlsObjects;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PBool extends AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -2074569433;

	/**
	 * The parameter <code>TEST.PLS_OBJECTS.P_BOOL.I</code>.
	 */
	public static final Parameter<Object> I = createParameter("I", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * The parameter <code>TEST.PLS_OBJECTS.P_BOOL.IO</code>.
	 */
	public static final Parameter<Object> IO = createParameter("IO", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * The parameter <code>TEST.PLS_OBJECTS.P_BOOL.O</code>.
	 */
	public static final Parameter<Object> O = createParameter("O", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false);

	/**
	 * Create a new routine call instance
	 */
	public PBool() {
		super("P_BOOL", Test.TEST, PlsObjects.PLS_OBJECTS);

		addInParameter(I);
		addInOutParameter(IO);
		addOutParameter(O);
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	public void setI(Object value) {
		setValue(I, value);
	}

	/**
	 * Set the <code>IO</code> parameter IN value to the routine
	 */
	public void setIo(Object value) {
		setValue(IO, value);
	}

	/**
	 * Get the <code>IO</code> parameter OUT value from the routine
	 */
	public Object getIo() {
		return getValue(IO);
	}

	/**
	 * Get the <code>O</code> parameter OUT value from the routine
	 */
	public Object getO() {
		return getValue(O);
	}
}
