package com.harquin.common.feet;

public class Feet {
	private String name;
	
	public Feet(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Feet Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Feet Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
