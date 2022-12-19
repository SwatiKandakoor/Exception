package com.xworkz.exception_And_Curd.dto;

public class RailwayStationDTO extends AbstractAuditDTO {
	private String name;
	private int noOfPlatforms;
	private double area;
	private int platformTicketPrice;

	public RailwayStationDTO() {
	}

	public RailwayStationDTO(String name, int noOfPlatforms, double area, int platformTicketPrice) {
		super();
		this.name = name;
		this.noOfPlatforms = noOfPlatforms;
		this.area = area;
		this.platformTicketPrice = platformTicketPrice;
	}

	@Override
	public String toString() {
		return "RailwayStation [name=" + name + ", noOfPlatforms=" + noOfPlatforms + ", area=" + area
				+ ", platformTicketPrice=" + platformTicketPrice + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getPlatformTicketPrice() {
		return platformTicketPrice;
	}

	public void setPlatformTicketPrice(int platformTicketPrice) {
		this.platformTicketPrice = platformTicketPrice;
	}

}
