package com.harquin.common.feet;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface FeetMapper extends IMyBatisMapperMarker {
	public void insertFeet(Feet feet);
	public List<Feet> getFeets();
	public void deleteFeet(Feet feet);
}
