/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.udt.pojos;


import java.util.UUID;

import org.jooq.test.postgres.generatedclasses.udt.interfaces.IUUuids;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UUuids implements IUUuids {

	private static final long serialVersionUID = 299364127;

	private final UUID   u1;
	private final UUID[] u2;

	public UUuids(UUuids value) {
		this.u1 = value.u1;
		this.u2 = value.u2;
	}

	public UUuids(
		UUID   u1,
		UUID[] u2
	) {
		this.u1 = u1;
		this.u2 = u2;
	}

	@Override
	public UUID getU1() {
		return this.u1;
	}

	@Override
	public UUID[] getU2() {
		return this.u2;
	}
}
