package de.verdi.vjmuc_streik_server.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SalaryData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Boolean isApprentice;
	
	private Double grosssalary;
	
	private String salarygroup;
	
	private Integer apprenticeshipyear;
	
	public SalaryData() {
		
	}
	
	public SalaryData(Boolean isApprentice, Double grosssalary, String salarygroup, Integer apprenticeshipyear) {
		
		super();
		this.isApprentice = isApprentice;
		this.grosssalary = grosssalary;
		this.salarygroup = salarygroup;
		this.apprenticeshipyear = apprenticeshipyear;
	}
	
	public Boolean getIsApprentice() {
		
		return isApprentice;
	}
	
	public void setIsApprentice(Boolean isApprentice) {
		
		this.isApprentice = isApprentice;
	}
	
	public Double getGrosssalary() {
		
		return grosssalary;
	}
	
	public void setGrosssalary(Double grosssalary) {
		
		this.grosssalary = grosssalary;
	}
	
	public String getSalarygroup() {
		
		return salarygroup;
	}
	
	public void setSalarygroup(String salarygroup) {
		
		this.salarygroup = salarygroup;
	}
	
	public Integer getApprenticeshipyear() {
		
		return apprenticeshipyear;
	}
	
	public void setApprenticeshipyear(Integer apprenticeshipyear) {
		
		this.apprenticeshipyear = apprenticeshipyear;
	}
	
	public int getId() {
		
		return id;
	}
	
}
