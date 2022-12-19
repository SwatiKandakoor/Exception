package com.xworkz.exception_And_Curd.boot;

import com.xworkz.exception_And_Curd.dto.TheaterDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;
import com.xworkz.exception_And_Curd.repository.TheaterRepository;
import com.xworkz.exception_And_Curd.repository.TheaterRepositoryImpl;
import com.xworkz.exception_And_Curd.service.TheaterService;
import com.xworkz.exception_And_Curd.service.TheaterServiceImpl;

public class TheaterDTORunner {
	public static void main(String[] args){
		TheaterDTO dto=new TheaterDTO("Prasanna", "PVR",26731, 200);
		TheaterDTO dto1=new TheaterDTO("Navarng", "Normal",26738, 180);
		TheaterDTO dto2=new TheaterDTO("Kaveri", "Firstclass",26767, 200);
		TheaterDTO dto3=new TheaterDTO("Prasanna", "PVR",26731, 200);
		TheaterDTO dto4=new TheaterDTO("Prasanna", "PVR",26731, 200);
		TheaterDTO dto5=new TheaterDTO("Prasanna", "PVR",26731, 200);
		TheaterDTO dto6=new TheaterDTO("Prasanna", "PVR",26731, 200);
		TheaterRepository repository=new TheaterRepositoryImpl();
		TheaterService service=new TheaterServiceImpl(repository);
		
		boolean success;
		try {
			success = service.validAndSave(dto);
			
		} catch (ValidationException e) {
			e.printStackTrace();
			
		}
		//System.out.println("success "+success);
//		boolean success1=service.validAndSave(dto1);
//		boolean success2=service.validAndSave(dto2);
//		boolean success3=service.validAndSave(dto3);
//		boolean success4=service.validAndSave(dto4);
//		boolean success5=service.validAndSave(dto5);
//		boolean success6=service.validAndSave(dto6);
		
	}

}
