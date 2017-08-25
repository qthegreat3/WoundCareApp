package com.harquin.common.muscoloskeletal;

public class Muscoloskeletal {
	private String name;
	
	public Muscoloskeletal(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Muscoloskeletal Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Muscoloskeletal Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
