package com.spring.jpa.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "onpassive_emp")
public class OnpassiveEntity {
	@Id
	@GenericGenerator(name = "emp_id_seq",strategy = "com.spring.jpa.customGenerator.CustomGenerator")
	@GeneratedValue(generator = "emp_id_seq")
private String empId;
	@Column(name = "EMP_NAME")
private String empname;
	@Column(name = "DESIGNATION")
private String designation;
	@Column(name = "JOIN_DATE")
	@Temporal(TemporalType.DATE)
private Date joinDate;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	@Override
	public String toString() {
		return "OnpassiveEntity [empId=" + empId + ", empname=" + empname + ", designation=" + designation
				+ ", joinDate=" + joinDate + "]";
	}

}
