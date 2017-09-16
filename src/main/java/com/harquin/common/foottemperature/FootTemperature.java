package com.harquin.common.foottemperature;

public class FootTemperature {
	private String name;
	
	public FootTemperature(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("FootTemperature Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("FootTemperature Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
