package com.harquin.common.race;

public class Race {
	private String name;
	
	public Race(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Race Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Race Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
