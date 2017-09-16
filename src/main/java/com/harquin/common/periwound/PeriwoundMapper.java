package com.harquin.common.periwound;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface PeriwoundMapper extends IMyBatisMapperMarker{
	public void insertPeriwound(Periwound periwound);
	public List<Periwound> getPeriwounds();
	public void deletePeriwound(Periwound periwound);
}
