package com.harquin.common.riskbenefit;

public class RiskBenefit {
	private String name;
	
	public RiskBenefit(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("RiskBenefit Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("RiskBenefit Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
