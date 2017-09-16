package com.harquin.common.nonverbalpain;

public class NonVerbalPain {
	private String name;
	
	public NonVerbalPain(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("NonVerbalPain Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("NonVerbalPain Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
