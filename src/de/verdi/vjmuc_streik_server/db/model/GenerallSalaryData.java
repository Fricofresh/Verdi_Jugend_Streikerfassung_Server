package de.verdi.vjmuc_streik_server.db.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GenerallSalaryData {
	
	@Id
	private int id;
	
	private Boolean isAzubi;
	
	private String ausbildung;
	
	private Integer ausbildungsjahr;
	
	private String endgeldgruppe;
	
	public GenerallSalaryData() {
		
	}
	
	public GenerallSalaryData(Boolean isAzubi, String ausbildung, Integer ausbildungsjahr, String endgeldgruppe) {
		
		super();
		this.isAzubi = isAzubi;
		this.ausbildung = ausbildung;
		this.ausbildungsjahr = ausbildungsjahr;
		this.endgeldgruppe = endgeldgruppe;
	}
	
	public Boolean getIsAzubi() {
		
		return isAzubi;
	}
	
	public void setIsAzubi(Boolean isAzubi) {
		
		this.isAzubi = isAzubi;
	}
	
	public String getAusbildung() {
		
		return ausbildung;
	}
	
	public void setAusbildung(String ausbildung) {
		
		this.ausbildung = ausbildung;
	}
	
	public Integer getAusbildungsjahr() {
		
		return ausbildungsjahr;
	}
	
	public void setAusbildungsjahr(Integer ausbildungsjahr) {
		
		this.ausbildungsjahr = ausbildungsjahr;
	}
	
	public String getEndgeldgruppe() {
		
		return endgeldgruppe;
	}
	
	public void setEndgeldgruppe(String endgeldgruppe) {
		
		this.endgeldgruppe = endgeldgruppe;
	}
	
}
