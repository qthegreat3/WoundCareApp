package com.harquin.common.facesheet;

public class FaceSheet {
	private int id;
	private String fileLocation;
	
	public FaceSheet(String fileLocation)
	{
		setFileLocation(fileLocation);
	}

	public void setFileLocation(String fileLocation)
	{
		if(fileLocation == null)
		{
			throw new IllegalArgumentException("File Location Cannot Be Null");
		}
		if(fileLocation.isEmpty())
		{
			throw new IllegalArgumentException("File Location Cannot Be Empty");
		}
		
		this.fileLocation = fileLocation;
	}
	
	public String getFileLocation()
	{
		return fileLocation;
	}
	
	public void setId(int id)
	{
		if(id <= 0)
		{
			throw new IllegalArgumentException("Id Must Be Positive, Non Zero Number");
		}
		
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
}