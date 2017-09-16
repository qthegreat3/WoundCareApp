package com.harquin.common.anticoagulant;

public class Anticoagulant {
	private String name;
	
	public Anticoagulant(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Anticoagulant Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Anticoagulant Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
