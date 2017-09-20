package com.harquin.common.patient;

import com.harquin.common.IMyBatisMapperMarker;

public interface PatientDescriptionMapper extends IMyBatisMapperMarker {
	public PatientDescription getPatientDescriptionById(int patientId);
	public void updatePatientDescription(PatientDescription patientDescription);
	public void insertPatientDescription(PatientDescription patientDescription);
	public void deletePatientDecription(PatientDescription patientDescription);
}
