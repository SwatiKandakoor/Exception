package com.xworkz.exception_And_Curd.boot;

import com.xworkz.exception_And_Curd.dto.BuildingDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;
import com.xworkz.exception_And_Curd.repository.BuildingRepository;
import com.xworkz.exception_And_Curd.repository.BuildingRepositoryImpl;
import com.xworkz.exception_And_Curd.service.BuildingService;
import com.xworkz.exception_And_Curd.service.BuildingServiceImpl;

public class BuildingRunner {
	public static void main(String[] args) {
		BuildingDTO dto=new BuildingDTO("Venkateshwara nilaya", 7, 2, true, false, "2 duplex");
		BuildingRepository repository=new BuildingRepositoryImpl();
		BuildingService service=new BuildingServiceImpl(repository);
		try {
			boolean success=service.validAndSave(dto);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
