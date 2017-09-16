package com.harquin.common.inflammatory;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface InflammatoryMapper extends IMyBatisMapperMarker{
	public void insertInflammatory(Inflammatory inflammatory);
	public List<Inflammatory> getInflammatorys();
	public void deleteInflammatory(Inflammatory inflammatory);
}
