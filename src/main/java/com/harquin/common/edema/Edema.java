package com.harquin.common.edema;

public class Edema {
	private String name;
	
	public Edema(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Edema Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Edema Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
