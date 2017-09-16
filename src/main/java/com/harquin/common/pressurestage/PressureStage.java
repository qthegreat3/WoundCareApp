package com.harquin.common.pressurestage;

public class PressureStage {
	private String name;
	
	public PressureStage(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("PressureStage Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("PressureStage Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
