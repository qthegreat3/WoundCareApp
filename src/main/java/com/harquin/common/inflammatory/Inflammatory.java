package com.harquin.common.inflammatory;

public class Inflammatory {
	private String name;
	
	public Inflammatory(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Inflammatory Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Inflammatory Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
