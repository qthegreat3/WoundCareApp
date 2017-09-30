package com.harquin.common.patient;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.harquin.common.allergy.Allergy;
import com.harquin.common.allergy.IAllergyDao;
import com.harquin.common.anticoagulant.Anticoagulant;
import com.harquin.common.anticoagulant.IAnticoagulantDao;
import com.harquin.common.appetite.Appetite;
import com.harquin.common.appetite.IAppetiteDao;
import com.harquin.common.bed.Bed;
import com.harquin.common.bed.IBedDao;
import com.harquin.common.chair.Chair;
import com.harquin.common.chair.IChairDao;
import com.harquin.common.ethnicity.Ethnicity;
import com.harquin.common.ethnicity.IEthnicityDao;
import com.harquin.common.fallriskassessment.FallRiskAssessment;
import com.harquin.common.fallriskassessment.IFallRiskAssessmentDao;
import com.harquin.common.familyhistory.FamilyHistory;
import com.harquin.common.familyhistory.IFamilyHistoryDao;
import com.harquin.common.feet.Feet;
import com.harquin.common.feet.IFeetDao;
import com.harquin.common.gastrointestinal.GastroIntestinal;
import com.harquin.common.gastrointestinal.IGastroIntestinalDao;
import com.harquin.common.gender.Gender;
import com.harquin.common.gender.IGenderDao;
import com.harquin.common.language.ILanguageDao;
import com.harquin.common.language.Language;
import com.harquin.common.location.ILocationDao;
import com.harquin.common.location.Location;
import com.harquin.common.musculoskeletal.IMusculoskeletalDao;
import com.harquin.common.musculoskeletal.Musculoskeletal;
import com.harquin.common.pastmedicalhistory.IPastMedicalHistoryDao;
import com.harquin.common.pastmedicalhistory.PastMedicalHistory;
import com.harquin.common.pneumococcalvaccine.IPneumococcalVaccineDao;
import com.harquin.common.pneumococcalvaccine.PneumococcalVaccine;
import com.harquin.common.race.IRaceDao;
import com.harquin.common.race.Race;
import com.harquin.common.socialHistory.ISocialHistoryDao;
import com.harquin.common.socialHistory.SocialHistory;
import com.harquin.common.supplment.ISupplmentDao;
import com.harquin.common.supplment.Supplment;
import com.harquin.config.TestAppConfig;

import ch.qos.logback.core.db.DBAppenderBase;

