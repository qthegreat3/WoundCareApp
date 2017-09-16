package com.harquin.common.disposition;

public class Disposition {
private String name;
	
	public Disposition(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Disposition Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Disposition Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
