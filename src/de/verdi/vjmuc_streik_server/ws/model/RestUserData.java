package de.verdi.vjmuc_streik_server.ws.model;

public class RestUserData {
	
	private String becomeMember;
	
	private String accountDetail;
	
	private String childBenefit;
	
	private String company;
	
	private String coPartner;
	
	private String currentSalary;
	
	private String generallSalaryData;
	
	private String lostWorkingHours;
	
	private String membershipNumber;
	
	private String personalDetails;
	
	private String strikePay;
	
	private String wantBecomeMember;
	
	private String workingHours;
	
	public RestUserData() {
		
	}
	
	public RestUserData(String becomeMember, String accountDetail, String childBenefit, String company,
			String coPartner, String currentSalary, String generallSalaryData, String lostWorkingHours,
			String membershipNumber, String personalDetails, String strikePay, String wantBecomeMember,
			String workingHours) {
		
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
	
	public String getBecomeMember() {
		
		return becomeMember;
	}
	
	public void setBecomeMember(String becomeMember) {
		
		this.becomeMember = becomeMember;
	}
	
	public String getAccountDetail() {
		
		return accountDetail;
	}
	
	public void setAccountDetail(String accountDetail) {
		
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
	
	public String getGenerallSalaryData() {
		
		return generallSalaryData;
	}
	
	public void setGenerallSalaryData(String generallSalaryData) {
		
		this.generallSalaryData = generallSalaryData;
	}
	
	public String getLostWorkingHours() {
		
		return lostWorkingHours;
	}
	
	public void setLostWorkingHours(String lostWorkingHours) {
		
		this.lostWorkingHours = lostWorkingHours;
	}
	
	public String getMembershipNumber() {
		
		return membershipNumber;
	}
	
	public void setMembershipNumber(String membershipNumber) {
		
		this.membershipNumber = membershipNumber;
	}
	
	public String getPersonalDetails() {
		
		return personalDetails;
	}
	
	public void setPersonalDetails(String personalDetails) {
		
		this.personalDetails = personalDetails;
	}
	
	public String getStrikePay() {
		
		return strikePay;
	}
	
	public void setStrikePay(String strikePay) {
		
		this.strikePay = strikePay;
	}
	
	public String getWantBecomeMember() {
		
		return wantBecomeMember;
	}
	
	public void setWantBecomeMember(String wantBecomeMember) {
		
		this.wantBecomeMember = wantBecomeMember;
	}
	
	public String getWorkingHours() {
		
		return workingHours;
	}
	
	public void setWorkingHours(String workingHours) {
		
		this.workingHours = workingHours;
	}
	
}
