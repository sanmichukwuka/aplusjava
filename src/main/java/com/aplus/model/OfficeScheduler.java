package com.aplus.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="appointments")
public class OfficeScheduler {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private OfficeTypeClean officeTypeClean;
	
	private SquareFeet squareFeet;
	
	private double addTip;
	
	private HowOften howOften;
	
	private HowToGetIn howToGetIn;
	
	@Column(name="companyName")
	private String companyName;
	
    private String password;
    
    private double aggregatePrice;
    
    @Column(name="telephone")
	private String telephone;
	
    /* Email to track ID change need other facts */
  
    @Column(name="email")
	private String email;
    
    @Transient
    private String password2;
    
    @OneToOne(mappedBy="officeScheduler", cascade=CascadeType.ALL)
    private CommercialServices commercialServices;
    
    @OneToOne(mappedBy = "appointments", cascade = CascadeType.ALL)
	private Address address;
    
    @OneToMany(mappedBy = "officeScheduler", cascade = CascadeType.ALL)
    private List<PaymentMethod> PaymentMethod;
    
    @ManyToMany(cascade = CascadeType.DETACH )
	@JoinTable(name = "office_scheduler_role", joinColumns = @JoinColumn(name = "office_scheduler_id"),
	inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<Role> roles = new HashSet <Role>();
    
    @Column
	@CreationTimestamp
	private Date scheduledDate;
    
    private String specialNotes;
    
    private boolean hasVacuum;
    
	private String howDidYouHearAboutUs;

	public OfficeTypeClean getOfficeTypeClean() {
		return officeTypeClean;
	}

	public void setOfficeTypeClean(OfficeTypeClean officeTypeClean) {
		this.officeTypeClean = officeTypeClean;
	}

	public SquareFeet getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(SquareFeet squareFeet) {
		this.squareFeet = squareFeet;
	}

	

	public HowOften getHowOften() {
		return howOften;
	}

	public void setHowOften(HowOften howOften) {
		this.howOften = howOften;
	}

	public HowToGetIn getHowToGetIn() {
		return howToGetIn;
	}

	public void setHowToGetIn(HowToGetIn howToGetIn) {
		this.howToGetIn = howToGetIn;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<PaymentMethod> getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(List<PaymentMethod> paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Date getScheduledDate() {
		return scheduledDate;
	}

	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public String getSpecialNotes() {
		return specialNotes;
	}

	public void setSpecialNotes(String specialNotes) {
		this.specialNotes = specialNotes;
	}

	public boolean isHasVacuum() {
		return hasVacuum;
	}

	public void setHasVacuum(boolean hasVacuum) {
		this.hasVacuum = hasVacuum;
	}

	public String getHowDidYouHearAboutUs() {
		return howDidYouHearAboutUs;
	}

	public void setHowDidYouHearAboutUs(String howDidYouHearAboutUs) {
		this.howDidYouHearAboutUs = howDidYouHearAboutUs;
	}

	public Long getId() {
		return id;
	}

	public double getAddTip() {
		return addTip;
	}

	public void setAddTip(double addTip) {
		this.addTip = addTip;
	}
	
	public double getAggregatePrice() {
		return aggregatePrice;
	}

	public void setAggregatePrice(double aggregatePrice) {
		this.aggregatePrice = aggregatePrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (hasVacuum ? 1231 : 1237);
		result = prime * result + ((howDidYouHearAboutUs == null) ? 0 : howDidYouHearAboutUs.hashCode());
		result = prime * result + ((howOften == null) ? 0 : howOften.hashCode());
		result = prime * result + ((howToGetIn == null) ? 0 : howToGetIn.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((officeTypeClean == null) ? 0 : officeTypeClean.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((password2 == null) ? 0 : password2.hashCode());
		result = prime * result + ((scheduledDate == null) ? 0 : scheduledDate.hashCode());
		result = prime * result + ((specialNotes == null) ? 0 : specialNotes.hashCode());
		result = prime * result + ((squareFeet == null) ? 0 : squareFeet.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OfficeScheduler other = (OfficeScheduler) obj;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (hasVacuum != other.hasVacuum)
			return false;
		if (howDidYouHearAboutUs == null) {
			if (other.howDidYouHearAboutUs != null)
				return false;
		} else if (!howDidYouHearAboutUs.equals(other.howDidYouHearAboutUs))
			return false;
		if (howOften != other.howOften)
			return false;
		if (howToGetIn != other.howToGetIn)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (officeTypeClean != other.officeTypeClean)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (password2 == null) {
			if (other.password2 != null)
				return false;
		} else if (!password2.equals(other.password2))
			return false;
		if (scheduledDate == null) {
			if (other.scheduledDate != null)
				return false;
		} else if (!scheduledDate.equals(other.scheduledDate))
			return false;
		if (specialNotes == null) {
			if (other.specialNotes != null)
				return false;
		} else if (!specialNotes.equals(other.specialNotes))
			return false;
		if (squareFeet != other.squareFeet)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "OfficeScheduler [officeTypeClean=" + officeTypeClean + ", squareFeet=" + squareFeet + ", addTip="
				+ addTip + ", howOften=" + howOften + ", howToGetIn=" + howToGetIn + ", companyName=" + companyName
				+ ", password=" + password + ", email=" + email + ", password2=" + password2 + ", address=" + address
				+ ", PaymentMethod=" + PaymentMethod + ", roles=" + roles + ", scheduledDate=" + scheduledDate
				+ ", specialNotes=" + specialNotes + ", hasVacuum=" + hasVacuum + ", howDidYouHearAboutUs="
				+ howDidYouHearAboutUs + "]";
	}
	
	
    
}
