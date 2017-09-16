package com.harquin.common.orientation;

import java.util.List;

public interface IOrientationDao {
	public boolean insertOrientation(Orientation orientation);
	public List<Orientation> getOrientations();
	public boolean deleteOrientation(Orientation orientation);
}
