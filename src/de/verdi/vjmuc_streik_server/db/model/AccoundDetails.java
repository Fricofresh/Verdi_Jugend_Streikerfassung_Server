package de.verdi.vjmuc_streik_server.db.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AccoundDetails {
	
	@Id
	private int id;
	
	private String iban;
	
	private String bic;
	
	public AccoundDetails() {
		
	}
	
	public AccoundDetails(String iban, String bic) {
		
		super();
		this.iban = iban;
		this.bic = bic;
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
	
}
