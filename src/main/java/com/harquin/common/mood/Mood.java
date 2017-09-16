package com.harquin.common.mood;

public class Mood {
	private String name;
	
	public Mood(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Mood Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Mood Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
