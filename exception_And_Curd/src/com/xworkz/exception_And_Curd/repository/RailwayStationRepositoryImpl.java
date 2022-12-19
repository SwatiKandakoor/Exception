package com.xworkz.exception_And_Curd.repository;

import com.xworkz.exception_And_Curd.dto.RailwayStationDTO;

public class RailwayStationRepositoryImpl implements RailwayStationRepository {
	private RailwayStationDTO[] railwayDto = new RailwayStationDTO[3];
	private int index = 0;

	@Override
	public boolean create(RailwayStationDTO railwayDto) {
		System.out.println("railway station repository is creating");
		if(this.index>=this.railwayDto.length) {
			throw new ArrayStoreException(" ArrayStoreException");
		}
		this.railwayDto[this.index]=railwayDto;
		this.index++;
		System.out.println("saved to"+railwayDto +"index is " +this.index);
		
		return true;
	}

}
