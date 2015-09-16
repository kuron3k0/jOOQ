/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.oracle.generatedclasses.test.Test;
import org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FGetOneCursor extends AbstractRoutine<Result<Record>> {

	private static final long serialVersionUID = -685757778;

	/**
	 * The parameter <code>TEST.F_GET_ONE_CURSOR.RETURN_VALUE</code>.
	 */
	public static final Parameter<Result<Record>> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.RESULT, false);

	/**
	 * The parameter <code>TEST.F_GET_ONE_CURSOR.BOOK_IDS</code>.
	 */
	public static final Parameter<UNumberArrayRecord> BOOK_IDS = createParameter("BOOK_IDS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class), false);

	/**
	 * Create a new routine call instance
	 */
	public FGetOneCursor() {
		super("F_GET_ONE_CURSOR", Test.TEST, org.jooq.impl.SQLDataType.RESULT);

		setReturnParameter(RETURN_VALUE);
		addInParameter(BOOK_IDS);
	}

	/**
	 * Set the <code>BOOK_IDS</code> parameter IN value to the routine
	 */
	public void setBookIds(UNumberArrayRecord value) {
		setValue(BOOK_IDS, value);
	}

	/**
	 * Set the <code>BOOK_IDS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setBookIds(Field<UNumberArrayRecord> field) {
		setField(BOOK_IDS, field);
	}
}
