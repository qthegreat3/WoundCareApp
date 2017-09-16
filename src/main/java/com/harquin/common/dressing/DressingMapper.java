package com.harquin.common.dressing;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface DressingMapper extends IMyBatisMapperMarker {
	public void insertDressing(Dressing dressing);
	public List<Dressing> getDressings();
	public void deleteDressing(Dressing dressing);
}
