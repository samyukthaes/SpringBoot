/**
 * 
 */
package com.UST.EmployeeRegistration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @author Administrator
 *
 */
@Entity
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String empid;
	private String name;
	private String Address;
	private String location;
	
	
	public Employee(int id, String empid, String name, String address, String location) {
		super();
		this.id = id;
		this.empid = empid;
		this.name = name;
		Address = address;
		this.location = location;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	

}

