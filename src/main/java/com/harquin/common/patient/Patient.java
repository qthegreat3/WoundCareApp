package com.harquin.common.patient;

import java.util.ArrayList;
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
import com.harquin.common.referringphysician.ReferringPhysician;
import com.harquin.common.socialHistory.SocialHistory;
import com.harquin.common.suppliments.Suppliments;
import com.harquin.common.wound.Wound;

public class Patient {

	private String firstName;
	private String lastName;
	
	private Date dateOfBirth;
	private Date followUpDate;
	private Date lastVisitDate;
	
	private boolean hasFallRiskAssessment;
	private boolean isAcive;
	private boolean isReferringPhysicianPrimaryPhysician;
	private boolean hasPneumococcalVaccine;
	
	private StringBuilder referrerNotes;
	
	private List<Allergy> allergies;
	private Appetite appetite;
	private Bed bed;
	private Chair chair;
	private Feet feet;
	private List<GastroIntestinal> gastroIntestinals;
	private List<Document> attachedDocuments;
	private List<Wound> wounds;
	private List<FaceSheet> faceSheets;
	private Language preferredLanguage;
	private List<Muscoloskeletal> muscoloskeletals;
	private List<PastMedicalHistory> pastMedicalhistories;
	private ReferringPhysician referringPhysician;
	private List<SocialHistory> socialHistories;
	private List<Suppliments> suppliments;
	private Location facility;
	
	public Patient(String firstName, String lastName)
	{
		setFirstName(firstName);
		setLastName(lastName);
		
		dateOfBirth = new Date();
		followUpDate = new Date();
		lastVisitDate = new Date();
		
		allergies = new ArrayList<Allergy>();
		attachedDocuments = new ArrayList<Document>();
		wounds = new ArrayList<Wound>();
		faceSheets = new ArrayList<FaceSheet>();
		gastroIntestinals = new ArrayList<GastroIntestinal>();
		muscoloskeletals = new ArrayList<Muscoloskeletal>();
		pastMedicalhistories = new ArrayList<PastMedicalHistory>();
		socialHistories = new ArrayList<SocialHistory>();
		suppliments = new ArrayList<Suppliments>();
	}

	public void addAllergy(Allergy allergy)
	{
		if(allergy == null)
		{
			throw new IllegalArgumentException("Allergy Cannot Be Null");
		}
		
		allergies.add(allergy);
	}
	
	public void addAttachedDocument(Document document)
	{
		if(document == null)
		{
			throw new IllegalArgumentException("Document Cannot Be Null");
		}
		
		attachedDocuments.add(document);
	}
	
	
	public void addWound(Wound wound)
	{
		if(wound == null)
		{
			throw new IllegalArgumentException("Wound Cannot Be Null");
		}
		
		wounds.add(wound);
	}
	
	public void addFaceSheet(FaceSheet facesheet)
	{
		if(facesheet == null)
		{
			throw new IllegalArgumentException("Face Sheet Cannot Be Null");
		}
		
		faceSheets.add(facesheet);
	}
	
	public void addMuscoloskeletal(Muscoloskeletal muscoloskeletal)
	{
		if(muscoloskeletal == null)
		{
			throw new IllegalArgumentException("Muscoloskeletal Cannot Be Null");
		}
		
		muscoloskeletals.add(muscoloskeletal);
	}
	
	public void addPastMedicalHistory(PastMedicalHistory pastMedicalHistory)
	{
		if(pastMedicalHistory == null)
		{
			throw new IllegalArgumentException("Past Medical History Cannot Be Null");
		}
		
		pastMedicalhistories.add(pastMedicalHistory);
	}
	
	public void addSocialHistory(SocialHistory socialHistory)
	{
		if(socialHistory == null)
		{
			throw new IllegalArgumentException("Social History Cannot Be Null");
		}
		
		socialHistories.add(socialHistory);
	}
	
	public void addSuppliments(Suppliments suppliment)
	{
		if(suppliment == null)
		{
			throw new IllegalArgumentException("Suppliment Cannot Be Null");
		}
		
		suppliments.add(suppliment);
	}
	
