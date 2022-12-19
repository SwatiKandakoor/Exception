package com.xworkz.exception_And_Curd.repository;

import com.xworkz.exception_And_Curd.dto.TheaterDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;

public interface TheaterRepository {

	boolean create (TheaterDTO theaterDto)throws ValidationException ;
}
