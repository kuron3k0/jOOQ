/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbc.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBooleans implements org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBooleans {

	private static final long serialVersionUID = 678495645;

	private java.lang.Integer                            id;
	private org.jooq.test._.converters.Boolean_10        oneZero;
	private org.jooq.test._.converters.Boolean_TF_LC     trueFalseLc;
	private org.jooq.test._.converters.Boolean_TF_UC     trueFalseUc;
	private org.jooq.test._.converters.Boolean_YES_NO_LC yesNoLc;
	private org.jooq.test._.converters.Boolean_YES_NO_UC yesNoUc;
	private org.jooq.test._.converters.Boolean_YN_LC     yNLc;
	private org.jooq.test._.converters.Boolean_YN_UC     yNUc;
	private java.lang.Boolean                            vcBoolean;
	private java.lang.Boolean                            cBoolean;
	private java.lang.Boolean                            nBoolean;

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public org.jooq.test._.converters.Boolean_10 getOneZero() {
		return this.oneZero;
	}

	@Override
	public void setOneZero(org.jooq.test._.converters.Boolean_10 oneZero) {
		this.oneZero = oneZero;
	}

	@Override
	public org.jooq.test._.converters.Boolean_TF_LC getTrueFalseLc() {
		return this.trueFalseLc;
	}

	@Override
	public void setTrueFalseLc(org.jooq.test._.converters.Boolean_TF_LC trueFalseLc) {
		this.trueFalseLc = trueFalseLc;
	}

	@Override
	public org.jooq.test._.converters.Boolean_TF_UC getTrueFalseUc() {
		return this.trueFalseUc;
	}

	@Override
	public void setTrueFalseUc(org.jooq.test._.converters.Boolean_TF_UC trueFalseUc) {
		this.trueFalseUc = trueFalseUc;
	}

	@Override
	public org.jooq.test._.converters.Boolean_YES_NO_LC getYesNoLc() {
		return this.yesNoLc;
	}

	@Override
	public void setYesNoLc(org.jooq.test._.converters.Boolean_YES_NO_LC yesNoLc) {
		this.yesNoLc = yesNoLc;
	}

	@Override
	public org.jooq.test._.converters.Boolean_YES_NO_UC getYesNoUc() {
		return this.yesNoUc;
	}

	@Override
	public void setYesNoUc(org.jooq.test._.converters.Boolean_YES_NO_UC yesNoUc) {
		this.yesNoUc = yesNoUc;
	}

	@Override
	public org.jooq.test._.converters.Boolean_YN_LC getYNLc() {
		return this.yNLc;
	}

	@Override
	public void setYNLc(org.jooq.test._.converters.Boolean_YN_LC yNLc) {
		this.yNLc = yNLc;
	}

	@Override
	public org.jooq.test._.converters.Boolean_YN_UC getYNUc() {
		return this.yNUc;
	}

	@Override
	public void setYNUc(org.jooq.test._.converters.Boolean_YN_UC yNUc) {
		this.yNUc = yNUc;
	}

	@Override
	public java.lang.Boolean getVcBoolean() {
		return this.vcBoolean;
	}

	@Override
	public void setVcBoolean(java.lang.Boolean vcBoolean) {
		this.vcBoolean = vcBoolean;
	}

	@Override
	public java.lang.Boolean getCBoolean() {
		return this.cBoolean;
	}

	@Override
	public void setCBoolean(java.lang.Boolean cBoolean) {
		this.cBoolean = cBoolean;
	}

	@Override
	public java.lang.Boolean getNBoolean() {
		return this.nBoolean;
	}

	@Override
	public void setNBoolean(java.lang.Boolean nBoolean) {
		this.nBoolean = nBoolean;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBooleans from) {
		setId(from.getId());
		setOneZero(from.getOneZero());
		setTrueFalseLc(from.getTrueFalseLc());
		setTrueFalseUc(from.getTrueFalseUc());
		setYesNoLc(from.getYesNoLc());
		setYesNoUc(from.getYesNoUc());
		setYNLc(from.getYNLc());
		setYNUc(from.getYNUc());
		setVcBoolean(from.getVcBoolean());
		setCBoolean(from.getCBoolean());
		setNBoolean(from.getNBoolean());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbc.generatedclasses.tables.interfaces.ITBooleans> E into(E into) {
		into.from(this);
		return into;
	}
}
