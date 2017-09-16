package com.harquin.common.location;

public class Location {
	private String name;
	
	public Location(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Location Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Location Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
