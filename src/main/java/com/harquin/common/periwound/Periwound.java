package com.harquin.common.periwound;

public class Periwound {
	private String name;
	
	public Periwound(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Periwound Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Periwound Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
