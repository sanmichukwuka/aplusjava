package com.aplus.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="residentialServices")
public class ResidentialServices {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private double totalPrice;
	
	private ResidentialCleanType residents;
    
	@OneToOne
	@MapsId
	private ResidentialScheduler residentialScheduler;
	
	@Column(name = "residential_schedulers_id")
	private Long residential_schedulers_id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ResidentialCleanType getResidents() {
		return residents;
	}

	public void setResidents(ResidentialCleanType residents) {
		this.residents = residents;
	}

	public ResidentialScheduler getResidentialScheduler() {
		return residentialScheduler;
	}

	public void setResidentialScheduler(ResidentialScheduler residentialScheduler) {
		this.residentialScheduler = residentialScheduler;
	}

	public Long getResidential_schedulers_id() {
		return residential_schedulers_id;
	}

	public void setResidential_schedulers_id(Long residential_schedulers_id) {
		this.residential_schedulers_id = residential_schedulers_id;
	}

	public Long getId() {
		return id;
	}

	
}
