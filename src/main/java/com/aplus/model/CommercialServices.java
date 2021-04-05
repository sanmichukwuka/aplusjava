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
@Table(name="commercialServices")
public class CommercialServices {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private double totalPrice;
	
	private OfficeTypeClean office;
    
	@OneToOne
	@MapsId
	private OfficeScheduler officeScheduler;
	
	@Column(name = "office_schedulers_id")
	private Long office_schedulers_id;

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

	public OfficeTypeClean getOffice() {
		return office;
	}

	public void setOffice(OfficeTypeClean office) {
		this.office = office;
	}

	public OfficeScheduler getOfficeScheduler() {
		return officeScheduler;
	}

	public void setOfficeScheduler(OfficeScheduler officeScheduler) {
		this.officeScheduler = officeScheduler;
	}

	public Long getOffice_schedulers_id() {
		return office_schedulers_id;
	}

	public void setOffice_schedulers_id(Long office_schedulers_id) {
		this.office_schedulers_id = office_schedulers_id;
	}

	public Long getId() {
		return id;
	}
	
	
	      
}