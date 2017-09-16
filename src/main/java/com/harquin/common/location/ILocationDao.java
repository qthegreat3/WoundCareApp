package com.harquin.common.location;

import java.util.List;

public interface ILocationDao {
	public boolean insertLocation(Location location);
	public List<Location> getLocations();
	public boolean deleteLocation(Location location);
}
