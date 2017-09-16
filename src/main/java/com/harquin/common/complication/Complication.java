package com.harquin.common.complication;

public class Complication {
	private String name;
	
	public Complication(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Complication Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Complication Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
