package com.harquin.common.facility;

public class Facility {
	private String name;
	
	public Facility(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Facility Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Facility Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
