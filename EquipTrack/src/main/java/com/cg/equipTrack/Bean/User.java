package com.cg.equipTrack.Bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name="user")
public class User {

	@Column(name= "user_id")
	private String userId;
	
	@Column(name="authorization")
	private String authorization;
	
	@Column(name="Department_Id")
	private String departmentId;
	
	@Column(name= "Designation")
	private String designation;
	
	@Column(name= "password")
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name= "Location_Id")
	private Location location;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", authorization=" + authorization + ", departmentId=" + departmentId
				+ ", designation=" + designation + ", password=" + password + ", location=" + location + "]";
	}
	
	
}
