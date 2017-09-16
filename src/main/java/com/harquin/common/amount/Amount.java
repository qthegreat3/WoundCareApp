package com.harquin.common.amount;

public class Amount {
	private String name;
	
	public Amount(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("Amount Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("Amount Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