@ContextConfiguration(classes = {TestAppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PatientDescriptionDaoTest {

	@Autowired
	IPatientDescriptionDao patientDescriptionDao;
	
	@Autowired
	IGenderDao genderDao;
	
	@Autowired
	IAllergyDao allergyDao;
	
	@Autowired
	ILanguageDao languageDao;
	
	@Autowired
	IRaceDao raceDao;
	
	@Autowired
	IEthnicityDao ethnicityDao;
	
	@Autowired
	IPastMedicalHistoryDao pastMedicalHistoryDao;
	
	@Autowired
	IFamilyHistoryDao familyHistoryDao;
	
	@Autowired
	IPneumococcalVaccineDao pneumococcalVaccineDao;
	
	@Autowired
	IFallRiskAssessmentDao fallRiskAssessmentDao;
	
	@Autowired
	ISocialHistoryDao socialHistoryDao;
	
	@Autowired
	IGastroIntestinalDao gastroIntestinalDao;
	
	@Autowired
	IAppetiteDao appetiteDao;
	
	@Autowired
	ISupplmentDao supplementDao;
	
	@Autowired
	IMusculoskeletalDao musculoskeletalDao;
	
	@Autowired
	IBedDao bedDao;
	
	@Autowired
	IChairDao chairDao;
	
	@Autowired
	IFeetDao feetDao;
	
	@Autowired
	IAnticoagulantDao anticoagulantDao;
	
	@Autowired
	IPatientDao patientDao;
	
	@Autowired
	ILocationDao locationDao;
	
	@Autowired
	ISupplmentDao supplimentDao;
	
	@Test
	public void crudTest() throws ParseException
	{
		populateDBwithRelevantDropdownValues();
		
		PatientDescription description = new PatientDescription();
		
		List<String> allergyList = new ArrayList<>();
		allergyList.add(allergies[INSERT_VALUE]);		
		allergyList.add(allergies[INSERT_VALUE + 1]);
		description.setAllergies(allergyList);
				
		List<String> anticoagulantList = new ArrayList<>();
		anticoagulantList.add(anticoagulants[INSERT_VALUE]);
		anticoagulantList.add(anticoagulants[INSERT_VALUE + 1]);
		description.setAnticoagulants(anticoagulantList);
		
		description.setAppetite(appetites[INSERT_VALUE]);
		
		description.setBed(beds[INSERT_VALUE]);
		
		List<String> chairList = new ArrayList<>();
		chairList.add(chairs[INSERT_VALUE]);
		chairList.add(chairs[INSERT_VALUE + 1]);
		description.setChair(chairList);
		
		Date dateOfBirth = new Date();		
		description.setDateOfBirth(dateOfBirth);
		
		boolean isDiabetic = true;
		description.setDiabetic(isDiabetic);
		
		boolean isEmailPreferredContactMethod = false;
		description.setEmailPreferredContactMethod(isEmailPreferredContactMethod);
		
		description.setEthnicity(ethnicities[INSERT_VALUE]);
		
		description.setFallRiskAssessment(fallRiskAssessments[INSERT_VALUE]);
		
		List<String> familyHistoryList = new ArrayList<>();
		familyHistoryList.add(familyHistories[INSERT_VALUE]);
		familyHistoryList.add(familyHistories[INSERT_VALUE + 1]);
		description.setFamilyHistory(familyHistoryList);
		
		List<String> feetList = new ArrayList<>();
		feetList.add(feet[INSERT_VALUE]);
		feetList.add(feet[INSERT_VALUE + 1]);
		description.setFeet(feetList);
		
		String firstName = "TEst";
		description.setFirstName(firstName);
		
		List<String> gastroIntestinalList = new ArrayList<>();
		gastroIntestinalList.add(gis[INSERT_VALUE]);
		gastroIntestinalList.add(gis[INSERT_VALUE + 1]);
		description.setGastroIntestinal(gastroIntestinalList);
		
		description.setGender(genders[INSERT_VALUE]);
		
		String lastName = "Birch";
		description.setLastName(lastName);
		
		boolean isMedicationReviewed = false;
		description.setMedicationReviewed(isMedicationReviewed);
		
		List<String> muscoloskeletalList = new ArrayList<>();
		muscoloskeletalList.add(musculoskeletals[INSERT_VALUE]);
		muscoloskeletalList.add(musculoskeletals[INSERT_VALUE] + 1);
		description.setMuscoloskeletal(muscoloskeletalList);
		
		List<String> pastMedicalhistoryList = new ArrayList<>();
		pastMedicalhistoryList.add(pastMedicalHistories[INSERT_VALUE]);
		pastMedicalhistoryList.add(pastMedicalHistories[INSERT_VALUE + 1]);
		description.setPastMedicalhistory(pastMedicalhistoryList);
		
		Patient patient = createPatient();
		
		description.setPatientId(patient.getId());
		
		boolean isPatientReviewed = true;
		description.setPatientReviewed(isPatientReviewed);
		
		description.setPneumococcalVaccine(pneumococcalVaccines[INSERT_VALUE]);
		
		description.setPreferredLanguage(languages[INSERT_VALUE]);
		
		description.setRace(races[INSERT_VALUE]);
		
		String physicianFirstName = "Morty";
		String physicianLastName = "Stats";

		description.setReferringPhysicianFirstName(physicianFirstName);
		description.setReferringPhysicianLastName(physicianLastName);
		
		String roomNumber = "34B";
		description.setRoomNumber(roomNumber);
		
		description.setSocialHistory(socialHistories[INSERT_VALUE]);
		
		List<String> supplimentsList = new ArrayList<>();
		supplimentsList.add(suppliments[INSERT_VALUE]);
		supplimentsList.add(suppliments[INSERT_VALUE + 1]);
		description.setSuppliments(supplimentsList);
		
		patientDescriptionDao.insertPatientDescription(description);
		
		PatientDescription dbDescription = patientDescriptionDao.getPatientDescriptionById(patient.getId());
		
		assertTrue(arePatientDescriptionsEqual(dbDescription, description));
		
		allergyList = new ArrayList<>();
		allergyList.add(allergies[UPDATE_VALUE]);		
		allergyList.add(allergies[UPDATE_VALUE+ 1]);
		description.setAllergies(allergyList);
				
		anticoagulantList = new ArrayList<>();
		anticoagulantList.add(anticoagulants[UPDATE_VALUE]);
		anticoagulantList.add(anticoagulants[UPDATE_VALUE + 1]);
		description.setAnticoagulants(anticoagulantList);
		
		description.setAppetite(appetites[UPDATE_VALUE]);
		
		description.setBed(beds[UPDATE_VALUE]);
		
		chairList = new ArrayList<>();
		chairList.add(chairs[UPDATE_VALUE]);
		chairList.add(chairs[UPDATE_VALUE + 1]);
		description.setChair(chairList);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
				
		dateOfBirth = sdf.parse("2017-08-08");		
		description.setDateOfBirth(dateOfBirth);
		
		isDiabetic = false;
		description.setDiabetic(isDiabetic);
		
		isEmailPreferredContactMethod = true;
		description.setEmailPreferredContactMethod(isEmailPreferredContactMethod);
		
		description.setEthnicity(ethnicities[UPDATE_VALUE]);
		
		description.setFallRiskAssessment(fallRiskAssessments[UPDATE_VALUE]);
		
		familyHistoryList = new ArrayList<>();
		familyHistoryList.add(familyHistories[UPDATE_VALUE]);
		familyHistoryList.add(familyHistories[UPDATE_VALUE + 1]);
		description.setFamilyHistory(familyHistoryList);
		
		feetList = new ArrayList<>();
		feetList.add(feet[UPDATE_VALUE]);
		feetList.add(feet[UPDATE_VALUE + 1]);
		description.setFeet(feetList);
		
		firstName = "LAffy";
		description.setFirstName(firstName);
		
		gastroIntestinalList = new ArrayList<>();
		gastroIntestinalList.add(gis[UPDATE_VALUE]);
		gastroIntestinalList.add(gis[UPDATE_VALUE + 1]);
		description.setGastroIntestinal(gastroIntestinalList);
		
		description.setGender(genders[UPDATE_VALUE]);
		
		lastName = "Lurch";
		description.setLastName(lastName);
		
		isMedicationReviewed = true;
		description.setMedicationReviewed(isMedicationReviewed);
		
		muscoloskeletalList = new ArrayList<>();
		muscoloskeletalList.add(musculoskeletals[UPDATE_VALUE]);
		muscoloskeletalList.add(musculoskeletals[UPDATE_VALUE + 1]);
		description.setMuscoloskeletal(muscoloskeletalList);
		
		pastMedicalhistoryList = new ArrayList<>();
		pastMedicalhistoryList.add(pastMedicalHistories[UPDATE_VALUE]);
		pastMedicalhistoryList.add(pastMedicalHistories[UPDATE_VALUE + 1]);
		description.setPastMedicalhistory(pastMedicalhistoryList);
		
		isPatientReviewed = false;
		description.setPatientReviewed(isPatientReviewed);
		
		description.setPneumococcalVaccine(pneumococcalVaccines[UPDATE_VALUE]);
		
		description.setPreferredLanguage(languages[UPDATE_VALUE]);
		
		description.setRace(races[UPDATE_VALUE]);
		
		physicianFirstName = "Stpe";
		physicianLastName = "Reest";

		description.setReferringPhysicianFirstName(physicianFirstName);
		description.setReferringPhysicianLastName(physicianLastName);
		
		roomNumber = "12A";
		description.setRoomNumber(roomNumber);
		
		description.setSocialHistory(socialHistories[UPDATE_VALUE]);
		
		supplimentsList = new ArrayList<>();
		supplimentsList.add(suppliments[UPDATE_VALUE]);
		supplimentsList.add(suppliments[UPDATE_VALUE + 1]);
		description.setSuppliments(supplimentsList);
		
		patientDescriptionDao.updatePatientDescription(description);
		
		dbDescription = patientDescriptionDao.getPatientDescriptionById(description.getPatientId());
		
		assertTrue(arePatientDescriptionsEqual(description, dbDescription));
		
		patientDescriptionDao.deletePatientDecription(description);
		
		dbDescription = patientDescriptionDao.getPatientDescriptionById(description.getPatientId());
		
		assertTrue(dbDescription.getFirstName().equals(description.getFirstName()));
		assertTrue(dbDescription.getFirstName().equals(description.getFirstName()));
		assertTrue(dbDescription.getPatientId() == description.getPatientId());
		assertTrue(dbDescription.getAllergies().isEmpty());
		assertTrue(dbDescription.getAnticoagulants().isEmpty());
		assertTrue(dbDescription.getChair().isEmpty());
		assertTrue(dbDescription.getFamilyHistory().isEmpty());
		assertTrue(dbDescription.getFeet().isEmpty());
		assertTrue(dbDescription.getGastroIntestinal().isEmpty());
		assertTrue(dbDescription.getMuscoloskeletal().isEmpty());
		assertTrue(dbDescription.getPastMedicalhistory().isEmpty());
		assertTrue(dbDescription.getSuppliments().isEmpty());
		assertTrue(dbDescription.getAppetite() == null);
		assertTrue(dbDescription.getBed() == null);
		assertTrue(dbDescription.getDateOfBirth() == null);
		assertTrue(dbDescription.getEthnicity() == null);
		assertTrue(dbDescription.getFallRiskAssessment() == null);
		assertTrue(dbDescription.getGender() == null);
		assertTrue(dbDescription.getPneumococcalVaccine() == null);
		assertTrue(dbDescription.getPreferredLanguage() == null);
		assertTrue(dbDescription.getRace() == null);
		assertTrue(dbDescription.getReferringPhysicianFirstName() == null);
		assertTrue(dbDescription.getReferringPhysicianLastName() == null);
		assertTrue(dbDescription.getRoomNumber() == null);
		assertTrue(dbDescription.getSocialHistory() == null);
		assertTrue(!dbDescription.isDiabetic());
		assertFalse(dbDescription.isEmailPreferredContactMethod());
		assertFalse(dbDescription.isMedicationReviewed());
		assertFalse(dbDescription.isPatientReviewed());
		patientDescriptionDao.insertPatientDescription(dbDescription);
		PatientDescription newDesription = patientDescriptionDao.getPatientDescriptionById(dbDescription.getPatientId());
		assertTrue(newDesription.getFirstName().equals(dbDescription.getFirstName()));
		assertTrue(newDesription.getFirstName().equals(dbDescription.getFirstName()));
		assertTrue(newDesription.getPatientId() == dbDescription.getPatientId());
		assertTrue(newDesription.getAllergies().isEmpty());
		assertTrue(newDesription.getAnticoagulants().isEmpty());
		assertTrue(newDesription.getChair().isEmpty());
		assertTrue(newDesription.getFamilyHistory().isEmpty());
		assertTrue(newDesription.getFeet().isEmpty());
		assertTrue(newDesription.getGastroIntestinal().isEmpty());
		assertTrue(newDesription.getMuscoloskeletal().isEmpty());
		assertTrue(newDesription.getPastMedicalhistory().isEmpty());
		assertTrue(newDesription.getSuppliments().isEmpty());
		assertTrue(newDesription.getAppetite() == null);
		assertTrue(newDesription.getBed() == null);
		assertTrue(newDesription.getDateOfBirth() == null);
		assertTrue(newDesription.getEthnicity() == null);
		assertTrue(newDesription.getFallRiskAssessment() == null);
		assertTrue(newDesription.getGender() == null);
		assertTrue(newDesription.getPneumococcalVaccine() == null);
		assertTrue(newDesription.getPreferredLanguage() == null);
		assertTrue(newDesription.getRace() == null);
		assertTrue(newDesription.getReferringPhysicianFirstName() == null);
		assertTrue(newDesription.getReferringPhysicianLastName() == null);
		assertTrue(newDesription.getRoomNumber() == null);
		assertTrue(newDesription.getSocialHistory() == null);
		assertTrue(!newDesription.isDiabetic());
		assertFalse(newDesription.isEmailPreferredContactMethod());
		assertFalse(newDesription.isMedicationReviewed());
		assertFalse(newDesription.isPatientReviewed());
	}
	
	private boolean arePatientDescriptionsEqual(PatientDescription pd1, PatientDescription pd2)
	{	
		if(!areTheseListsEqual(pd1.getAllergies(), pd2.getAllergies()))
		{
			return false;
		}
		
		if(!areTheseListsEqual(pd1.getAnticoagulants(), pd2.getAnticoagulants()))
		{
			return false;
		}
		
		if(!areTheseListsEqual(pd1.getChair(), pd2.getChair()))
		{
			return false;
		}
		
		if(!areTheseListsEqual(pd1.getFamilyHistory(), pd2.getFamilyHistory()))
		{
			return false;
		}
		
		if(!areTheseListsEqual(pd1.getFeet(), pd2.getFeet()))
		{
			return false;
		}
		
		if(!areTheseListsEqual(pd1.getGastroIntestinal(), pd2.getGastroIntestinal()))
		{
			return false;
		}
		
		if(!areTheseListsEqual(pd1.getMuscoloskeletal(), pd2.getMuscoloskeletal()))
		{
			return false;
		}
		
		if(!areTheseListsEqual(pd1.getPastMedicalhistory(), pd2.getPastMedicalhistory()))
		{
			return false;
		}
		
		if(!areTheseListsEqual(pd1.getSuppliments(), pd2.getSuppliments()))
		{
			return false;
		}
		
		if(!pd1.getAppetite().equals(pd2.getAppetite()))
		{
			return false;
		}
		
		if(!pd1.getBed().equals(pd2.getBed()))
		{
			return false;
		}
		
		if(!areTheseDatesEqual(pd1.getDateOfBirth(), pd2.getDateOfBirth()))
		{
			return false;
		}
		
		if(!pd1.getEthnicity().equals(pd2.getEthnicity()))
		{
			return false;
		}
		
		if(!pd1.getFallRiskAssessment().equals(pd2.getFallRiskAssessment()))
		{
			return false;
		}
		
		if(!pd1.getFirstName().equals(pd2.getFirstName()))
		{
			return false;
		}
		
		if(!pd1.getGender().equals(pd2.getGender()))
		{
			return false;
		}
		
		if(!pd1.getLastName().equals(pd2.getLastName()))
		{
			return false;
		}
		
		if(!(pd1.getPatientId() == pd2.getPatientId()))
		{
			return false;
		}
		
		if(!pd1.getPneumococcalVaccine().equals(pd2.getPneumococcalVaccine()))
		{
			return false;
		}
		
		if(!pd1.getPreferredLanguage().equals(pd2.getPreferredLanguage()))
		{
			return false;
		}
		
		if(!pd1.getRace().equals(pd2.getRace()))
		{
			return false;
		}
		
		if(!pd1.getReferringPhysicianFirstName().equals(pd2.getReferringPhysicianFirstName()))
		{
			return false;
		}
		
		if(!pd1.getReferringPhysicianLastName().equals(pd2.getReferringPhysicianLastName()))
		{
			return false;
		}
		
		if(!pd1.getRoomNumber().equals(pd2.getRoomNumber()))
		{
			return false;
		}
		
		if(!pd1.getSocialHistory().equals(pd2.getSocialHistory()))
		{
			return false;
		}
		
		if(pd1.isDiabetic() != pd2.isDiabetic())
		{
			return false;
		}
		
		if(pd1.isEmailPreferredContactMethod() != pd2.isEmailPreferredContactMethod())
		{
			return false;
		}
		
		if(pd1.isMedicationReviewed() != pd2.isMedicationReviewed())
		{
			return false;
		}
		
		if(pd1.isPatientReviewed() != pd2.isPatientReviewed())
		{
			return false;
		}
		
		return true;
	}
	
	
	private <T> boolean areTheseListsEqual (List<T> list1, List<T> list2)
	{
		for(T item : list1)
		{
			if(!list2.contains(item))
			{
				return false;
			}
		}
		
		return true;
	}
	
	private boolean areTheseDatesEqual(Date date1, Date date2)
	{
		Calendar cal1 = Calendar.getInstance();		
		cal1.setTime(date1);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		
		boolean areDaysEqual = cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
		boolean areMonthsEqual = cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
		boolean areYearsEqual = cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR);
		
		return areDaysEqual && areMonthsEqual && areYearsEqual;
	}
	
	private Patient createPatient()
	{
		Location location = new Location("Crazy");
		locationDao.insertLocation(location);
				
		String firstName = "Get";
		String lastName = "Friday";
		
		Patient patient = new Patient(firstName, lastName);
		patient.setLocation(location.getName());
		
		Date lastVistDate = new Date();
		Date followUpVisitDate = new Date();
		
		patient.setFollowUpVisitDate(followUpVisitDate);
		patient.setLastVisitDate(lastVistDate);
		
		boolean isActive = true;
		
		patient.setActive(isActive);
		
		patientDao.insertPatient(patient);
		
		return patient;
	}
	
	
	private final int INSERT_VALUE = 0;
	private final int UPDATE_VALUE = 1;
	
	private String[] allergies = {"pollen", "mold", "bs"};
	private String[] appetites = {"big", "heavy", "small", "none"};
	private String[] gis = {"stomach", "didi", "poopy", "pants"};
	private String[] genders = {"male", "female"};
	private String[] languages = {"english", "spanish"};
	private String[] races = {"black", "asian"};
	private String[] ethnicities = {"non-hispanic", "jewish"};
	private String[] pastMedicalHistories = {"smoking", "cancer", "gullBladder", "high blood pressure"};
	private String[] pneumococcalVaccines = {"yes", "no", "maybe so"};
	private String[] familyHistories = {"mom fat", "dad fat", "sister fat", "brother fat", "granddaddy fat"};
	private String[] fallRiskAssessments = {"yes", "no", "maybe so"};
	private String[] socialHistories = {"no smoke", "heavy smoker", "light smoker"};
	private String[] musculoskeletals = {"stand", "no stand", "sit", "weak"};
	private String[] beds = {"cama1", "cama2", "cama3"};
	private String[] chairs = {"seat1", "seat2", "seat3", "seat4"};
	private String[] feet = {"foot1", "foot2", "foot3", "foot4"};
	private String[] anticoagulants = {"roota", "toota", "fruta", "luda!"};
	private String[] suppliments = {"vit A", "vit B", "oh say", "can you see"};
	
	private void populateDBwithRelevantDropdownValues()
	{
		for(String suppliment : suppliments)
		{
			supplimentDao.insertSupplment(new Supplment(suppliment));
		}
		
		for(String allergy : allergies)
		{
			allergyDao.insertAllergy(new Allergy(allergy));
		}
		
		for(String appetite : appetites)
		{
			appetiteDao.insertAppetite(new Appetite(appetite));
		}
		
		for(String gi : gis)
		{
			gastroIntestinalDao.insertGastroIntestinal(new GastroIntestinal(gi));
		}
		
		for(String gender : genders)
		{
			genderDao.insertGender(new Gender(gender));
		}
		
		for(String language : languages)
		{
			languageDao.insertLanguage(new Language(language));
		}
		
		for(String race : races)
		{
			raceDao.insertRace(new Race(race));
		}
		
		for(String ethnicity : ethnicities)
		{
			ethnicityDao.insertEthnicity(new Ethnicity(ethnicity));
		}
		
		for(String pastMedicalHistory : pastMedicalHistories)
		{
			pastMedicalHistoryDao.insertPastMedicalHistory(new PastMedicalHistory(pastMedicalHistory));
		}
		
		for(String vaccine : pneumococcalVaccines)
		{
			pneumococcalVaccineDao.insertPneumococcalVaccine(new PneumococcalVaccine(vaccine));
		}
		
		for(String history : familyHistories)
		{
			familyHistoryDao.insertFamilyHistory(new FamilyHistory(history));
		}
		
		for(String riskAssess : fallRiskAssessments)
		{
			fallRiskAssessmentDao.insertFallRiskAssessment(new FallRiskAssessment(riskAssess));
		}
		
		for(String history : socialHistories)
		{
			socialHistoryDao.insertSocialHistory(new SocialHistory(history));
		}
		
		for(String musco : musculoskeletals)
		{
			musculoskeletalDao.insertMusculoskeletal(new Musculoskeletal(musco));
		}
		
		for(String bed : beds)
		{
			bedDao.insertBed(new Bed(bed));
		}
		
		for(String chair : chairs)
		{
			chairDao.insertChair(new Chair(chair));
		}
		
		for(String foot : feet)
		{
			feetDao.insertFeet(new Feet(foot));
		}
		
		for(String anticoag : anticoagulants)
		{
			anticoagulantDao.insertAnticoagulant(new Anticoagulant(anticoag));
		}
	}
	
}
