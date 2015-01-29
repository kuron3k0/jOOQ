/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.records;


import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.mysql.generatedclasses.tables.TExoticTypes;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypesRecord extends UpdatableRecordImpl<TExoticTypesRecord> implements Record2<Integer, UUID> {

	private static final long serialVersionUID = -522226839;

	/**
	 * Setter for <code>test.t_exotic_types.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>test.t_exotic_types.ID</code>.
	 */
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>test.t_exotic_types.UU</code>.
	 */
	public void setUu(UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>test.t_exotic_types.UU</code>.
	 */
	public UUID getUu() {
		return (UUID) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, UUID> fieldsRow() {
		return (Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row2<Integer, UUID> valuesRow() {
		return (Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TExoticTypes.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field2() {
		return TExoticTypes.UU;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UUID value2() {
		return getUu();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value2(UUID value) {
		setUu(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord values(Integer value1, UUID value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TExoticTypesRecord
	 */
	public TExoticTypesRecord() {
		super(TExoticTypes.T_EXOTIC_TYPES);
	}

	/**
	 * Create a detached, initialised TExoticTypesRecord
	 */
	public TExoticTypesRecord(Integer id, UUID uu) {
		super(TExoticTypes.T_EXOTIC_TYPES);

		setValue(0, id);
		setValue(1, uu);
	}
}
