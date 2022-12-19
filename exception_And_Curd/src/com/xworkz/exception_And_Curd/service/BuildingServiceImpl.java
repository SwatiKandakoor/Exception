package com.xworkz.exception_And_Curd.service;

import com.xworkz.exception_And_Curd.dto.BuildingDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;
import com.xworkz.exception_And_Curd.repository.BuildingRepository;

public class BuildingServiceImpl implements BuildingService{
	
	private BuildingRepository buildingRepository;
	
	public BuildingServiceImpl(BuildingRepository buildingRepository) {
		this.buildingRepository=buildingRepository;
	}

	@Override
	public boolean validAndSave(BuildingDTO buildingDTO)throws ValidationException {
		System.out.println("After valid and save");
		String name=buildingDTO.getName();
		int floors=buildingDTO.getFloors();
		int no=buildingDTO.getNo();
		String type =buildingDTO.getType();
		boolean lift=buildingDTO.isLift();
		boolean parking=buildingDTO.isParking();
		
		boolean validName=false;
		boolean validFloors=false;
		boolean validNo=false;
		boolean validType=false;
		boolean validLift=false;
		boolean validParking=false;
		
		if(name!=null && name.length()>3 && name.length()<30 ) {
			System.out.println("name is valid "+buildingDTO);
			validName=true;
		}
		else {
			System.err.println("name is not valid ");
		}
		if(floors<8) {
			System.out.println("floors is valid "+buildingDTO);
			validFloors=true;
			}
		else {
			System.err.println("floors is not valid");
		}
		if(no>0) {
			System.out.println("number is valid"+buildingDTO);
			validNo=true;
		}
		else {
			System.err.println("number is not valid ");
		}
		if(lift==true) {
			System.out.println("lift is valid"+buildingDTO);
			validLift=true;
		}
		else {
			System.err.println("lift is not valid");
		}
		if(parking==true) {
			System.out.println("parking is valid "+buildingDTO);
			validParking=true;
		}
		else {
			System.err.println("parking is not valid");
		}
		if(type!=null&& type.length()>3&&type.length()<20) {
			System.out.println("Type is valid "+buildingDTO);
			validType=true;
		}
		else {
			System.err.println("Type is not valid");
		}
		if(validName&& validFloors&&validLift&&validNo&&validParking&&validType) {
			System.out.println("Building is valid");
			boolean saved =this.buildingRepository.create(buildingDTO);
			System.out.println("saved "+saved);
			throw new ValidationException("Validation exception");
		}
		System.out.println("Building is not valid");
		return false;
	}
	
	

}
