package com.harquin.common.language;

public class Language {
	private String name;
	
	public Language(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Language Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Language Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
