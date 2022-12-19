package com.xworkz.exception_And_Curd.service;

import com.xworkz.exception_And_Curd.dto.BuildingDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;

public interface BuildingService {
	
	boolean validAndSave(BuildingDTO buildingDTO)throws ValidationException;
	

}
