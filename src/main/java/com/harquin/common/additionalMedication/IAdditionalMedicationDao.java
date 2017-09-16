package com.harquin.common.additionalMedication;

import java.util.List;

public interface IAdditionalMedicationDao {
	public boolean insertAdditionalMedication(AdditionalMedication additionalMedication);
	public List<AdditionalMedication> getAdditionalMedications();
	public boolean deleteAdditionalMedication(AdditionalMedication additionalMedication);
}
