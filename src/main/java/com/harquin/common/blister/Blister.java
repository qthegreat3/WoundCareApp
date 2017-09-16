package com.harquin.common.blister;

public class Blister {
private String name;
	
	public Blister(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Blister Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Blister Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
