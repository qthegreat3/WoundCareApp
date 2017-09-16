package com.harquin.common.foottemperature;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface FootTemperatureMapper extends IMyBatisMapperMarker{
	public void insertFootTemperature(FootTemperature footTemperature);
	public List<FootTemperature> getFootTemperatures();
	public void deleteFootTemperature(FootTemperature footTemperature);
}
