package com.harquin.common.gastrointestinal;

public class GastroIntestinal {
	private String name;
	
	public GastroIntestinal(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Gastro Intestinal Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Gastro Intestinal Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
