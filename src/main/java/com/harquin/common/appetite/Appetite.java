package com.harquin.common.appetite;

public class Appetite {
	private String name;
	
	public Appetite(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Appetite Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Appetite Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
