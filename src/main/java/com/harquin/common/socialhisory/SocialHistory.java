package com.harquin.common.socialhisory;

public class SocialHistory {

	private String name;
	
	public SocialHistory(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Social History Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Social History Name Cannot Be Empty");
		}
		
		this.name = name;
	}
	
	
}
