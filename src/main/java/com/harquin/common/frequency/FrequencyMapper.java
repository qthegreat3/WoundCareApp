package com.harquin.common.frequency;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface FrequencyMapper extends IMyBatisMapperMarker{
	public void insertFrequency(Frequency frequency);
	public List<Frequency> getFrequencys();
	public void deleteFrequency(Frequency frequency);
}
