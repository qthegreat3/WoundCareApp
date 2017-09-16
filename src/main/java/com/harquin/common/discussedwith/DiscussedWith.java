package com.harquin.common.discussedwith;

public class DiscussedWith {
	private String name;
	
	public DiscussedWith(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("DiscussedWith Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("DiscussedWith Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
