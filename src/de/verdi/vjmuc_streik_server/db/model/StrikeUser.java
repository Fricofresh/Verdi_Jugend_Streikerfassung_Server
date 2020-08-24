package de.verdi.vjmuc_streik_server.db.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class StrikeUser {
	
	@Id
	private int id;
	
	private Boolean becomeMember;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private AccoundDetails accountDetail;
	
	private String childBenefit;
	
	private String company;
	
	private String coPartner;
	
	private String currentSalary;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private GenerallSalaryData generallSalaryData;
	
	private Double lostWorkingHours;
	
	private Long membershipNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PersonalDetails personalDetails;
	
	private Boolean strikePay;
	
	private Boolean wantBecomeMember;
	
	private Double workingHours;
	
	public StrikeUser() {
		
	}
	
	public StrikeUser(Boolean becomeMember, AccoundDetails accountDetail, String childBenefit, String company,
			String coPartner, String currentSalary, GenerallSalaryData generallSalaryData, Double lostWorkingHours,
			Long membershipNumber, PersonalDetails personalDetails, Boolean strikePay, Boolean wantBecomeMember,
			Double workingHours) {
		
		super();
		this.becomeMember = becomeMember;
		this.accountDetail = accountDetail;
		this.childBenefit = childBenefit;
		this.company = company;
		this.coPartner = coPartner;
		this.currentSalary = currentSalary;
		this.generallSalaryData = generallSalaryData;
		this.lostWorkingHours = lostWorkingHours;
		this.membershipNumber = membershipNumber;
		this.personalDetails = personalDetails;
		this.strikePay = strikePay;
		this.wantBecomeMember = wantBecomeMember;
		this.workingHours = workingHours;
	}
	
	public Boolean getBecomeMember() {
		
		return becomeMember;
	}
	
	public void setBecomeMember(Boolean becomeMember) {
		
		this.becomeMember = becomeMember;
	}
	
	public AccoundDetails getAccountDetail() {
		
		return accountDetail;
	}
	
	public void setAccountDetail(AccoundDetails accountDetail) {
		
		this.accountDetail = accountDetail;
	}
	
	public String getChildBenefit() {
		
		return childBenefit;
	}
	
	public void setChildBenefit(String childBenefit) {
		
		this.childBenefit = childBenefit;
	}
	
	public String getCompany() {
		
		return company;
	}
	
	public void setCompany(String company) {
		
		this.company = company;
	}
	
	public String getCoPartner() {
		
		return coPartner;
	}
	
	public void setCoPartner(String coPartner) {
		
		this.coPartner = coPartner;
	}
	
	public String getCurrentSalary() {
		
		return currentSalary;
	}
	
	public void setCurrentSalary(String currentSalary) {
		
		this.currentSalary = currentSalary;
	}
	
	public GenerallSalaryData getGenerallSalaryData() {
		
		return generallSalaryData;
	}
	
	public void setGenerallSalaryData(GenerallSalaryData generallSalaryData) {
		
		this.generallSalaryData = generallSalaryData;
	}
	
	public Double getLostWorkingHours() {
		
		return lostWorkingHours;
	}
	
	public void setLostWorkingHours(Double lostWorkingHours) {
		
		this.lostWorkingHours = lostWorkingHours;
	}
	
	public Long getMembershipNumber() {
		
		return membershipNumber;
	}
	
	public void setMembershipNumber(Long membershipNumber) {
		
		this.membershipNumber = membershipNumber;
	}
	
	public PersonalDetails getPersonalDetails() {
		
		return personalDetails;
	}
	
	public void setPersonalDetails(PersonalDetails personalDetails) {
		
		this.personalDetails = personalDetails;
	}
	
	public Boolean getStrikePay() {
		
		return strikePay;
	}
	
	public void setStrikePay(Boolean strikePay) {
		
		this.strikePay = strikePay;
	}
	
	public Boolean getWantBecomeMember() {
		
		return wantBecomeMember;
	}
	
	public void setWantBecomeMember(Boolean wantBecomeMember) {
		
		this.wantBecomeMember = wantBecomeMember;
	}
	
	public Double getWorkingHours() {
		
		return workingHours;
	}
	
	public void setWorkingHours(Double workingHours) {
		
		this.workingHours = workingHours;
	}
	
}
