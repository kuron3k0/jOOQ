/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in HumanResources
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>HumanResources.uspUpdateEmployeeHireInfo</code>
	 */
	public static void uspUpdateEmployeeHireInfo(org.jooq.Configuration configuration, java.lang.Integer BusinessEntityID, java.lang.String JobTitle, java.sql.Timestamp HireDate, java.sql.Timestamp RateChangeDate, java.math.BigDecimal Rate, org.jooq.types.UByte PayFrequency, java.lang.Boolean CurrentFlag) {
		org.jooq.examples.sqlserver.adventureworks.humanresources.routines.uspUpdateEmployeeHireInfo p = new org.jooq.examples.sqlserver.adventureworks.humanresources.routines.uspUpdateEmployeeHireInfo();
		p.setBusinessEntityID(BusinessEntityID);
		p.setJobTitle(JobTitle);
		p.setHireDate(HireDate);
		p.setRateChangeDate(RateChangeDate);
		p.setRate(Rate);
		p.setPayFrequency(PayFrequency);
		p.setCurrentFlag(CurrentFlag);

		p.execute(configuration);
	}

	/**
	 * Call <code>HumanResources.uspUpdateEmployeeLogin</code>
	 */
	public static void uspUpdateEmployeeLogin(org.jooq.Configuration configuration, java.lang.Integer BusinessEntityID, java.lang.Object OrganizationNode, java.lang.String LoginID, java.lang.String JobTitle, java.sql.Timestamp HireDate, java.lang.Boolean CurrentFlag) {
		org.jooq.examples.sqlserver.adventureworks.humanresources.routines.uspUpdateEmployeeLogin p = new org.jooq.examples.sqlserver.adventureworks.humanresources.routines.uspUpdateEmployeeLogin();
		p.setBusinessEntityID(BusinessEntityID);
		p.setOrganizationNode(OrganizationNode);
		p.setLoginID(LoginID);
		p.setJobTitle(JobTitle);
		p.setHireDate(HireDate);
		p.setCurrentFlag(CurrentFlag);

		p.execute(configuration);
	}

	/**
	 * Call <code>HumanResources.uspUpdateEmployeePersonalInfo</code>
	 */
	public static void uspUpdateEmployeePersonalInfo(org.jooq.Configuration configuration, java.lang.Integer BusinessEntityID, java.lang.String NationalIDNumber, java.sql.Timestamp BirthDate, java.lang.String MaritalStatus, java.lang.String Gender) {
		org.jooq.examples.sqlserver.adventureworks.humanresources.routines.uspUpdateEmployeePersonalInfo p = new org.jooq.examples.sqlserver.adventureworks.humanresources.routines.uspUpdateEmployeePersonalInfo();
		p.setBusinessEntityID(BusinessEntityID);
		p.setNationalIDNumber(NationalIDNumber);
		p.setBirthDate(BirthDate);
		p.setMaritalStatus(MaritalStatus);
		p.setGender(Gender);

		p.execute(configuration);
	}
}
