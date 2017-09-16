package com.harquin.common.monofilament;

public class Monofilament {
	private String name;
	
	public Monofilament(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Monofilament Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Monofilament Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
