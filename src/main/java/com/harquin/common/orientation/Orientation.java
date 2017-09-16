package com.harquin.common.orientation;

public class Orientation {
	private String name;
	
	public Orientation(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Orientation Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Orientation Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
