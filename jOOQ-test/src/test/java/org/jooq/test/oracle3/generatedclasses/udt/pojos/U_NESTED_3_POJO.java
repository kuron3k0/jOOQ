/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.pojos;


import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_NESTED_3_INTERFACE;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_NESTED_2;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_NESTED_3_POJO extends ThreadDeath implements Cloneable, U_NESTED_3_INTERFACE {

	private static final long serialVersionUID = -1576658579;

	private Integer    ID;
	private U_NESTED_2 NESTED;

	public U_NESTED_3_POJO() {}

	public U_NESTED_3_POJO(
		Integer    ID,
		U_NESTED_2 NESTED
	) {
		this.ID = ID;
		this.NESTED = NESTED;
	}

	@Override
	public Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(Integer ID) {
		this.ID = ID;
	}

	@Override
	public U_NESTED_2 getNESTED() {
		return this.NESTED;
	}

	@Override
	public void setNESTED(U_NESTED_2 NESTED) {
		this.NESTED = NESTED;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(U_NESTED_3_INTERFACE from) {
		setID(from.getID());
		setNESTED(from.getNESTED());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends U_NESTED_3_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
