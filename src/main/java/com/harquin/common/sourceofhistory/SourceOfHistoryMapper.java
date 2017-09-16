package com.harquin.common.sourceofhistory;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface SourceOfHistoryMapper extends IMyBatisMapperMarker{
	public void insertSourceOfHistory(SourceOfHistory sourceOfHistory);
	public List<SourceOfHistory> getSourceOfHistorys();
	public void deleteSourceOfHistory(SourceOfHistory sourceOfHistory);
}
