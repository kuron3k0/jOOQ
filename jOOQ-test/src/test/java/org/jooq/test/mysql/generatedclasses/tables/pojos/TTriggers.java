/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggers implements Serializable {

	private static final long serialVersionUID = -1885217842;

	private final Integer idGenerated;
	private final Integer id;
	private final Integer counter;

	public TTriggers(TTriggers value) {
		this.idGenerated = value.idGenerated;
		this.id = value.id;
		this.counter = value.counter;
	}

	public TTriggers(
		Integer idGenerated,
		Integer id,
		Integer counter
	) {
		this.idGenerated = idGenerated;
		this.id = id;
		this.counter = counter;
	}

	public Integer getIdGenerated() {
		return this.idGenerated;
	}

	public Integer getId() {
		return this.id;
	}

	public Integer getCounter() {
		return this.counter;
	}
}
