package com.common.api.application.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "Engineering__c ")
public class EngineeringC {

	
	@XmlElement(name="Circuit_ID2__c")
	private String circuitID2C;

	public String getCircuitID2C() {
		return circuitID2C;
	}

	public void setCircuitID2C(String circuitID2C) {
		this.circuitID2C = circuitID2C;
	}
	
	
}
