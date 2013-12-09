/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class uspGetEmployeeManagers extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 1276724405;

	/**
	 * The parameter <code>dbo.uspGetEmployeeManagers.BusinessEntityID</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> BusinessEntityID = createParameter("BusinessEntityID", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public uspGetEmployeeManagers() {
		super("uspGetEmployeeManagers", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo);

		addInParameter(BusinessEntityID);
	}

	/**
	 * Set the <code>BusinessEntityID</code> parameter IN value to the routine
	 */
	public void setBusinessEntityID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.dbo.routines.uspGetEmployeeManagers.BusinessEntityID, value);
	}
}
