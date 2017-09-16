package com.harquin.common.supplment;

public class Supplment {
	private String name;
	
	public Supplment(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Supplment Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Supplment Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
