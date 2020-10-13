package de.verdi.vjmuc_streik_server.db.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private SalaryData salaryData;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private StrikeDetails strikeDetails;
	
	private Boolean flgMember;
	
	private Boolean flgMembershipNumber;
	
	private Boolean flgKnowSalary;
	
	private Boolean flgChildren;
	
	private Boolean flgPartner;
	
	private Boolean flgStandardAccount;
	
	private Boolean flgApprentice;
	
	private String membershipNumber;
	
	private String name;
	
	private String prename;
	
	private String birthday;
	
	private String email;
	
	private String iban;
	
	private String bic;
	
	private Integer children;
	
	public UserModel() {
		
	}
	
	public UserModel(SalaryData salaryData, StrikeDetails strikeDetails, Boolean flgMember, Boolean flgMembershipNumber,
			Boolean flgKnowSalary, Boolean flgChildren, Boolean flgPartner, Boolean flgStandardAccount,
			Boolean flgApprentice, String membershipNumber, String name, String prename, String birthday, String email,
			String iban, String bic, Integer children) {
		
		super();
		this.salaryData = salaryData;
		this.strikeDetails = strikeDetails;
		this.flgMember = flgMember;
		this.flgMembershipNumber = flgMembershipNumber;
		this.flgKnowSalary = flgKnowSalary;
		this.flgChildren = flgChildren;
		this.flgPartner = flgPartner;
		this.flgStandardAccount = flgStandardAccount;
		this.flgApprentice = flgApprentice;
		this.membershipNumber = membershipNumber;
		this.name = name;
		this.prename = prename;
		this.birthday = birthday;
		this.email = email;
		this.iban = iban;
		this.bic = bic;
		this.children = children;
	}
	
	public String getMembershipNumber() {
		
		return membershipNumber;
	}
	
	public void setMembershipNumber(String membershipNumber) {
		
		this.membershipNumber = membershipNumber;
	}
	
	public SalaryData getSalaryData() {
		
		return salaryData;
	}
	
	public void setSalaryData(SalaryData salaryData) {
		
		this.salaryData = salaryData;
	}
	
	public StrikeDetails getStrikeDetails() {
		
		return strikeDetails;
	}
	
	public void setStrikeDetails(StrikeDetails strikeDetails) {
		
		this.strikeDetails = strikeDetails;
	}
	
	public Boolean getFlgMember() {
		
		return flgMember;
	}
	
	public void setFlgMember(Boolean flgMember) {
		
		this.flgMember = flgMember;
	}
	
	public Boolean getFlgMembershipNumber() {
		
		return flgMembershipNumber;
	}
	
	public void setFlgMembershipNumber(Boolean flgMembershipNumber) {
		
		this.flgMembershipNumber = flgMembershipNumber;
	}
	
	public Boolean getFlgKnowSalary() {
		
		return flgKnowSalary;
	}
	
	public void setFlgKnowSalary(Boolean flgKnowSalary) {
		
		this.flgKnowSalary = flgKnowSalary;
	}
	
	public Boolean getFlgChildren() {
		
		return flgChildren;
	}
	
	public void setFlgChildren(Boolean flgChildren) {
		
		this.flgChildren = flgChildren;
	}
	
	public Boolean getFlgPartner() {
		
		return flgPartner;
	}
	
	public void setFlgPartner(Boolean flgPartner) {
		
		this.flgPartner = flgPartner;
	}
	
	public Boolean getFlgStandardAccount() {
		
		return flgStandardAccount;
	}
	
	public void setFlgStandardAccount(Boolean flgStandardAccount) {
		
		this.flgStandardAccount = flgStandardAccount;
	}
	
	public Boolean getFlgApprentice() {
		
		return flgApprentice;
	}
	
	public void setFlgApprentice(Boolean flgApprentice) {
		
		this.flgApprentice = flgApprentice;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getPrename() {
		
		return prename;
	}
	
	public void setPrename(String prename) {
		
		this.prename = prename;
	}
	
	public String getBirthday() {
		
		return birthday;
	}
	
	public void setBirthday(String birthday) {
		
		this.birthday = birthday;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
	public String getIban() {
		
		return iban;
	}
	
	public void setIban(String iban) {
		
		this.iban = iban;
	}
	
	public String getBic() {
		
		return bic;
	}
	
	public void setBic(String bic) {
		
		this.bic = bic;
	}
	
	public Integer getChildren() {
		
		return children;
	}
	
	public void setChildren(Integer children) {
		
		this.children = children;
	}
	
	public int getId() {
		
		return id;
	}
	
}
