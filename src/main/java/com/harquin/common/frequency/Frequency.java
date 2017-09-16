package com.harquin.common.frequency;

public class Frequency {
	private String name;
	
	public Frequency(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Frequency Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Frequency Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
