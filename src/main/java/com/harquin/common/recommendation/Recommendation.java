package com.harquin.common.recommendation;

public class Recommendation {
	private String name;
	
	public Recommendation(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Recommendation Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Recommendation Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
