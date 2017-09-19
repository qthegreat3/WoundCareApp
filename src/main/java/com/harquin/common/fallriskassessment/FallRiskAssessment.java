package com.harquin.common.fallriskassessment;

public class FallRiskAssessment {
	private String name;
	
	public FallRiskAssessment(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("FallRiskAssessment Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("FallRiskAssessment Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
