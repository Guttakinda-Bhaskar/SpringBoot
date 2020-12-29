package com.spring.mvc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "bus_providers")
@Entity

public class BusProviders {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer busproviderId;
	
	@Column(name = "business_nm")
	private String businessName;
	
	@Column(name = "associated_dt")
	private String associatedDate;
	
	@Column(name = "primary_business_contact_no")
	private String businessContactnumber;
	
	@Column(name = "primary_business_email_address")
	private String businessEmailAddress;
	
	@Column(name = "status")
	private String status;
	
	public Integer getBusproviderId() {
		return busproviderId;
	}
	public void setBusproviderId(Integer busproviderId) {
		this.busproviderId = busproviderId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getAssociatedDate() {
		return associatedDate;
	}
	public void setAssociatedDate(String associatedDate) {
		this.associatedDate = associatedDate;
	}
	public String getBusinessContactnumber() {
		return businessContactnumber;
	}
	public void setBusinessContactnumber(String businessContactnumber) {
		this.businessContactnumber = businessContactnumber;
	}
	public String getBusinessEmailAddress() {
		return businessEmailAddress;
	}
	public void setBusinessEmailAddress(String businessEmailAddress) {
		this.businessEmailAddress = businessEmailAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BusProviders [busproviderId=" + busproviderId + ", businessName=" + businessName + ", associatedDate="
				+ associatedDate + ", businessContactnumber=" + businessContactnumber + ", businessEmailAddress="
				+ businessEmailAddress + ", status=" + status + "]";
	}
	
}
