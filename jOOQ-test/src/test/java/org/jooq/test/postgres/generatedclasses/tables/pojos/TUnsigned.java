/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;


import org.jooq.test.postgres.generatedclasses.tables.interfaces.ITUnsigned;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsigned implements ITUnsigned {

	private static final long serialVersionUID = -1814600378;

	private final UByte    uByte;
	private final UShort   uShort;
	private final UInteger uInt;
	private final ULong    uLong;

	public TUnsigned(TUnsigned value) {
		this.uByte = value.uByte;
		this.uShort = value.uShort;
		this.uInt = value.uInt;
		this.uLong = value.uLong;
	}

	public TUnsigned(
		UByte    uByte,
		UShort   uShort,
		UInteger uInt,
		ULong    uLong
	) {
		this.uByte = uByte;
		this.uShort = uShort;
		this.uInt = uInt;
		this.uLong = uLong;
	}

	@Override
	public UByte getUByte() {
		return this.uByte;
	}

	@Override
	public UShort getUShort() {
		return this.uShort;
	}

	@Override
	public UInteger getUInt() {
		return this.uInt;
	}

	@Override
	public ULong getULong() {
		return this.uLong;
	}
}
