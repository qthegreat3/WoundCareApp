package com.harquin.common.location;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface LocationMapper extends IMyBatisMapperMarker {
	public void insertLocation(Location location);
	public List<Location> getLocations();
	public void deleteLocation(Location location);
}
