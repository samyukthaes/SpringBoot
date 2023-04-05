package com.ustemployee.Ustemployee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ustmodel {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String experience;
	private String domain;
	public Ustmodel(int id, String name, String email, String experience, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.domain = domain;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setEmpname(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	

}
