package de.verdi.vjmuc_streik_server.db.model;

import java.time.LocalDate;
import java.util.Optional;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StrikeUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private Boolean isNewMember;
	
	@Column
	private String iBAN;
	
	@Column
	private String BIC;
	
	@Column
	private Boolean useKnownAccountData;
	
	@Column
	private Integer childrens;
	
	@Column
	private String companyName;
	
	@Column
	private Boolean isStrikingAlone;
	
	@Column
	private Double currentSalary;
	
	@Column
	private Boolean isAzubi;
	
	@Column
	private String traineeProfession;
	
	@Column
	private Integer yearOfTraining;
	
	@Column
	private String paymentLevel; // Endgeldgruppe
	
	@Column
	private Double lostWorkingHours;
	
	@Column
	private Double workingHours;
	
	@Column
	private Long membershipNumber;
	
	@Column
	private String forename;
	
	@Column
	private String surname;
	
	@Column
	private LocalDate birthday;
	
	@Column
	private String eMail;
	
	public StrikeUser() {
		
	}
	
	public int getId() {
		
		return id;
	}
	
	public Optional<Boolean> getIsNewMember() {
		
		return Optional.ofNullable(isNewMember);
	}
	
	public void setIsNewMember(Boolean isNewMember) {
		
		if (null == isNewMember)
			isNewMember = false;
		this.isNewMember = isNewMember;
	}
	
	public Optional<String> getiBAN() {
		
		return Optional.ofNullable(iBAN);
	}
	
	public void setiBAN(String iBAN) {
		
		this.iBAN = iBAN;
	}
	
	public Optional<String> getBIC() {
		
		return Optional.ofNullable(BIC);
	}
	
	public void setBIC(String BIC) {
		
		this.BIC = BIC;
	}
	
	public Optional<Boolean> getUseKnownAccountData() {
		
		return Optional.ofNullable(useKnownAccountData);
	}
	
	public void setUseKnownAccountData(Boolean useKnownAccountData) {
		
		this.useKnownAccountData = useKnownAccountData;
	}
	
	public Optional<Integer> getChildrens() {
		
		return Optional.ofNullable(childrens);
	}
	
	public void setChildrens(Integer childrens) {
		
		this.childrens = childrens;
	}
	
	public Optional<String> getCompanyName() {
		
		return Optional.ofNullable(companyName);
	}
	
	public void setCompanyName(String companyName) {
		
		this.companyName = companyName;
	}
	
	public Optional<Boolean> getIsStrikingAlone() {
		
		return Optional.ofNullable(isStrikingAlone);
	}
	
	public void setIsStrikingAlone(Boolean isStrikingAlone) {
		
		this.isStrikingAlone = isStrikingAlone;
	}
	
	public Optional<Double> getCurrentSalary() {
		
		return Optional.ofNullable(currentSalary);
	}
	
	public void setCurrentSalary(Double currentSalary) {
		
		this.currentSalary = currentSalary;
	}
	
	public Optional<Boolean> getIsAzubi() {
		
		return Optional.ofNullable(isAzubi);
	}
	
	public void setIsAzubi(Boolean isAzubi) {
		
		this.isAzubi = isAzubi;
	}
	
	public Optional<String> getTraineeProfession() {
		
		return Optional.ofNullable(traineeProfession);
	}
	
	public void setTraineeProfession(String traineeProfession) {
		
		this.traineeProfession = traineeProfession;
	}
	
	public Optional<Integer> getYearOfTraining() {
		
		return Optional.ofNullable(yearOfTraining);
	}
	
	public void setYearOfTraining(Integer yearOfTraining) {
		
		this.yearOfTraining = yearOfTraining;
	}
	
	public Optional<String> getPaymentLevel() {
		
		return Optional.ofNullable(paymentLevel);
	}
	
	public void setPaymentLevel(String paymentLevel) {
		
		this.paymentLevel = paymentLevel;
	}
	
	public Optional<Double> getLostWorkingHours() {
		
		return Optional.ofNullable(lostWorkingHours);
	}
	
	public void setLostWorkingHours(Double lostWorkingHours) {
		
		this.lostWorkingHours = lostWorkingHours;
	}
	
	public Optional<Double> getWorkingHours() {
		
		return Optional.ofNullable(workingHours);
	}
	
	public void setWorkingHours(Double workingHours) {
		
		this.workingHours = workingHours;
	}
	
	public Optional<Long> getMembershipNumber() {
		
		return Optional.ofNullable(membershipNumber);
	}
	
	public void setMembershipNumber(Long membershipNumber) {
		
		this.membershipNumber = membershipNumber;
	}
	
	public Optional<String> getForename() {
		
		return Optional.ofNullable(forename);
	}
	
	public void setForename(String forename) {
		
		this.forename = forename;
	}
	
	public Optional<String> getSurname() {
		
		return Optional.ofNullable(surname);
	}
	
	public void setSurname(String surname) {
		
		this.surname = surname;
	}
	
	public Optional<LocalDate> getBirthday() {
		
		return Optional.ofNullable(birthday);
	}
	
	public void setBirthday(LocalDate birthday) {
		
		this.birthday = birthday;
	}
	
	public Optional<String> getEMail() {
		
		return Optional.ofNullable(eMail);
	}
	
	public void setEMail(String eMail) {
		
		this.eMail = eMail;
	}
	
}
