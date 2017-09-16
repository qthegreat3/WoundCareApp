package com.harquin.common.familyhistory;

import java.util.List;

public interface IFamilyHistoryDao {
	public boolean insertFamilyHistory(FamilyHistory familyHistory);
	public List<FamilyHistory> getFamilyHistorys();
	public boolean deleteFamilyHistory(FamilyHistory familyHistory);
}
