package de.verdi.vjmuc_streik_server.db.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StrikeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String company;
	
	private Double weeklyhours;
	
	private Double striketime;
	
	public StrikeDetails() {
		
	}
	
	public StrikeDetails(String company, Double weeklyhours, Double striketime) {
		
		super();
		this.company = company;
		this.weeklyhours = weeklyhours;
		this.striketime = striketime;
	}
	
	public String getCompany() {
		
		return company;
	}
	
	public void setCompany(String company) {
		
		this.company = company;
	}
	
	public Double getWeeklyhours() {
		
		return weeklyhours;
	}
	
	public void setWeeklyhours(Double weeklyhours) {
		
		this.weeklyhours = weeklyhours;
	}
	
	public Double getStriketime() {
		
		return striketime;
	}
	
	public void setStriketime(Double striketime) {
		
		this.striketime = striketime;
	}
	
	public int getId() {
		
		return id;
	}
	
}
