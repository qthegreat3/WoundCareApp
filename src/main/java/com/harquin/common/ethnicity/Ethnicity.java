package com.harquin.common.ethnicity;

public class Ethnicity {
	private String name;
	
	public Ethnicity(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Ethnicity Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Ethnicity Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
