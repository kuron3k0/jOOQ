/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_71 implements org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71 {

	private static final long serialVersionUID = -1936068774;

	private java.lang.Integer id;
	private java.lang.Short   testCase_64_69Id;

	public XTestCase_71() {}

	public XTestCase_71(
		java.lang.Integer id,
		java.lang.Short   testCase_64_69Id
	) {
		this.id = id;
		this.testCase_64_69Id = testCase_64_69Id;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.lang.Short getTestCase_64_69Id() {
		return this.testCase_64_69Id;
	}

	@Override
	public void setTestCase_64_69Id(java.lang.Short testCase_64_69Id) {
		this.testCase_64_69Id = testCase_64_69Id;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71 from) {
		setId(from.getId());
		setTestCase_64_69Id(from.getTestCase_64_69Id());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_71> E into(E into) {
		into.from(this);
		return into;
	}
}
