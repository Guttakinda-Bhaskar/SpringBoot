package com.spring.jpa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact_master")
public class ContactEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CONTACT_NO")
	private int contactNo;
	@Column(name="CONTACT_NAME")
	private String contactname;
	@Column(name="CONTACT_NUMBER")
	private String contactNumber;
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "ContactEntity [contactNo=" + contactNo + ", contactname=" + contactname + ", contactNumber="
				+ contactNumber + "]";
	}
	
}
