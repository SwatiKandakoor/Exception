package com.xworkz.exception_And_Curd.boot;

import com.xworkz.exception_And_Curd.dto.RailwayStationDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;
import com.xworkz.exception_And_Curd.repository.RailwayStationRepository;
import com.xworkz.exception_And_Curd.repository.RailwayStationRepositoryImpl;
import com.xworkz.exception_And_Curd.service.RailwayStationService;
import com.xworkz.exception_And_Curd.service.RailwayStationServiceImpl;

public class RailwayStationRunner {
	public static void main(String[] args) {
		RailwayStationDTO dto=new RailwayStationDTO("Bagalkot", 4, 50, 20);
		RailwayStationRepository repository=new RailwayStationRepositoryImpl();
		RailwayStationService service=new RailwayStationServiceImpl(repository);
		
		boolean success;
		try {
			success = service.validAndSave(dto);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
