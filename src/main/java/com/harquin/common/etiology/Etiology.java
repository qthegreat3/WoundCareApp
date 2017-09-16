package com.harquin.common.etiology;

public class Etiology {
	private String name;
	
	public Etiology(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Chair Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Chair Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
