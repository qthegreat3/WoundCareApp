package com.harquin.common.exudate;

public class Exudate {
	private String name;
	
	public Exudate(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Exudate Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Exudate Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
