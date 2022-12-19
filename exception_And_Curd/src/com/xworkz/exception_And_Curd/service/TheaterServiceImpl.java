package com.xworkz.exception_And_Curd.service;

import com.xworkz.exception_And_Curd.dto.TheaterDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;
import com.xworkz.exception_And_Curd.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {

	private TheaterRepository theaterRepository;

	public TheaterServiceImpl(TheaterRepository theaterRepository) {
		this.theaterRepository = theaterRepository;
	}

	@Override
	public boolean validAndSave(TheaterDTO theaterDTO) throws ValidationException {
		String name = theaterDTO.getName();
		String brand = theaterDTO.getBrand();
		int id = theaterDTO.getId();
		int seats = theaterDTO.getSeats();
		boolean validName = false;
		boolean validBrand = false;
		boolean validId = false;
		boolean validSeats = false;
		System.out.println("After validtion");
		if (name != null && name.length() >= 3 && name.length() <= 20) {
			System.out.println("name is valid" + theaterDTO);
			validName = true;
		} else {
			System.err.println("name is not valid");
		}
		if (brand != null && brand.length() >= 3 && brand.length() <= 20) {
			System.out.println("brand is valid" + theaterDTO);
			validBrand = true;
		} else {
			System.err.println("brand is not valid ");
		}
		if (id > 0) {
			System.out.println("Id is valid " + theaterDTO);
			validId = true;
		} else {
			System.err.println("Id is not valid");
		}
		if (seats > 0) {
			System.out.println("seats is valid " + theaterDTO);
			validSeats = true;
		} else {
			System.err.println("seats is not valid ");
		}
		if (validName && validBrand && validId && validSeats) {
			System.out.println("Theater is valid ,can save using repository");
			boolean saved = this.theaterRepository.create(theaterDTO);
			System.out.println("Theater DTO is saved " + saved);
			throw new ValidationException("ValidationException");
			// return saved;
		}
		System.err.println("Theater is not valid and save ");
		return false;

	}

}
