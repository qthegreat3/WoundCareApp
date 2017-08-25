package com.harquin.common.referringphysician;

public class ReferringPhysician {

	private int id;
	private String firstName;
	private String lastName;
	
	public ReferringPhysician(String firstName, String lastName)
	{
		setFirstName(firstName);
		setLastName(lastName);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		
		if(id <= 0)
		{
			throw new IllegalArgumentException("Id Must Be Positive, Nonzero Number");
		}
		
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
}
