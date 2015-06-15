/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.postgres.generatedclasses.tables.TTriggers;
import org.jooq.test.postgres.generatedclasses.tables.interfaces.ITTriggers;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggersRecord extends UpdatableRecordImpl<TTriggersRecord> implements Record3<Integer, Integer, Integer>, ITTriggers {

	private static final long serialVersionUID = -105051856;

	/**
	 * Setter for <code>public.t_triggers.id_generated</code>.
	 */
	public TTriggersRecord setIdGenerated(Integer value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_triggers.id_generated</code>.
	 */
	@Override
	public Integer getIdGenerated() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_triggers.id</code>.
	 */
	public TTriggersRecord setId(Integer value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_triggers.id</code>.
	 */
	@Override
	public Integer getId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>public.t_triggers.counter</code>.
	 */
	public TTriggersRecord setCounter(Integer value) {
		setValue(2, value);
		return this;
	}

	/**
	 * Getter for <code>public.t_triggers.counter</code>.
	 */
	@Override
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
		return TTriggers.T_TRIGGERS.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TTriggers.T_TRIGGERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TTriggers.T_TRIGGERS.COUNTER;
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
		value1(value1);
		value2(value2);
		value3(value3);
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
