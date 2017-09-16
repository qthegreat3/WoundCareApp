package com.harquin.common.cauterizationoptions;

public class CauterizationOption {
private String name;
	
	public CauterizationOption(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("CauterizationOption Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("CauterizationOption Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
