package com.harquin.common.indication;

public class Indication {
	private String name;
	
	public Indication(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Indication Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Indication Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
