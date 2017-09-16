package com.harquin.common.musculoskeletal;

public class Musculoskeletal {
	private String name;
	
	public Musculoskeletal(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Musculoskeletal Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Musculoskeletal Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
