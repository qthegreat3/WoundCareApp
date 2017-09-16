package com.harquin.common.testprogress;

public class TestProgress {
	private String name;
	
	public TestProgress(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("TestProgress Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("TestProgress Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
