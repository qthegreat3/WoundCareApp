package com.harquin.common.sourceofhistory;

public class SourceOfHistory {
	private String name;
	
	public SourceOfHistory(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("SourceOfHistory Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("SourceOfHistory Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
