/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBooleansRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBooleansRecord> implements org.jooq.Record11<java.lang.Integer, org.jooq.test._.converters.Boolean_10, org.jooq.test._.converters.Boolean_TF_LC, org.jooq.test._.converters.Boolean_TF_UC, org.jooq.test._.converters.Boolean_YES_NO_LC, org.jooq.test._.converters.Boolean_YES_NO_UC, org.jooq.test._.converters.Boolean_YN_LC, org.jooq.test._.converters.Boolean_YN_UC, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> {

	private static final long serialVersionUID = 1764898465;

	/**
	 * Setter for <code>t_booleans.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>t_booleans.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>t_booleans.one_zero</code>. 
	 */
	public void setOneZero(org.jooq.test._.converters.Boolean_10 value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>t_booleans.one_zero</code>. 
	 */
	public org.jooq.test._.converters.Boolean_10 getOneZero() {
		return (org.jooq.test._.converters.Boolean_10) getValue(1);
	}

	/**
	 * Setter for <code>t_booleans.true_false_lc</code>. 
	 */
	public void setTrueFalseLc(org.jooq.test._.converters.Boolean_TF_LC value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>t_booleans.true_false_lc</code>. 
	 */
	public org.jooq.test._.converters.Boolean_TF_LC getTrueFalseLc() {
		return (org.jooq.test._.converters.Boolean_TF_LC) getValue(2);
	}

	/**
	 * Setter for <code>t_booleans.true_false_uc</code>. 
	 */
	public void setTrueFalseUc(org.jooq.test._.converters.Boolean_TF_UC value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>t_booleans.true_false_uc</code>. 
	 */
	public org.jooq.test._.converters.Boolean_TF_UC getTrueFalseUc() {
		return (org.jooq.test._.converters.Boolean_TF_UC) getValue(3);
	}

	/**
	 * Setter for <code>t_booleans.yes_no_lc</code>. 
	 */
	public void setYesNoLc(org.jooq.test._.converters.Boolean_YES_NO_LC value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>t_booleans.yes_no_lc</code>. 
	 */
	public org.jooq.test._.converters.Boolean_YES_NO_LC getYesNoLc() {
		return (org.jooq.test._.converters.Boolean_YES_NO_LC) getValue(4);
	}

	/**
	 * Setter for <code>t_booleans.yes_no_uc</code>. 
	 */
	public void setYesNoUc(org.jooq.test._.converters.Boolean_YES_NO_UC value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>t_booleans.yes_no_uc</code>. 
	 */
	public org.jooq.test._.converters.Boolean_YES_NO_UC getYesNoUc() {
		return (org.jooq.test._.converters.Boolean_YES_NO_UC) getValue(5);
	}

	/**
	 * Setter for <code>t_booleans.y_n_lc</code>. 
	 */
	public void setYNLc(org.jooq.test._.converters.Boolean_YN_LC value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>t_booleans.y_n_lc</code>. 
	 */
	public org.jooq.test._.converters.Boolean_YN_LC getYNLc() {
		return (org.jooq.test._.converters.Boolean_YN_LC) getValue(6);
	}

	/**
	 * Setter for <code>t_booleans.y_n_uc</code>. 
	 */
	public void setYNUc(org.jooq.test._.converters.Boolean_YN_UC value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>t_booleans.y_n_uc</code>. 
	 */
	public org.jooq.test._.converters.Boolean_YN_UC getYNUc() {
		return (org.jooq.test._.converters.Boolean_YN_UC) getValue(7);
	}

	/**
	 * Setter for <code>t_booleans.vc_boolean</code>. 
	 */
	public void setVcBoolean(java.lang.Boolean value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>t_booleans.vc_boolean</code>. 
	 */
	public java.lang.Boolean getVcBoolean() {
		return (java.lang.Boolean) getValue(8);
	}

	/**
	 * Setter for <code>t_booleans.c_boolean</code>. 
	 */
	public void setCBoolean(java.lang.Boolean value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>t_booleans.c_boolean</code>. 
	 */
	public java.lang.Boolean getCBoolean() {
		return (java.lang.Boolean) getValue(9);
	}

	/**
	 * Setter for <code>t_booleans.n_boolean</code>. 
	 */
	public void setNBoolean(java.lang.Boolean value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>t_booleans.n_boolean</code>. 
	 */
	public java.lang.Boolean getNBoolean() {
		return (java.lang.Boolean) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, org.jooq.test._.converters.Boolean_10, org.jooq.test._.converters.Boolean_TF_LC, org.jooq.test._.converters.Boolean_TF_UC, org.jooq.test._.converters.Boolean_YES_NO_LC, org.jooq.test._.converters.Boolean_YES_NO_UC, org.jooq.test._.converters.Boolean_YN_LC, org.jooq.test._.converters.Boolean_YN_UC, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, org.jooq.test._.converters.Boolean_10, org.jooq.test._.converters.Boolean_TF_LC, org.jooq.test._.converters.Boolean_TF_UC, org.jooq.test._.converters.Boolean_YES_NO_LC, org.jooq.test._.converters.Boolean_YES_NO_UC, org.jooq.test._.converters.Boolean_YN_LC, org.jooq.test._.converters.Boolean_YN_UC, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test._.converters.Boolean_10> field2() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.ONE_ZERO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test._.converters.Boolean_TF_LC> field3() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.TRUE_FALSE_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test._.converters.Boolean_TF_UC> field4() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.TRUE_FALSE_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test._.converters.Boolean_YES_NO_LC> field5() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.YES_NO_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test._.converters.Boolean_YES_NO_UC> field6() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.YES_NO_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test._.converters.Boolean_YN_LC> field7() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.Y_N_LC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test._.converters.Boolean_YN_UC> field8() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.Y_N_UC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field9() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.VC_BOOLEAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field10() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.C_BOOLEAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field11() {
		return org.jooq.test.sqlite.generatedclasses.tables.TBooleans.N_BOOLEAN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test._.converters.Boolean_10 value2() {
		return getOneZero();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test._.converters.Boolean_TF_LC value3() {
		return getTrueFalseLc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test._.converters.Boolean_TF_UC value4() {
		return getTrueFalseUc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test._.converters.Boolean_YES_NO_LC value5() {
		return getYesNoLc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test._.converters.Boolean_YES_NO_UC value6() {
		return getYesNoUc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test._.converters.Boolean_YN_LC value7() {
		return getYNLc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test._.converters.Boolean_YN_UC value8() {
		return getYNUc();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value9() {
		return getVcBoolean();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value10() {
		return getCBoolean();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value11() {
		return getNBoolean();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value2(org.jooq.test._.converters.Boolean_10 value) {
		setOneZero(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value3(org.jooq.test._.converters.Boolean_TF_LC value) {
		setTrueFalseLc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value4(org.jooq.test._.converters.Boolean_TF_UC value) {
		setTrueFalseUc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value5(org.jooq.test._.converters.Boolean_YES_NO_LC value) {
		setYesNoLc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value6(org.jooq.test._.converters.Boolean_YES_NO_UC value) {
		setYesNoUc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value7(org.jooq.test._.converters.Boolean_YN_LC value) {
		setYNLc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value8(org.jooq.test._.converters.Boolean_YN_UC value) {
		setYNUc(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value9(java.lang.Boolean value) {
		setVcBoolean(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value10(java.lang.Boolean value) {
		setCBoolean(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord value11(java.lang.Boolean value) {
		setNBoolean(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TBooleansRecord values(java.lang.Integer value1, org.jooq.test._.converters.Boolean_10 value2, org.jooq.test._.converters.Boolean_TF_LC value3, org.jooq.test._.converters.Boolean_TF_UC value4, org.jooq.test._.converters.Boolean_YES_NO_LC value5, org.jooq.test._.converters.Boolean_YES_NO_UC value6, org.jooq.test._.converters.Boolean_YN_LC value7, org.jooq.test._.converters.Boolean_YN_UC value8, java.lang.Boolean value9, java.lang.Boolean value10, java.lang.Boolean value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBooleansRecord
	 */
	public TBooleansRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.TBooleans.T_BOOLEANS);
	}

	/**
	 * Create a detached, initialised TBooleansRecord
	 */
	public TBooleansRecord(java.lang.Integer id, org.jooq.test._.converters.Boolean_10 oneZero, org.jooq.test._.converters.Boolean_TF_LC trueFalseLc, org.jooq.test._.converters.Boolean_TF_UC trueFalseUc, org.jooq.test._.converters.Boolean_YES_NO_LC yesNoLc, org.jooq.test._.converters.Boolean_YES_NO_UC yesNoUc, org.jooq.test._.converters.Boolean_YN_LC yNLc, org.jooq.test._.converters.Boolean_YN_UC yNUc, java.lang.Boolean vcBoolean, java.lang.Boolean cBoolean, java.lang.Boolean nBoolean) {
		super(org.jooq.test.sqlite.generatedclasses.tables.TBooleans.T_BOOLEANS);

		setValue(0, id);
		setValue(1, oneZero);
		setValue(2, trueFalseLc);
		setValue(3, trueFalseUc);
		setValue(4, yesNoLc);
		setValue(5, yesNoUc);
		setValue(6, yNLc);
		setValue(7, yNUc);
		setValue(8, vcBoolean);
		setValue(9, cBoolean);
		setValue(10, nBoolean);
	}
}
