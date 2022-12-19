package com.xworkz.exception_And_Curd.service;

import com.xworkz.exception_And_Curd.dto.RailwayStationDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;
import com.xworkz.exception_And_Curd.repository.RailwayStationRepository;

public class RailwayStationServiceImpl implements RailwayStationService{
	
	private RailwayStationRepository railwayrepository;
	
	public RailwayStationServiceImpl(RailwayStationRepository railwayrepository) {
		this.railwayrepository=railwayrepository;
	}

	@Override
	public boolean validAndSave(RailwayStationDTO railwayStationDTO)throws ValidationException {
		
		String name=railwayStationDTO.getName();
		int platformTicketPrice =railwayStationDTO.getPlatformTicketPrice();
		double area=railwayStationDTO.getArea();
		int noOfPlatforms=railwayStationDTO.getNoOfPlatforms();
		boolean validName=false;
		boolean validPlatformTicketPrice=false;
		boolean validArea=false;
		boolean validNoOfPlatforms=false;
		
		System.out.println("After the valid and save");
		if(name!=null && name.length()>3&& name.length()<20) {
			System.out.println("name is valid");
			validName=true;
		}
		else {
			System.out.println("name is not valid");
		}
		if(platformTicketPrice>0) {
			System.out.println("platformTicketPrice is valid");
			validPlatformTicketPrice=true;
		}
		else {
			System.out.println("platformTicketPrice is not valid");
		}
		if(area>0) {
			System.out.println("Area is valid");
			validArea=true;
		}
		else {
			System.out.println("area is not valid");
		}
		if(noOfPlatforms>0) {
			System.out.println("noOfPlatforms is valid");
			validNoOfPlatforms=true;
		}
		else {
			System.out.println("noOfPlatforms is not valid");
		}
		if(validName&& validArea&&validNoOfPlatforms&&validPlatformTicketPrice) {
			System.out.println("Railway station is Valid");
			boolean saved=this.railwayrepository.create(railwayStationDTO);
			System.out.println("saved "+saved);
			throw new ValidationException("validation exception");
		}
		System.out.println("Railway station is not Valid");
		return false;
	}

}
