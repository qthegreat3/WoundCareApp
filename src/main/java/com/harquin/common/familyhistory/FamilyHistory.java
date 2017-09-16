package com.harquin.common.familyhistory;

public class FamilyHistory {
	private String name;
	
	public FamilyHistory(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("FamilyHistory Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("FamilyHistory Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
