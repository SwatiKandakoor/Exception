package com.xworkz.exception_And_Curd.dto;

public class BuildingDTO {
	private String name;
	private int no;
	private int floors;
	private boolean lift;
	private boolean parking;
	private String type;

	public BuildingDTO() {

	}

	public BuildingDTO(String name, int no, int floors, boolean lift, boolean parking, String type) {
		super();
		this.name = name;
		this.no = no;
		this.floors = floors;
		this.lift = lift;
		this.parking = parking;
		this.type = type;
	}

	@Override
	public String toString() {
		return "BuildingDTO [name=" + name + ", no=" + no + ", floors=" + floors + ", lift=" + lift + ", parking="
				+ parking + ", type=" + type + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getFloors() {
		return floors;
	}

	public void setFloors(int floors) {
		this.floors = floors;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
