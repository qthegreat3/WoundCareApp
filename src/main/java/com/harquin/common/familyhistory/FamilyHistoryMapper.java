package com.harquin.common.familyhistory;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface FamilyHistoryMapper extends IMyBatisMapperMarker{
	public void insertFamilyHistory(FamilyHistory familyHistory);
	public List<FamilyHistory> getFamilyHistorys();
	public void deleteFamilyHistory(FamilyHistory familyHistory);
}
