package com.harquin.common.pastmedicalhistory;

public class PastMedicalHistory {
	private String name;
	
	public PastMedicalHistory(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("PastMedicalHistory Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("PastMedicalHistory Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
