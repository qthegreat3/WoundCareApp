package com.harquin.common.nodebridementreason;

public class NoDebridementReason {
	private String name;
	
	public NoDebridementReason(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("NoDebridementReason Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("NoDebridementReason Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
