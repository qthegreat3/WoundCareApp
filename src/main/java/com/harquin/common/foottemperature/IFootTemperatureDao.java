package com.harquin.common.foottemperature;

import java.util.List;

public interface IFootTemperatureDao {
	public boolean insertFootTemperature(FootTemperature footTemperature);
	public List<FootTemperature> getFootTemperatures();
	public boolean deleteFootTemperature(FootTemperature footTemperature);
}
