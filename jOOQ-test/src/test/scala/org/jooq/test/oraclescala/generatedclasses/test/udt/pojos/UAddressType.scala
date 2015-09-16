/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.udt.pojos


import java.io.Serializable
import java.lang.Integer
import java.lang.String
import java.lang.StringBuilder
import java.sql.Date

import javax.validation.constraints.Size

import scala.Array
import scala.Byte


/**
 * This class is generated by jOOQ.
 */
class UAddressType(
	  private var street : UStreetType
	, private var zip : String     
	, private var city : String     
	, private var country : String     
	, private var since : Date       
	, private var code : Integer    
	, private var f_1323 : Array[Byte]
	, private var f_1326 : String     
) extends Serializable {

	def this() = {
		this(null, null, null, null, null, null, null, null)
	}

	def this (value : UAddressType) = {
		this(
			  value.street
			, value.zip
			, value.city
			, value.country
			, value.since
			, value.code
			, value.f_1323
			, value.f_1326
		)
	}

	def getStreet : UStreetType = {
		this.street
	}

	def setStreet(street : UStreetType) : Unit = {
		this.street = street
	}

	@Size(max = 50)
	def getZip : String = {
		this.zip
	}

	def setZip(zip : String) : Unit = {
		this.zip = zip
	}

	@Size(max = 50)
	def getCity : String = {
		this.city
	}

	def setCity(city : String) : Unit = {
		this.city = city
	}

	@Size(max = 50)
	def getCountry : String = {
		this.country
	}

	def setCountry(country : String) : Unit = {
		this.country = country
	}

	def getSince : Date = {
		this.since
	}

	def setSince(since : Date) : Unit = {
		this.since = since
	}

	def getCode : Integer = {
		this.code
	}

	def setCode(code : Integer) : Unit = {
		this.code = code
	}

	def getF_1323 : Array[Byte] = {
		this.f_1323
	}

	def setF_1323(f_1323 : Array[Byte]) : Unit = {
		this.f_1323 = f_1323
	}

	def getF_1326 : String = {
		this.f_1326
	}

	def setF_1326(f_1326 : String) : Unit = {
		this.f_1326 = f_1326
	}

	override def equals(obj : Any) : scala.Boolean = {
		if (this == obj)
			return true
		if (obj == null)
			return false
		if (getClass() != obj.getClass())
			return false
		val other = obj.asInstanceOf[UAddressType]
		if (street == null) {
			if (other.street != null)
				return false
		}
		else if (!street.equals(other.street))
			return false
		if (zip == null) {
			if (other.zip != null)
				return false
		}
		else if (!zip.equals(other.zip))
			return false
		if (city == null) {
			if (other.city != null)
				return false
		}
		else if (!city.equals(other.city))
			return false
		if (country == null) {
			if (other.country != null)
				return false
		}
		else if (!country.equals(other.country))
			return false
		if (since == null) {
			if (other.since != null)
				return false
		}
		else if (!since.equals(other.since))
			return false
		if (code == null) {
			if (other.code != null)
				return false
		}
		else if (!code.equals(other.code))
			return false
		if (f_1323 == null) {
			if (other.f_1323 != null)
				return false
		}
		else if (!f_1323.equals(other.f_1323))
			return false
		if (f_1326 == null) {
			if (other.f_1326 != null)
				return false
		}
		else if (!f_1326.equals(other.f_1326))
			return false
		return true
	}

	override def hashCode : Int = {
		val prime = 31
		var result = 1
		result = prime * result + (if (street == null) 0 else street.hashCode())
		result = prime * result + (if (zip == null) 0 else zip.hashCode())
		result = prime * result + (if (city == null) 0 else city.hashCode())
		result = prime * result + (if (country == null) 0 else country.hashCode())
		result = prime * result + (if (since == null) 0 else since.hashCode())
		result = prime * result + (if (code == null) 0 else code.hashCode())
		result = prime * result + (if (f_1323 == null) 0 else f_1323.hashCode())
		result = prime * result + (if (f_1326 == null) 0 else f_1326.hashCode())
		return result
	}

	override def toString : String = {
		val sb = new StringBuilder("UAddressType (")

		sb.append(street)
		sb.append(", ").append(zip)
		sb.append(", ").append(city)
		sb.append(", ").append(country)
		sb.append(", ").append(since)
		sb.append(", ").append(code)
		sb.append(", ").append(f_1323)
		sb.append(", ").append(f_1326)

		sb.append(")");
		return sb.toString
	}
}
