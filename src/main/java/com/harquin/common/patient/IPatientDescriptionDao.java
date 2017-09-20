package com.harquin.common.patient;

public interface IPatientDescriptionDao {
	public PatientDescription getPatientDescriptionById(int patientId);
	public boolean updatePatientDescription(PatientDescription patientDescription);
	public boolean insertPatientDescription(PatientDescription patientDescription);
	public boolean deletePatientDecription(PatientDescription patientDescription);
}
