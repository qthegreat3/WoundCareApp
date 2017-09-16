package com.harquin.common.pedalpulsedescription;

public class PedalPulseDescription {
	private String name;
	
	public PedalPulseDescription(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("PedalPulseDescription Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("PedalPulseDescription Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
