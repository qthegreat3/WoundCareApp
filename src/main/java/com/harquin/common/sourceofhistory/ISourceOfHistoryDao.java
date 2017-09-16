package com.harquin.common.sourceofhistory;

import java.util.List;

public interface ISourceOfHistoryDao {
	public boolean insertSourceOfHistory(SourceOfHistory sourceOfHistory);
	public List<SourceOfHistory> getSourceOfHistorys();
	public boolean deleteSourceOfHistory(SourceOfHistory sourceOfHistory);
}
