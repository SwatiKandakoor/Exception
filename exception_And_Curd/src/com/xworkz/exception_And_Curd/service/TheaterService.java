package com.xworkz.exception_And_Curd.service;

import com.xworkz.exception_And_Curd.dto.TheaterDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;

public interface TheaterService {
	
	boolean validAndSave(TheaterDTO theaterDTO) throws ValidationException;

}
