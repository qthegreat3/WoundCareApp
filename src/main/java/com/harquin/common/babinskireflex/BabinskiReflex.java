package com.harquin.common.babinskireflex;

public class BabinskiReflex {
private String name;
	
	public BabinskiReflex(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("BabinskiReflex Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("BabinskiReflex Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
