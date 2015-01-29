/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.pojos;


import java.io.Serializable;

import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUnsigned implements Serializable {

	private static final long serialVersionUID = 1854271539;

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

	public UByte getUByte() {
		return this.uByte;
	}

	public UShort getUShort() {
		return this.uShort;
	}

	public UInteger getUInt() {
		return this.uInt;
	}

	public ULong getULong() {
		return this.uLong;
	}
}
