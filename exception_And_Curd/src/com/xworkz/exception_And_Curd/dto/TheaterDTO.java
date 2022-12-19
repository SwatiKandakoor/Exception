package com.xworkz.exception_And_Curd.dto;

public class TheaterDTO extends AbstractAuditDTO{
	
	private String name;
	private String brand;
	private int id;
	private int seats;
	
	
	public TheaterDTO() {
		// TODO Auto-generated constructor stub
	}


	public TheaterDTO(String name, String brand, int id, int seats) {
		super();
		this.name = name;
		this.brand = brand;
		this.id = id;
		this.seats = seats;
	}


	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", brand=" + brand + ", id=" + id + ", seats=" + seats +"]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSeats() {
		return seats;
	}


	public void setSeats(int seats) {
		this.seats = seats;
	}
	

}
