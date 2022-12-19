package com.xworkz.exception_And_Curd.boot;

import com.xworkz.exception_And_Curd.constant.FamousFor;
import com.xworkz.exception_And_Curd.constant.Location;
import com.xworkz.exception_And_Curd.dto.BakeryDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;
import com.xworkz.exception_And_Curd.repository.BakeryRepository;
import com.xworkz.exception_And_Curd.repository.BakeryRepositoryImpl;
import com.xworkz.exception_And_Curd.service.BakeryService;
import com.xworkz.exception_And_Curd.service.BakeryServiceImpl;

public class BakeryRunner {
	public static void main(String[] args) {
		BakeryDTO  dto=new BakeryDTO("Ganesha bakery", "Naveen", 7019336, Location.AMINGAD, FamousFor.KARDANTU);
		BakeryRepository repository=new BakeryRepositoryImpl();
		BakeryService service=new BakeryServiceImpl(repository);
		try {
			boolean success=service.validAndSave(dto);
		} catch (ValidationException e) {
			
			e.printStackTrace();
		}
	}

}
