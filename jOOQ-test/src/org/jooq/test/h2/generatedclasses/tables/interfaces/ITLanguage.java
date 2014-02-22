/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ITLanguage extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.T_LANGUAGE.CD</code>. The language ISO code
	 */
	public ITLanguage setCd(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_LANGUAGE.CD</code>. The language ISO code
	 */
	public java.lang.String getCd();

	/**
	 * Setter for <code>PUBLIC.T_LANGUAGE.DESCRIPTION</code>. The language description
	 */
	public ITLanguage setDescription(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_LANGUAGE.DESCRIPTION</code>. The language description
	 */
	public java.lang.String getDescription();

	/**
	 * Setter for <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>.
	 */
	public ITLanguage setDescriptionEnglish(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.T_LANGUAGE.DESCRIPTION_ENGLISH</code>.
	 */
	public java.lang.String getDescriptionEnglish();

	/**
	 * Setter for <code>PUBLIC.T_LANGUAGE.ID</code>. The language ID
	 */
	public ITLanguage setId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.T_LANGUAGE.ID</code>. The language ID
	 */
	public java.lang.Integer getId();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ITLanguage
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.ITLanguage from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ITLanguage
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.ITLanguage> E into(E into);
}
