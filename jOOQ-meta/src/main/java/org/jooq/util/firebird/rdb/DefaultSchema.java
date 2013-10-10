/**
 * This class is generated by jOOQ
 */
package org.jooq.util.firebird.rdb;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class DefaultSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 980433138;

	/**
	 * The singleton instance of <code></code>
	 */
	public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

	/**
	 * No further instances allowed
	 */
	private DefaultSchema() {
		super("");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.firebird.rdb.tables.Rdb$fields.RDB$FIELDS,
			org.jooq.util.firebird.rdb.tables.Rdb$generators.RDB$GENERATORS,
			org.jooq.util.firebird.rdb.tables.Rdb$indexSegments.RDB$INDEX_SEGMENTS,
			org.jooq.util.firebird.rdb.tables.Rdb$refConstraints.RDB$REF_CONSTRAINTS,
			org.jooq.util.firebird.rdb.tables.Rdb$relations.RDB$RELATIONS,
			org.jooq.util.firebird.rdb.tables.Rdb$relationConstraints.RDB$RELATION_CONSTRAINTS,
			org.jooq.util.firebird.rdb.tables.Rdb$relationFields.RDB$RELATION_FIELDS);
	}
}
