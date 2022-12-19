package com.xworkz.exception_And_Curd.repository;

import com.xworkz.exception_And_Curd.dto.BuildingDTO;

public class BuildingRepositoryImpl implements BuildingRepository {

	private BuildingDTO[] buildingDto = new BuildingDTO[4];
	private int index = 0;

	@Override
	public boolean create(BuildingDTO buildingDto) {
		System.out.println("Building repository is creating");
		if (this.index >= this.buildingDto.length) {
			throw new ArrayStoreException("Array store exception");
		}
		this.buildingDto[this.index] = buildingDto;
		this.index++;
		System.out.println("saved to " + buildingDto + "index is" + this.index);

		return true;
	}

}
