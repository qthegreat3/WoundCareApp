package com.harquin.common.bed;

public class Bed {
	private String name;
	
	public Bed(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Bed Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Bed Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
