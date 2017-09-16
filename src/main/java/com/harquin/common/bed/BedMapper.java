package com.harquin.common.bed;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface BedMapper extends IMyBatisMapperMarker {
	public void insertBed(Bed bed);
	public List<Bed> getBeds();
	public void deleteBed(Bed bed);
}
