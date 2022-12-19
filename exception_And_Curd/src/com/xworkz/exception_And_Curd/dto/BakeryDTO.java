package com.xworkz.exception_And_Curd.dto;

import com.xworkz.exception_And_Curd.constant.FamousFor;
import com.xworkz.exception_And_Curd.constant.Location;

public class BakeryDTO {
	private String name;
	private String ownerName;
	private long contactNo;
	private Location location;
	private FamousFor famousFor;
	
	public BakeryDTO() {
		
	}

	
	public BakeryDTO(String name, String ownerName, long contactNo, Location location, FamousFor famousFor) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.contactNo = contactNo;
		this.location = location;
		this.famousFor = famousFor;
	}


	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", contactNo=" + contactNo + ", location="
				+ location + ", famousFor=" + famousFor + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	public long getContactNo() {
		return contactNo;
	}


	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public FamousFor getFamousFor() {
		return famousFor;
	}


	public void setFamousFor(FamousFor famousFor) {
		this.famousFor = famousFor;
	}
	
	
	

}
