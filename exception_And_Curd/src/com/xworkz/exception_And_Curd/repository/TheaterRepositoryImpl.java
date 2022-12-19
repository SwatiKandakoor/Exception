package com.xworkz.exception_And_Curd.repository;

import com.xworkz.exception_And_Curd.dto.TheaterDTO;

public class TheaterRepositoryImpl implements TheaterRepository {

	private TheaterDTO[] theaterDto = new TheaterDTO[5];
	private int currentIndex = 0;

	@Override
	public boolean create(TheaterDTO theaterDto) {
		System.out.println("TheaterDTO is creating");
		if (this.currentIndex >= this.theaterDto.length) {

		  throw new ArrayStoreException("Array store exception");
		}
		this.theaterDto[this.currentIndex] = theaterDto;
		System.out.println("saved to  " + theaterDto + "index is" + this.currentIndex);
		this.currentIndex++;

		return true;
	}

}
