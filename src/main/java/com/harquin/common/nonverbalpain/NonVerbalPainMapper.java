package com.harquin.common.nonverbalpain;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface NonVerbalPainMapper extends IMyBatisMapperMarker{
	public void insertNonVerbalPain(NonVerbalPain nonVerbalPain);
	public List<NonVerbalPain> getNonVerbalPains();
	public void deleteNonVerbalPain(NonVerbalPain nonVerbalPain);
}
