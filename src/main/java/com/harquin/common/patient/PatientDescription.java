package com.harquin.common.patient;

import java.util.Date;
import java.util.List;

import com.harquin.common.allergy.Allergy;
import com.harquin.common.appetite.Appetite;
import com.harquin.common.bed.Bed;
import com.harquin.common.chair.Chair;
import com.harquin.common.document.Document;
import com.harquin.common.facesheet.FaceSheet;
import com.harquin.common.feet.Feet;
import com.harquin.common.gastrointestinal.GastroIntestinal;
import com.harquin.common.language.Language;
import com.harquin.common.location.Location;
import com.harquin.common.muscoloskeletal.Muscoloskeletal;
import com.harquin.common.pastmedicalhistory.PastMedicalHistory;
import com.harquin.common.pneumococcalvaccine.PneumococcalVaccine;
import com.harquin.common.socialHistory.SocialHistory;
import com.harquin.common.suppliments.Suppliments;
import com.harquin.common.wound.Wound;

public class PatientDescription {
	private int patientId;
	
	private String firstName;
	private String lastName;
	private String roomNumber;
	
	private String gender;	
	private Date dateOfBirth;
	
	private String preferredLanguage;
	private List<String> allergies;
	private String ethnicity;
	private String race;
	
	private boolean isMedicationReviewed;
	private boolean isEmailPreferredContactMethod;
	
	private List<String> anticoagulants;
	
	private boolean isDiabetic;
	
	private List<String> pastMedicalhistory;
	private List<String> familyHistory;
	private String pneumococcalVaccine;
	private String fallRiskAssessment;
	private String socialHistory;	
	private List<String> gastroIntestinal;
	private String appetite;

	
	private List<String> suppliments;
	private List<String> muscoloskeletal;
	private String bed;	
	private List<String> chair;
	private List<String> feet;
	
	private boolean isPatientReviewed;
	
	private String referringPhysicianFirstName;
	private String referringPhysicianLastName;
	
	public PatientDescription()
	{

	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	public String getEthnicity() {
		return ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public boolean isMedicationReviewed() {
		return isMedicationReviewed;
	}

	public void setMedicationReviewed(boolean isMedicationReviewed) {
		this.isMedicationReviewed = isMedicationReviewed;
	}

	public boolean isEmailPreferredContactMethod() {
		return isEmailPreferredContactMethod;
	}

	public void setEmailPreferredContactMethod(boolean isEmailPreferredContactMethod) {
		this.isEmailPreferredContactMethod = isEmailPreferredContactMethod;
	}

	public List<String> getAnticoagulants() {
		return anticoagulants;
	}

	public void setAnticoagulants(List<String> anticoagulants) {
		this.anticoagulants = anticoagulants;
	}

	public boolean isDiabetic() {
		return isDiabetic;
	}

	public void setDiabetic(boolean isDiabetic) {
		this.isDiabetic = isDiabetic;
	}

	public List<String> getPastMedicalhistory() {
		return pastMedicalhistory;
	}

	public void setPastMedicalhistory(List<String> pastMedicalhistory) {
		this.pastMedicalhistory = pastMedicalhistory;
	}

	public List<String> getFamilyHistory() {
		return familyHistory;
	}

	public void setFamilyHistory(List<String> familyHistory) {
		this.familyHistory = familyHistory;
	}

	public String getPneumococcalVaccine() {
		return pneumococcalVaccine;
	}

	public void setPneumococcalVaccine(String pneumococcalVaccine) {
		this.pneumococcalVaccine = pneumococcalVaccine;
	}

	public String getFallRiskAssessment() {
		return fallRiskAssessment;
	}

	public void setFallRiskAssessment(String fallRiskAssessment) {
		this.fallRiskAssessment = fallRiskAssessment;
	}

	public String getSocialHistory() {
		return socialHistory;
	}

	public void setSocialHistory(String socialHistory) {
		this.socialHistory = socialHistory;
	}

	public List<String> getGastroIntestinal() {
		return gastroIntestinal;
	}

	public void setGastroIntestinal(List<String> gastroIntestinal) {
		this.gastroIntestinal = gastroIntestinal;
	}

	public String getAppetite() {
		return appetite;
	}

	public void setAppetite(String appetite) {
		this.appetite = appetite;
	}

	public List<String> getSuppliments() {
		return suppliments;
	}

	public void setSuppliments(List<String> suppliments) {
		this.suppliments = suppliments;
	}

	public List<String> getMuscoloskeletal() {
		return muscoloskeletal;
	}

	public void setMuscoloskeletal(List<String> muscoloskeletal) {
		this.muscoloskeletal = muscoloskeletal;
	}

	public String getBed() {
		return bed;
	}

	public void setBed(String bed) {
		this.bed = bed;
	}

	public List<String> getChair() {
		return chair;
	}

	public void setChair(List<String> chair) {
		this.chair = chair;
	}

	public List<String> getFeet() {
		return feet;
	}

	public void setFeet(List<String> feet) {
		this.feet = feet;
	}

	public boolean isPatientReviewed() {
		return isPatientReviewed;
	}

	public void setPatientReviewed(boolean isPatientReviewed) {
		this.isPatientReviewed = isPatientReviewed;
	}

	public String getReferringPhysicianFirstName() {
		return referringPhysicianFirstName;
	}

	public void setReferringPhysicianFirstName(String referringPhysicianFirstName) {
		this.referringPhysicianFirstName = referringPhysicianFirstName;
	}

	public String getReferringPhysicianLastName() {
		return referringPhysicianLastName;
	}

	public void setReferringPhysicianLastName(String referringPhysicianLastName) {
		this.referringPhysicianLastName = referringPhysicianLastName;
	}	
}
