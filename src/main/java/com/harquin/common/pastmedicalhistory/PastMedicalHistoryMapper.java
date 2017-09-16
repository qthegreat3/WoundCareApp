package com.harquin.common.pastmedicalhistory;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface PastMedicalHistoryMapper extends IMyBatisMapperMarker{
	public void insertPastMedicalHistory(PastMedicalHistory pastMedicalHistory);
	public List<PastMedicalHistory> getPastMedicalHistorys();
	public void deletePastMedicalHistory(PastMedicalHistory pastMedicalHistory);
}