	public void addGastroIntestinals(GastroIntestinal gastroIntestinal)
	{
		if(gastroIntestinal == null)
		{
			throw new IllegalArgumentException("GastroIntestinal Cannot Be Null");
		}
		
		gastroIntestinals.add(gastroIntestinal);
	}
	
	public Appetite getAppetite() {
		return appetite;
	}

	public void setAppetite(Appetite appetite) {
		this.appetite = appetite;
	}

	public Bed getBed() {
		return bed;
	}

	public void setBed(Bed bed) {
		this.bed = bed;
	}

	public Chair getChair() {
		return chair;
	}

	public void setChair(Chair chair) {
		this.chair = chair;
	}

	public Feet getFeet() {
		return feet;
	}

	public void setFeet(Feet feet) {
		this.feet = feet;
	}

	public Language getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(Language preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public ReferringPhysician getReferringPhysician() {
		return referringPhysician;
	}

	public void setReferringPhysician(ReferringPhysician referringPhysician) {
		this.referringPhysician = referringPhysician;
	}

	public Location getFacility() {
		return facility;
	}

	public void setFacility(Location facility) {
		this.facility = facility;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName == null)
		{
			throw new IllegalArgumentException("First Name Cannot Be Null");
		}
				
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName == null)
		{
			throw new IllegalArgumentException("Last Name Cannot Be Null");
		}
		
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		if(dateOfBirth == null)
		{
			throw new IllegalArgumentException("Date Of Birth Cannot Be Null");
		}
		
		this.dateOfBirth = dateOfBirth;
	}

	public Date getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(Date followUpDate) {
		if(followUpDate == null)
		{
			throw new IllegalArgumentException("Follow Up Date Cannot Be Null");
		}
		
		this.followUpDate = followUpDate;
	}

	public Date getLastVisitDate() {
		return lastVisitDate;
	}

	public void setLastVisitDate(Date lastVisitDate) {
		if(lastVisitDate == null)
		{
			throw new IllegalArgumentException("Last Visit Date Cannot Be Null");
		}
		
		this.lastVisitDate = lastVisitDate;
	}

	public boolean isHasFallRiskAssessment() {
		return hasFallRiskAssessment;
	}

	public void setHasFallRiskAssessment(boolean hasFallRiskAssessment) {
		this.hasFallRiskAssessment = hasFallRiskAssessment;
	}

	public boolean isAcive() {
		return isAcive;
	}

	public void setAcive(boolean isAcive) {
		this.isAcive = isAcive;
	}

	public boolean isReferringPhysicianPrimaryPhysician() {
		return isReferringPhysicianPrimaryPhysician;
	}

	public void setReferringPhysicianPrimaryPhysician(boolean isReferringPhysicianPrimaryPhysician) {
		this.isReferringPhysicianPrimaryPhysician = isReferringPhysicianPrimaryPhysician;
	}

	public boolean isHasPneumococcalVaccine() {
		return hasPneumococcalVaccine;
	}

	public void setHasPneumococcalVaccine(boolean hasPneumococcalVaccine) {
		this.hasPneumococcalVaccine = hasPneumococcalVaccine;
	}

	public String getReferrerNotes() {
		return referrerNotes.toString();
	}

	public void clearReferrerNotes() {
		referrerNotes = new StringBuilder();
	}
	
	public void addToReferrerNotes(String notes){
		referrerNotes.append(notes);
	}
	

	public List<Allergy> getAllergies() {
		return allergies;
	}

	public List<GastroIntestinal> getGastroIntestinals() {
		return gastroIntestinals;
	}

	public List<Document> getAttachedDocuments() {
		return attachedDocuments;
	}

	public List<Wound> getWounds() {
		return wounds;
	}

	public List<FaceSheet> getFaceSheets() {
		return faceSheets;
	}

	public List<Muscoloskeletal> getMuscoloskeletals() {
		return muscoloskeletals;
	}

	public List<PastMedicalHistory> getPastMedicalhistories() {
		return pastMedicalhistories;
	}

	public List<SocialHistory> getSocialHistories() {
		return socialHistories;
	}

	public List<Suppliments> getSuppliments() {
		return suppliments;
	}
	
	
}
