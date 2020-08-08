package org.praveen.covid19learn.messanger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	public String userId;
	public String firstName;
	public String lastName;
	public Long id;
	public Character gender;
	
	public Profile(){
		
	}
	
	public Profile(String userId, String firstName, String lastName, Long id, Character gender) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.gender = gender;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	
}
