package com.harquin.common.extremityotherdescription;

public class ExtremityOtherDescription {
	private String name;
	
	public ExtremityOtherDescription(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("ExtremityOtherDescription Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("ExtremityOtherDescription Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
