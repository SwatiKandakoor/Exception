package com.xworkz.exception_And_Curd.repository;

import com.xworkz.exception_And_Curd.dto.BakeryDTO;

public class BakeryRepositoryImpl implements BakeryRepository {
	private BakeryDTO[] bakeryDto = new BakeryDTO[3];
	private int index = 0;

	@Override
	public boolean create(BakeryDTO bakeryDto) {
		System.out.println("Bakery repository is creating");
		if (this.index >= this.bakeryDto.length) {
			throw new ArrayStoreException("Array store exception");

		}
		this.bakeryDto[this.index] = bakeryDto;
		this.index++;
		System.out.println("saved " + bakeryDto + "index is" + this.index);
		return true;
	}

}
