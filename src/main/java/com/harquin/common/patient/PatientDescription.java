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
import com.harquin.common.referringphysician.ReferringPhysician;
import com.harquin.common.socialHistory.SocialHistory;
import com.harquin.common.suppliments.Suppliments;
import com.harquin.common.wound.Wound;

public class PatientDescription {
	private int patientId;
	private Date dateOfBirth;
	private boolean hasFallRiskAssessment;
	private boolean isReferringPhysicianPrimaryPhysician;
	private String pneumococcalVaccine;
	
	private String referrerNotes;
	
	private List<String> allergies;
	private String appetite;
	private String bed;
	private String chair;
	private String feet;
	private List<String> gastroIntestinals;
	private List<String> attachedDocuments;
	private List<Wound> wounds;
	private List<String> faceSheets;
	private String preferredLanguage;
	private List<String> muscoloskeletals;
	private List<String> pastMedicalhistories;
	private ReferringPhysician referringPhysician;
	private List<String> socialHistories;
	private List<String> suppliments;
	
	public PatientDescription()
	{
		dateOfBirth = new Date();
		isReferringPhysicianPrimaryPhysician = false;
		referrerNotes = "";
	}
}
