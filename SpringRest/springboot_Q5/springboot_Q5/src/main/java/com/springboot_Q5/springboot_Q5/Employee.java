package com.springboot_Q5.springboot_Q5;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id @GeneratedValue
	Long empid;
	String empname;
	String empdept;
	String empdes;
	
	

	public Employee() {
		super();
	}
	public Employee(Long empid, String empname, String empdept, String empdes) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empdept = empdept;
		this.empdes = empdes;
	}
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	public String getEmpdes() {
		return empdes;
	}
	public void setEmpdes(String empdes) {
		this.empdes = empdes;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empdept=" + empdept + ", empdes=" + empdes
				+ "]";
	}
	
	
	

}