package com.cg.equipTrack.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name="location")
public class Location {
	
	@Column(name="Location_Id")
	private String locationId;
	
	@Column(name="Locatiion_name")
	private String locationName;
	
public String getLocationId() {
	return locationId;
}
public void setLocationId(String locationId) {
	this.locationId = locationId;
}
public String getLocationName() {
	return locationName;
}
public void setLocationName(String locationName) {
	this.locationName = locationName;
}
@Override
public String toString() {
	return "Location [locationId=" + locationId + ", locationName=" + locationName + "]";
}


}
