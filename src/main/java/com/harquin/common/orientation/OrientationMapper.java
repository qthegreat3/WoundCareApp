package com.harquin.common.orientation;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface OrientationMapper extends IMyBatisMapperMarker{
	public void insertOrientation(Orientation orientation);
	public List<Orientation> getOrientations();
	public void deleteOrientation(Orientation orientation);
}
