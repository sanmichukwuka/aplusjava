//package com.aplus.model;
//
//import java.util.Date;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//import org.hibernate.annotations.CreationTimestamp;
//
//@Entity
//@Table(name="rappointments")
//public class ResidentialScheduler {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long id;
//
//	@Column(name = "First Name")
//	private String firstName;
//
//	@Column(name = "Last Name")
//	private String lastName;
//
//	@Column(name = "telephone")
//	private String telephone;
//
//	@Column(name = "email")
//	private String email;
//
//	private ResidentialCleanType residentialCleanType;
//
//	private NumberOfRooms numberOfRooms;
//
//	private NumberOfBathrooms numberOfBathRooms;
//
//	private HowToGetIn howToGetIn;
//
//	
//	private HowOften howOften;
//
//	private double aggregatePrice;
//
//	@Column
//	@CreationTimestamp
//	private Date scheduledDate;
//
//	private String specialNotes;
//
//	private boolean hasVacuum;
//
//	private String howDidYouHearAboutUs;
//
//	@OneToOne(mappedBy = "rappointments", cascade = CascadeType.ALL)
//	private Address address;
//
//	@OneToMany(mappedBy = "residentialScheduler", cascade = CascadeType.ALL)
//	private List<PaymentMethod> PaymentMethod;
//
//	@ManyToMany(cascade = CascadeType.DETACH)
//	@JoinTable(name = "residential_scheduler_role", joinColumns = @JoinColumn(name = "residential_scheduler_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
//	private Set<Role> roles = new HashSet<Role>();
//
//	@OneToOne(mappedBy = "residentialScheduler", cascade = CascadeType.ALL)
//	private ResidentialServices residentialServices;
//	
//	public HowToGetIn getHowToGetIn() {
//		return howToGetIn;
//	}
//
//	public void setHowToGetIn(HowToGetIn howToGetIn) {
//		this.howToGetIn = howToGetIn;
//	}
//
//	public HowOften getHowOften() {
//		return howOften;
//	}
//
//	public void setHowOften(HowOften howOften) {
//		this.howOften = howOften;
//	}
//
//	public double getAggregatePrice() {
//		return aggregatePrice;
//	}
//
//	public void setAggregatePrice(double aggregatePrice) {
//		this.aggregatePrice = aggregatePrice;
//	}
//
//
//	public ResidentialCleanType getResidentialCleanType() {
//		return residentialCleanType;
//	}
//
//	public void setResidentialCleanType(ResidentialCleanType residentialCleanType) {
//		this.residentialCleanType = residentialCleanType;
//	}
//
//	public NumberOfRooms getNumberOfRooms() {
//		return numberOfRooms;
//	}
//
//	public void setNumberOfRooms(NumberOfRooms numberOfRooms) {
//		this.numberOfRooms = numberOfRooms;
//	}
//
//	public NumberOfBathrooms getNumberOfBathRooms() {
//		return numberOfBathRooms;
//	}
//
//	public void setNumberOfBathRooms(NumberOfBathrooms numberOfBathRooms) {
//		this.numberOfBathRooms = numberOfBathRooms;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public String getSpecialNotes() {
//		return specialNotes;
//	}
//
//	public void setSpecialNotes(String specialNotes) {
//		this.specialNotes = specialNotes;
//	}
//
//	public boolean isHasVacuum() {
//		return hasVacuum;
//	}
//
//	public void setHasVacuum(boolean hasVacuum) {
//		this.hasVacuum = hasVacuum;
//	}
//
//	public String getHowDidYouHearAboutUs() {
//		return howDidYouHearAboutUs;
//	}
//
//	public void setHowDidYouHearAboutUs(String howDidYouHearAboutUs) {
//		this.howDidYouHearAboutUs = howDidYouHearAboutUs;
//	}
//
//}
