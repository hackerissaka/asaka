package com.cg.equipTrack.Bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Table(name="equipment")
public class ComputerTrack {

	@Column(name="Machine_id")
	private String machineId;
	
	@Column(name="Computer_Name")
	private String computerName;
	
	@Column(name="Disc_Capacity")
	private String discCapacity;
	
	@Column(name="Free_Space")
	private String freeSpace;
	
	@Column(name="Network_Card_No")
	private String networkCardNo;
	
	@Column(name= "Network_Manufacture_Name")
	private String networkManufactureName;
	
	@Column(name= "OS")
	private String os;
	
	@Column(name= "osVersion")
	private String osVersion;
	
	@Column(name="TotalInstallMemory")
	private String totalInstalledMemory;
	
	
	public String getMachineId() {
		return machineId;
	}
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public String getDiscCapacity() {
		return discCapacity;
	}
	public void setDiscCapacity(String discCapacity) {
		this.discCapacity = discCapacity;
	}
	public String getFreeSpace() {
		return freeSpace;
	}
	public void setFreeSpace(String freeSpace) {
		this.freeSpace = freeSpace;
	}
	public String getNetworkCardNo() {
		return networkCardNo;
	}
	public void setNetworkCardNo(String networkCardNo) {
		this.networkCardNo = networkCardNo;
	}
	public String getNetworkManufactureName() {
		return networkManufactureName;
	}
	public void setNetworkManufactureName(String networkManufactureName) {
		this.networkManufactureName = networkManufactureName;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getTotalInstalledMemory() {
		return totalInstalledMemory;
	}
	public void setTotalInstalledMemory(String totalInstalledMemory) {
		this.totalInstalledMemory = totalInstalledMemory;
	}
	@Override
	public String toString() {
		return "ComputerTrack [machineId=" + machineId + ", computerName=" + computerName + ", discCapacity="
				+ discCapacity + ", freeSpace=" + freeSpace + ", networkCardNo=" + networkCardNo
				+ ", networkManufactureName=" + networkManufactureName + ", os=" + os + ", osVersion=" + osVersion
				+ ", totalInstalledMemory=" + totalInstalledMemory + "]";
	}
	
	
	
}
