package com.common.api.application.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
//@XmlRootElement(name = "Service_Request__c ")
public class ServiceRequestC {

	
	@XmlElement(name ="Opportunity__c")
	private String opportunityC;
	@XmlElement(name ="Service_Request_Number__c")
	private String serviceRequestNumberC;
	@XmlElement(name ="Billing_System_Account_Number__c")
	private String billingSystemAccountNumberC;
	@XmlElement(name ="Due_Date__c")
	private String dueDateC;
	@XmlElement(name ="Opportunity__r")
	private OpportunityR opportunityR;
	@XmlElement(name ="Project_Manager__r")
	private ProjectManagerR projectManagerR;
	@XmlElement(name ="Engineering__r")
	private EngineeringR engineeringR;
	public String getOpportunityC() {
		return opportunityC;
	}
	public void setOpportunityC(String opportunityC) {
		this.opportunityC = opportunityC;
	}
	public String getServiceRequestNumberC() {
		return serviceRequestNumberC;
	}
	public void setServiceRequestNumberC(String serviceRequestNumberC) {
		this.serviceRequestNumberC = serviceRequestNumberC;
	}
	public String getBillingSystemAccountNumberC() {
		return billingSystemAccountNumberC;
	}
	public void setBillingSystemAccountNumberC(String billingSystemAccountNumberC) {
		this.billingSystemAccountNumberC = billingSystemAccountNumberC;
	}
	public String getDueDateC() {
		return dueDateC;
	}
	public void setDueDateC(String dueDateC) {
		this.dueDateC = dueDateC;
	}
	public OpportunityR getOpportunityR() {
		return opportunityR;
	}
	public void setOpportunityR(OpportunityR opportunityR) {
		this.opportunityR = opportunityR;
	}
	public ProjectManagerR getProjectManagerR() {
		return projectManagerR;
	}
	public void setProjectManagerR(ProjectManagerR projectManagerR) {
		this.projectManagerR = projectManagerR;
	}
	public EngineeringR getEngineeringR() {
		return engineeringR;
	}
	public void setEngineeringR(EngineeringR engineeringR) {
		this.engineeringR = engineeringR;
	}
	
	
	
	
}
