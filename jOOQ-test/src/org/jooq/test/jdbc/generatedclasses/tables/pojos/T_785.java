/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_785 implements org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_785 {

	private static final long serialVersionUID = 1743063085;

	private java.lang.Integer id;
	private java.lang.String  name;
	private java.lang.String  value;

	public T_785() {}

	public T_785(
		java.lang.Integer id,
		java.lang.String  name,
		java.lang.String  value
	) {
		this.id = id;
		this.name = name;
		this.value = value;
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
	public java.lang.String getName() {
		return this.name;
	}

	@Override
	public void setName(java.lang.String name) {
		this.name = name;
	}

	@Override
	public java.lang.String getValue() {
		return this.value;
	}

	@Override
	public void setValue(java.lang.String value) {
		this.value = value;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_785 from) {
		setId(from.getId());
		setName(from.getName());
		setValue(from.getValue());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.IT_785> E into(E into) {
		into.from(this);
		return into;
	}
}
