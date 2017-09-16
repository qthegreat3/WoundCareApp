package com.harquin.common.otherwoundtissue;

public class OtherWoundTissue {
	private String name;
	
	public OtherWoundTissue(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("OtherWoundTissue Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("OtherWoundTissue Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
