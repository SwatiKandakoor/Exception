package com.xworkz.exception_And_Curd.service;

import com.xworkz.exception_And_Curd.dto.RailwayStationDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;

public interface RailwayStationService {

	boolean validAndSave(RailwayStationDTO railwayStationDTO)throws ValidationException ;
		
	
	
	
}