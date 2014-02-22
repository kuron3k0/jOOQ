/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIdentity implements org.jooq.test.h2.generatedclasses.tables.interfaces.ITIdentity {

	private static final long serialVersionUID = 512873796;

	private java.lang.Integer id;
	private java.lang.Integer val;

	public TIdentity() {}

	public TIdentity(
		java.lang.Integer id,
		java.lang.Integer val
	) {
		this.id = id;
		this.val = val;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public TIdentity setId(java.lang.Integer id) {
		this.id = id;
		return this;
	}

	@Override
	public java.lang.Integer getVal() {
		return this.val;
	}

	@Override
	public TIdentity setVal(java.lang.Integer val) {
		this.val = val;
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITIdentity from) {
		setId(from.getId());
		setVal(from.getVal());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITIdentity> E into(E into) {
		into.from(this);
		return into;
	}
}
