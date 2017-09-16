package com.harquin.common.instrument;

public class Instrument {
	private String name;
	
	public Instrument(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Instrument Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Instrument Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
