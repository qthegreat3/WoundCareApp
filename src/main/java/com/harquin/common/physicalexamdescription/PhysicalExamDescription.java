package com.harquin.common.physicalexamdescription;

public class PhysicalExamDescription {
	private String name;
	
	public PhysicalExamDescription(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("PhysicalExamDescription Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("PhysicalExamDescription Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
