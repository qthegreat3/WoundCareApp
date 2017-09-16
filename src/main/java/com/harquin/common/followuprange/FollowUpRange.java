package com.harquin.common.followuprange;

public class FollowUpRange {
	private String name;
	
	public FollowUpRange(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("FollowUpRange Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("FollowUpRange Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
