package com.aplus.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ResidentialScheduler {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private ResidentialCleanType residentialCleanType;
	
	private NumberOfRooms numberOfRooms;
	
	private NumberOfBathrooms numberOfBathRooms;

	public ResidentialCleanType getResidentialCleanType() {
		return residentialCleanType;
	}

	public void setResidentialCleanType(ResidentialCleanType residentialCleanType) {
		this.residentialCleanType = residentialCleanType;
	}

	public NumberOfRooms getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(NumberOfRooms numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public NumberOfBathrooms getNumberOfBathRooms() {
		return numberOfBathRooms;
	}

	public void setNumberOfBathRooms(NumberOfBathrooms numberOfBathRooms) {
		this.numberOfBathRooms = numberOfBathRooms;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
