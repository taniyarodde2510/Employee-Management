package com.taniya.EmployeeManagement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@Column(name="empid")
	private int empid;
	
	@Column(name="empname")
	private String empname;
	
	@Column(name="mobile")
	private String mobile;
	
	@Column(name="email")
	private String email;
	
	@Column(name="empacc")
	private String empacc;
	
	@Column(name="balance")
	private String balance;
	
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmpacc() {
		return empacc;
	}
	public void setEmpacc(String empacc) {
		this.empacc = empacc;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
	
}
