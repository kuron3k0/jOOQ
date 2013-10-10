/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Constraint definitions on accessible tables
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class AllConstraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1924609306;

	/**
	 * The singleton instance of <code>SYS.ALL_CONSTRAINTS</code>
	 */
	public static final org.jooq.util.oracle.sys.tables.AllConstraints ALL_CONSTRAINTS = new org.jooq.util.oracle.sys.tables.AllConstraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.OWNER</code>. Owner of the table
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.CONSTRAINT_NAME</code>. Name associated with constraint definition
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.CONSTRAINT_TYPE</code>. Type of constraint definition
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_TYPE = createField("CONSTRAINT_TYPE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.TABLE_NAME</code>. Name associated with table with constraint definition
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.SEARCH_CONDITION</code>. Text of search condition for table check
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SEARCH_CONDITION = createField("SEARCH_CONDITION", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.R_OWNER</code>. Owner of table used in referential constraint
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> R_OWNER = createField("R_OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.R_CONSTRAINT_NAME</code>. Name of unique constraint definition for referenced table
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> R_CONSTRAINT_NAME = createField("R_CONSTRAINT_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.DELETE_RULE</code>. The delete rule for a referential constraint
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DELETE_RULE = createField("DELETE_RULE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.STATUS</code>. Enforcement status of constraint - ENABLED or DISABLED
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> STATUS = createField("STATUS", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.DEFERRABLE</code>. Is the constraint deferrable - DEFERRABLE or NOT DEFERRABLE
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFERRABLE = createField("DEFERRABLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.DEFERRED</code>. Is the constraint deferred by default -  DEFERRED or IMMEDIATE
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFERRED = createField("DEFERRED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.VALIDATED</code>. Was this constraint system validated? -  VALIDATED or NOT VALIDATED
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> VALIDATED = createField("VALIDATED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.GENERATED</code>. Was the constraint name system generated? -  GENERATED NAME or USER NAME
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> GENERATED = createField("GENERATED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.BAD</code>. Creating this constraint should give ORA-02436.  Rewrite it before 2000 AD.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> BAD = createField("BAD", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.RELY</code>. If set, this flag will be used in optimizer
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> RELY = createField("RELY", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.LAST_CHANGE</code>. The date when this column was last enabled or disabled
	 */
	public final org.jooq.TableField<org.jooq.Record, java.sql.Date> LAST_CHANGE = createField("LAST_CHANGE", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.INDEX_OWNER</code>. The owner of the index used by this constraint
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_OWNER = createField("INDEX_OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.INDEX_NAME</code>. The index used by this constraint
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INDEX_NAME = createField("INDEX_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.INVALID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> INVALID = createField("INVALID", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>SYS.ALL_CONSTRAINTS.VIEW_RELATED</code>. 
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> VIEW_RELATED = createField("VIEW_RELATED", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Create a <code>SYS.ALL_CONSTRAINTS</code> table reference
	 */
	public AllConstraints() {
		super("ALL_CONSTRAINTS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	/**
	 * Create an aliased <code>SYS.ALL_CONSTRAINTS</code> table reference
	 */
	public AllConstraints(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllConstraints.ALL_CONSTRAINTS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.oracle.sys.tables.AllConstraints as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllConstraints(alias);
	}
}
