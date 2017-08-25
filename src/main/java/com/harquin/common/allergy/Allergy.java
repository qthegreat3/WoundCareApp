package com.harquin.common.allergy;

public class Allergy {
	private String name;
	
	public Allergy(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Allergy Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Allergy Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
