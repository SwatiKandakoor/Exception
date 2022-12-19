package com.xworkz.exception_And_Curd.service;

import com.xworkz.exception_And_Curd.constant.FamousFor;
import com.xworkz.exception_And_Curd.constant.Location;
import com.xworkz.exception_And_Curd.dto.BakeryDTO;
import com.xworkz.exception_And_Curd.exception.ValidationException;
import com.xworkz.exception_And_Curd.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {
	private BakeryRepository bakeryRepository;

	public BakeryServiceImpl(BakeryRepository bakeryRepository) {
		this.bakeryRepository = bakeryRepository;
	}

	@Override
	public boolean validAndSave(BakeryDTO bakeryDTO) throws ValidationException {
		String name = bakeryDTO.getName();
		String ownerName = bakeryDTO.getOwnerName();
		long contactNo = bakeryDTO.getContactNo();
		Location location = bakeryDTO.getLocation();
		FamousFor famousFor = bakeryDTO.getFamousFor();

		boolean validName = false;
		boolean validOwnerName = false;
		boolean validContactNo = false;
		boolean validLocation = false;
		boolean validFamousFor = false;

		if (name != null && name.length() > 3 && name.length() < 30) {
			System.out.println("name is valid " + bakeryDTO);
			validName = true;
		} else {
			System.err.println("name is not valid ");
		}
		if (ownerName != null && ownerName.length() > 3 && ownerName.length() < 30) {
			System.out.println("ownerName is valid " + bakeryDTO);
			validOwnerName = true;
		} else {
			System.err.println("ownerName is not valid ");
		}
		if (contactNo > 0) {
			System.out.println("contactNo is valid" + bakeryDTO);
			validContactNo = true;
		} else {
			System.err.println("contactNo is not valid ");
		}
		if (location != null) {
			System.out.println("locationis valid " + bakeryDTO);
			validLocation = true;
		} else {
			System.err.println("location is not valid ");
		}
		if (famousFor != null) {
			System.out.println("famousFor is valid " + bakeryDTO);
			validFamousFor = true;
		} else {
			System.err.println("famousFor is not valid ");
		}

		if (validName && validOwnerName && validContactNo && validLocation && validFamousFor) {
			System.out.println("Bakery is valid");
			boolean saved = this.bakeryRepository.create(bakeryDTO);
			System.out.println("saved " + saved);
			throw new ValidationException("Validation exception");
		}
		System.out.println("Bakery is not valid");
		return false;
	}

}
