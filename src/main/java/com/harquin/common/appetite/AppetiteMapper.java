package com.harquin.common.appetite;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface AppetiteMapper extends IMyBatisMapperMarker{
	public void insertAppetite(Appetite appetite);
	public List<Appetite> getAppetites();
	public void deleteAppetite(Appetite appetite);
}
