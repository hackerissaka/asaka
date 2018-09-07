package com.cg.equipTrack.Bean;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name="equipment")
public class Equipment {
	
private String equipmentCode;
private String comments;
private Date endDate;
private String equipmentTag;
private String sequenceNo;
private String status;

@OneToOne
@JoinColumn(name="Machine_id")
private ComputerTrack compTrack;

@OneToOne
@JoinColumn(name="Location_Id")
private Location location;

@OneToOne
@JoinColumn(name= "user_id")
private User user;

public String getEquipmentCode() {
	return equipmentCode;
}

public void setEquipmentCode(String equipmentCode) {
	this.equipmentCode = equipmentCode;
}

public String getComments() {
	return comments;
}

public void setComments(String comments) {
	this.comments = comments;
}

public Date getEndDate() {
	return endDate;
}

public void setEndDate(Date endDate) {
	this.endDate = endDate;
}

public String getEquipmentTag() {
	return equipmentTag;
}

public void setEquipmentTag(String equipmentTag) {
	this.equipmentTag = equipmentTag;
}

public String getSequenceNo() {
	return sequenceNo;
}

public void setSequenceNo(String sequenceNo) {
	this.sequenceNo = sequenceNo;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public ComputerTrack getCompTrack() {
	return compTrack;
}

public void setCompTrack(ComputerTrack compTrack) {
	this.compTrack = compTrack;
}

public Location getLocation() {
	return location;
}

public void setLocation(Location location) {
	this.location = location;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "Equipment [equipmentCode=" + equipmentCode + ", comments=" + comments + ", endDate=" + endDate
			+ ", equipmentTag=" + equipmentTag + ", sequenceNo=" + sequenceNo + ", status=" + status + ", compTrack="
			+ compTrack + ", location=" + location + ", user=" + user + "]";
}




}
