package com.harquin.common.appearance;

public class Appearance {
private String name;
	
	public Appearance(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Appearance Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Appearance Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
