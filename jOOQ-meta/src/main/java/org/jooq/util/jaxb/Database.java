//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.01 at 09:32:08 PM MEZ 
//


package org.jooq.util.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				Some configuration for the database abstraction
 * 				(jooq-meta)
 * 			
 * 
 * <p>Java class for Database complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Database">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="includes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="excludes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAsTimestamp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="schemata" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}Schemata" minOccurs="0"/>
 *         &lt;element name="masterDataTables" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="masterDataTable" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}MasterDataTable" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enumTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enumType" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}EnumType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="forcedTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="forcedType" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}ForcedType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Database", propOrder = {

})
public class Database {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(defaultValue = ".*")
    protected String includes;
    @XmlElement(defaultValue = "")
    protected String excludes;
    @XmlElement(defaultValue = "false")
    protected Boolean dateAsTimestamp;
    protected Schemata schemata;
    protected Database.MasterDataTables masterDataTables;
    protected Database.EnumTypes enumTypes;
    protected Database.ForcedTypes forcedTypes;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the includes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludes() {
        return includes;
    }

    /**
     * Sets the value of the includes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludes(String value) {
        this.includes = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludes() {
        return excludes;
    }

    /**
     * Sets the value of the excludes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludes(String value) {
        this.excludes = value;
    }

    /**
     * Gets the value of the dateAsTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateAsTimestamp() {
        return dateAsTimestamp;
    }

    /**
     * Sets the value of the dateAsTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateAsTimestamp(Boolean value) {
        this.dateAsTimestamp = value;
    }

    /**
     * Gets the value of the schemata property.
     * 
     * @return
     *     possible object is
     *     {@link Schemata }
     *     
     */
    public Schemata getSchemata() {
        return schemata;
    }

    /**
     * Sets the value of the schemata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schemata }
     *     
     */
    public void setSchemata(Schemata value) {
        this.schemata = value;
    }

    /**
     * Gets the value of the masterDataTables property.
     * 
     * @return
     *     possible object is
     *     {@link Database.MasterDataTables }
     *     
     */
    public Database.MasterDataTables getMasterDataTables() {
        return masterDataTables;
    }

    /**
     * Sets the value of the masterDataTables property.
     * 
     * @param value
     *     allowed object is
     *     {@link Database.MasterDataTables }
     *     
     */
    public void setMasterDataTables(Database.MasterDataTables value) {
        this.masterDataTables = value;
    }

    /**
     * Gets the value of the enumTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Database.EnumTypes }
     *     
     */
    public Database.EnumTypes getEnumTypes() {
        return enumTypes;
    }

    /**
     * Sets the value of the enumTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Database.EnumTypes }
     *     
     */
    public void setEnumTypes(Database.EnumTypes value) {
        this.enumTypes = value;
    }

    /**
     * Gets the value of the forcedTypes property.
     * 
     * @return
     *     possible object is
     *     {@link Database.ForcedTypes }
     *     
     */
    public Database.ForcedTypes getForcedTypes() {
        return forcedTypes;
    }

    /**
     * Sets the value of the forcedTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Database.ForcedTypes }
     *     
     */
    public void setForcedTypes(Database.ForcedTypes value) {
        this.forcedTypes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="enumType" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}EnumType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enumType"
    })
    public static class EnumTypes {

        protected List<EnumType> enumType;

        /**
         * Gets the value of the enumType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enumType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnumType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EnumType }
         * 
         * 
         */
        public List<EnumType> getEnumType() {
            if (enumType == null) {
                enumType = new ArrayList<EnumType>();
            }
            return this.enumType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="forcedType" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}ForcedType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "forcedType"
    })
    public static class ForcedTypes {

        protected List<ForcedType> forcedType;

        /**
         * Gets the value of the forcedType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the forcedType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getForcedType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ForcedType }
         * 
         * 
         */
        public List<ForcedType> getForcedType() {
            if (forcedType == null) {
                forcedType = new ArrayList<ForcedType>();
            }
            return this.forcedType;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="masterDataTable" type="{http://www.jooq.org/xsd/jooq-codegen-2.0.4.xsd}MasterDataTable" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "masterDataTable"
    })
    public static class MasterDataTables {

        protected List<MasterDataTable> masterDataTable;

        /**
         * Gets the value of the masterDataTable property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the masterDataTable property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMasterDataTable().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MasterDataTable }
         * 
         * 
         */
        public List<MasterDataTable> getMasterDataTable() {
            if (masterDataTable == null) {
                masterDataTable = new ArrayList<MasterDataTable>();
            }
            return this.masterDataTable;
        }

    }

}
