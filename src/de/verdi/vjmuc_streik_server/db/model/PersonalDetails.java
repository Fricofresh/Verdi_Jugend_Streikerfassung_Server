package de.verdi.vjmuc_streik_server.db.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

@Entity
public class PersonalDetails {
	
	@Id
	private int id;
	
	private String forename;
	
	private String surname;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate birthday;
	
	private String email;
	
	public PersonalDetails() {
		
	}
	
	public PersonalDetails(String forename, String surname, LocalDate birthday, String email) {
		
		super();
		this.forename = forename;
		this.surname = surname;
		this.birthday = birthday;
		this.email = email;
	}
	
	public String getForename() {
		
		return forename;
	}
	
	public void setForename(String forename) {
		
		this.forename = forename;
	}
	
	public String getSurname() {
		
		return surname;
	}
	
	public void setSurname(String surname) {
		
		this.surname = surname;
	}
	
	public LocalDate getBirthday() {
		
		return birthday;
	}
	
	public void setBirthday(LocalDate birthday) {
		
		this.birthday = birthday;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		
		this.email = email;
	}
	
}
