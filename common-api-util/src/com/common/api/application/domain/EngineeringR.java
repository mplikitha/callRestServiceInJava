package com.common.api.application.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "Engineering__r ")
public class EngineeringR {

	@XmlElement(name="Engineering__c")
	private EngineeringC engineeringC;

	public EngineeringC getEngineeringC() {
		return engineeringC;
	}

	public void setEngineeringC(EngineeringC engineeringC) {
		this.engineeringC = engineeringC;
	}
	
	
	
}
