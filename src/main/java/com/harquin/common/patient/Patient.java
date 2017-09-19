package com.harquin.common.patient;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Patient {

	private int id;
	
	private String firstName;
	private String lastName;
	

	@JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date followUpVisitDate;
	
	@JsonFormat
    (shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date lastVisitDate;
	
	private String location;
	
	private boolean isActive;

	public Patient()
	{
		
	}
	
	public Patient(String firstName, String lastName)
	{
		id = -1;
		
		setFirstName(firstName);
		setLastName(lastName);

		followUpVisitDate = new Date();
		lastVisitDate = new Date();
		
		isActive = true;
		location = "default";
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName == null)
		{
			throw new IllegalArgumentException("First Name Cannot Be Null");
		}
				
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName == null)
		{
			throw new IllegalArgumentException("Last Name Cannot Be Null");
		}
		
		this.lastName = lastName;
	}

	public Date getFollowUpVisitDate() {
		return followUpVisitDate;
	}

	public void setFollowUpVisitDate(Date followUpDate) {
		if(followUpDate == null)
		{
			throw new IllegalArgumentException("Follow Up Date Cannot Be Null");
		}
		
		this.followUpVisitDate = followUpDate;
	}

	public Date getLastVisitDate() {
		return lastVisitDate;
	}

	public void setLastVisitDate(Date lastVisitDate) {
		if(lastVisitDate == null)
		{
			throw new IllegalArgumentException("Last Visit Date Cannot Be Null");
		}
		
		this.lastVisitDate = lastVisitDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		
		if (location == null)
		{
			throw new IllegalArgumentException("Location Cannot Be Null");
		}
		
		this.location = location;
	}	
}
