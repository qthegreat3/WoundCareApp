package com.harquin.common.suppliments;

public class Suppliments {
	private String name;
	
	public Suppliments(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Suppliments Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Suppliments Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
