package com.harquin.common.gender;

public class Gender {
	private String name;
	
	public Gender(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Gender Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Gender Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
