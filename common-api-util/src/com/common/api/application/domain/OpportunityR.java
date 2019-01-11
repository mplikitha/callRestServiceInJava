package com.common.api.application.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "Opportunity__r ")
public class OpportunityR {

	@XmlElement(name="Opportunity_Number__c")
	private String opportunityNumberC;

	public String getOpportunityNumberC() {
		return opportunityNumberC;
	}

	public void setOpportunityNumberC(String opportunityNumberC) {
		this.opportunityNumberC = opportunityNumberC;
	}
	
	
	
	
}
