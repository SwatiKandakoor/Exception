package com.xworkz.exception_And_Curd.service;

import com.xworkz.exception_And_Curd.dto.BakeryDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;

public interface BakeryService {
	
	boolean validAndSave(BakeryDTO bakeryDTO)throws ValidationException;

}
