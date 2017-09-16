package com.harquin.common.dressing;

public class Dressing {
	private String name;
	
	public Dressing(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Dressing Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Dressing Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
