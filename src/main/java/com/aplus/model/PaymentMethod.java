package com.aplus.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "creditcards")
public class PaymentMethod {

	public PaymentMethod() {
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String expiry;
	private String cardno;
	private String secode;
	private String type;
	
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name="office_schedulers_id")
	private OfficeScheduler officeScheduler;

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getSecode() {
		return secode;
	}

	public void setSecode(String secode) {
		this.secode = secode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public OfficeScheduler getOfficeScheduler() {
		return officeScheduler;
	}

	public void setOfficeScheduler(OfficeScheduler officeScheduler) {
		this.officeScheduler = officeScheduler;
	}

	public Long getId() {
		return id;
	}

	
	
}
