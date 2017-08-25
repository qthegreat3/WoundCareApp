package com.harquin.common.chair;

public class Chair {
	private String name;
	
	public Chair(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Chair Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Chair Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
