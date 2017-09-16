package com.harquin.common.pneumococcalvaccine;

public class PneumococcalVaccine {
	private String name;
	
	public PneumococcalVaccine(String name)
	{
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		
		if(name == null)
		{
			throw new IllegalArgumentException("PneumococcalVaccine Name Cannot Be Null");
		}
		
		if(name.isEmpty())
		{
			throw new IllegalArgumentException("PneumococcalVaccine Name Cannot Be Empty");
		}
		
		this.name = name;
	}
}
