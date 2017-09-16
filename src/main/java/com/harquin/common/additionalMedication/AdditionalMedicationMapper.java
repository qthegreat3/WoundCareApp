package com.harquin.common.additionalMedication;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface AdditionalMedicationMapper extends IMyBatisMapperMarker {
	public void insertAdditionalMedication(AdditionalMedication additionalMedication);
	public List<AdditionalMedication> getAdditionalMedications();
	public void deleteAdditionalMedication(AdditionalMedication additionalMedication);
}
