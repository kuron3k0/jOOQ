/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.pojos;


import java.io.Serializable;


/**
 * An unused table in the same schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_71 implements Serializable {

	private static final long serialVersionUID = 2000529390;

	private final Integer id;
	private final Integer testCase_64_69Id;

	public XTestCase_71(XTestCase_71 value) {
		this.id = value.id;
		this.testCase_64_69Id = value.testCase_64_69Id;
	}

	public XTestCase_71(
		Integer id,
		Integer testCase_64_69Id
	) {
		this.id = id;
		this.testCase_64_69Id = testCase_64_69Id;
	}

	public Integer getId() {
		return this.id;
	}

	public Integer getTestCase_64_69Id() {
		return this.testCase_64_69Id;
	}
}
