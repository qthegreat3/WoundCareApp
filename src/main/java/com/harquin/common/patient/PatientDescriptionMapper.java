package com.harquin.common.patient;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.harquin.common.IMyBatisMapperMarker;

public interface PatientDescriptionMapper extends IMyBatisMapperMarker {
	public PatientDescription getPatientDescriptionById(int patientId);
	public void updatePatientInfo(PatientDescription patientDescription);
	public void insertPatientAllergies(@Param("allergies") List<String> allergies, @Param("patientId") int patientId);
	public void deletePatientAllergies(int patientId);
	public void insertPatientAnticoagulants(@Param("anticoagulants") List<String> anticoagulants, @Param("patientId") int patientId);
	public void deletePatientAnticoagulants(int patientId);
	public void insertPatientPastMedicalHistory(@Param("pastMedicalHistory") List<String> pastMedicalHistory, @Param("patientId") int patientId);
	public void deletePatientPastMedicalHistory(int patientId);
	public void insertPatientFamilyHistory(@Param("familyHistory") List<String> familyHistory, @Param("patientId") int patientId);
	public void deletePatientFamilyHistory(int patientId);
	public void insertPatientGastroIntestinals(@Param("gastroIntestinals") List<String> allergies, @Param("patientId") int patientId);
	public void deletePatientGastroIntestinals(int patientId);
	public void insertPatientSupplements(@Param("supplements") List<String> allergies, @Param("patientId") int patientId);
	public void deletePatientSupplements(int patientId);
	public void insertPatientMusculoskeletal(@Param("musculoskeletal") List<String> allergies, @Param("patientId") int patientId);
	public void deletePatientMusculoskeletal(int patientId);
	public void insertPatientChairs(@Param("chairs") List<String> allergies, @Param("patientId") int patientId);
	public void deletePatientChairs(int patientId);
	public void insertPatientFeet(@Param("feet") List<String> allergies, @Param("patientId") int patientId);
	public void deletePatientFeet(int patientId);
}
