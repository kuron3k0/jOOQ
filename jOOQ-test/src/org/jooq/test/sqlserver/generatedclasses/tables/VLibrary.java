/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -213708076;

	/**
	 * The singleton instance of <code>dbo.v_library</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.sqlserver.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The column <code>dbo.v_library.author</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.VARCHAR.length(101), this);

	/**
	 * The column <code>dbo.v_library.title</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this);

	/**
	 * Create a <code>dbo.v_library</code> table reference
	 */
	public VLibrary() {
		super("v_library", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.v_library</code> table reference
	 */
	public VLibrary(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.VLibrary(alias);
	}
}
