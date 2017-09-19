package com.harquin.common.patient;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;
import com.harquin.common.location.Location;

public interface PatientMapper extends IMyBatisMapperMarker {
	public List<Patient> getPatientByLocation(Location location);
	public Patient getPatientById(int id);
	public void updatePatient(Patient patient);
	public void insertPatient(Patient patient);
	public void deletePatient(Patient patient);
}
