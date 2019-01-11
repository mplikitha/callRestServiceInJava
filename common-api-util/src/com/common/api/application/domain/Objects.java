package com.common.api.application.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "urn:sobject.partner.soap.sforce.com")
@XmlRootElement(name = "objects")
public class Objects {

	@XmlElement(name ="Service_Request__c")
	private ServiceRequestC serviceRequestC;
	@XmlElement(name ="fault")
	private String fault;

	public ServiceRequestC getServiceRequestC() {
		return serviceRequestC;
	}

	public void setServiceRequestC(ServiceRequestC serviceRequestC) {
		this.serviceRequestC = serviceRequestC;
	}
	
	
}
