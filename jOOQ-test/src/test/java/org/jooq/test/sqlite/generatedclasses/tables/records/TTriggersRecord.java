/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.sqlite.generatedclasses.tables.TTriggers;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggersRecord extends UpdatableRecordImpl<TTriggersRecord> implements Record3<Integer, Integer, Integer> {

	private static final long serialVersionUID = -1916753629;

	/**
	 * Setter for <code>t_triggers.id_generated</code>.
	 */
	public void setIdGenerated(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>t_triggers.id_generated</code>.
	 */
	public Integer getIdGenerated() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>t_triggers.id</code>.
	 */
	public void setId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>t_triggers.id</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>t_triggers.counter</code>.
	 */
	public void setCounter(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>t_triggers.counter</code>.
	 */
	public Integer getCounter() {
		return (Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> fieldsRow() {
		return (Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row3<Integer, Integer, Integer> valuesRow() {
		return (Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TTriggers.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TTriggers.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TTriggers.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getIdGenerated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getCounter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TTriggersRecord value1(Integer value) {
		setIdGenerated(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TTriggersRecord value2(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TTriggersRecord value3(Integer value) {
		setCounter(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TTriggersRecord values(Integer value1, Integer value2, Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(TTriggers.T_TRIGGERS);
	}

	/**
	 * Create a detached, initialised TTriggersRecord
	 */
	public TTriggersRecord(Integer idGenerated, Integer id, Integer counter) {
		super(TTriggers.T_TRIGGERS);

		setValue(0, idGenerated);
		setValue(1, id);
		setValue(2, counter);
	}
}
