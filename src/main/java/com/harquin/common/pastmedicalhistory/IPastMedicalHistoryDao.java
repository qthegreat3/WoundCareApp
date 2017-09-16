package com.harquin.common.pastmedicalhistory;

import java.util.List;

public interface IPastMedicalHistoryDao {
	public boolean insertPastMedicalHistory(PastMedicalHistory pastMedicalHistory);
	public List<PastMedicalHistory> getPastMedicalHistorys();
	public boolean deletePastMedicalHistory(PastMedicalHistory pastMedicalHistory);
}
