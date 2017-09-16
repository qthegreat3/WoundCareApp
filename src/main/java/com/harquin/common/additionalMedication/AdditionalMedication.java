package com.harquin.common.additionalMedication;

public class AdditionalMedication {
	private String name;
	
	public AdditionalMedication(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("AdditionalMedication Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("AdditionalMedication Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
