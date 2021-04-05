/*
 * package com.aplus.model;
 * 
 * import java.util.Date; import java.util.HashSet; import java.util.List;
 * import java.util.Set;
 * 
 * import javax.persistence.CascadeType; import javax.persistence.Column; import
 * javax.persistence.Entity; import javax.persistence.GeneratedValue; import
 * javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.JoinColumn; import javax.persistence.JoinTable; import
 * javax.persistence.ManyToMany; import javax.persistence.OneToMany; import
 * javax.persistence.OneToOne; import javax.persistence.Table; import
 * javax.persistence.Transient;
 * 
 * import org.hibernate.annotations.CreationTimestamp;
 * 
 * @Entity
 * 
 * @Table(name = "red_appointments") public class ResidentialScheduler {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
 * 
 * private String lastname;
 * 
 * private String firstname;
 * 
 * private String password;
 * 
 * private String email;
 * 
 * private int numberOfBedrooms; might still change to enum
 * 
 * private int numberOfBathrooms; might still change to enum
 * 
 * private boolean hasVacuum;
 * 
 * private boolean hasPets;
 * 
 * private String specialNotes1;
 * 
 * private String howDidYouHearAboutUs;
 * 
 * private double addTip;
 * 
 * private HowOften howOften;
 * 
 * private HowToGetIn howToGetIn;
 * 
 * Need to ask questions on how to map this external classes
 * 
 * @Column
 * 
 * @CreationTimestamp private Date scheduledDate;
 * 
 * @Transient private String password2;
 * 
 * @OneToOne(mappedBy = "red_appointments", cascade = CascadeType.ALL) private
 * Address address;
 * 
 * @OneToMany(mappedBy = "scheduler", cascade = CascadeType.ALL) private
 * List<PaymentMethod> PaymentMethod;
 * 
 * @ManyToMany(cascade = CascadeType.DETACH)
 * 
 * @JoinTable(name = "residential_scheduler_role", joinColumns
 * = @JoinColumn(name = "residential_scheduler_id"), inverseJoinColumns
 * = @JoinColumn(name = "role_id")) private Set<Role> roles = new
 * HashSet<Role>();
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public String getLastname() { return lastname; }
 * 
 * public void setLastname(String lastname) { this.lastname = lastname; }
 * 
 * public String getFirstname() { return firstname; }
 * 
 * public void setFirstname(String firstname) { this.firstname = firstname; }
 * 
 * public String getPassword() { return password; }
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * public String getEmail() { return email; }
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * public int getNumberOfBedrooms() { return numberOfBedrooms; }
 * 
 * public void setNumberOfBedrooms(int numberOfBedrooms) { this.numberOfBedrooms
 * = numberOfBedrooms; }
 * 
 * public int getNumberOfBathrooms() { return numberOfBathrooms; }
 * 
 * public void setNumberOfBathrooms(int numberOfBathrooms) {
 * this.numberOfBathrooms = numberOfBathrooms; }
 * 
 * public boolean isHasVacuum() { return hasVacuum; }
 * 
 * public void setHasVacuum(boolean hasVacuum) { this.hasVacuum = hasVacuum; }
 * 
 * public boolean isHasPets() { return hasPets; }
 * 
 * public void setHasPets(boolean hasPets) { this.hasPets = hasPets; }
 * 
 * public String getSpecialNotes1() { return specialNotes1; }
 * 
 * public void setSpecialNotes1(String specialNotes1) { this.specialNotes1 =
 * specialNotes1; }
 * 
 * public String getHowDidYouHearAboutUs() { return howDidYouHearAboutUs; }
 * 
 * public void setHowDidYouHearAboutUs(String howDidYouHearAboutUs) {
 * this.howDidYouHearAboutUs = howDidYouHearAboutUs; }
 * 
 * 
 * 
 * public HowOften getHowOften() { return howOften; }
 * 
 * public void setHowOften(HowOften howOften) { this.howOften = howOften; }
 * 
 * public HowToGetIn getHowToGetIn() { return howToGetIn; }
 * 
 * public void setHowToGetIn(HowToGetIn howToGetIn) { this.howToGetIn =
 * howToGetIn; }
 * 
 * public double getAddTip() { return addTip; }
 * 
 * public void setAddTip(double addTip) { this.addTip = addTip; }
 * 
 * 
 * }
 */