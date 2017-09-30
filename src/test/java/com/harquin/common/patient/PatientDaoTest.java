package com.harquin.common.patient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

import com.harquin.common.location.ILocationDao;
import com.harquin.common.location.Location;
import com.harquin.config.TestAppConfig;

@ContextConfiguration(classes = {TestAppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class PatientDaoTest {
	@Autowired
	IPatientDao patientDao;

	@Autowired
	ILocationDao locationDao;
	
	@Test
	public void crudTest() throws ParseException
	{
		String firstName = "First";
		String lastName = "Test";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		Date followUpDate = new Date();
		
		String lastVisitDateString = "2017-11-12";
		Date lastVisitDate = sdf.parse(lastVisitDateString);
		boolean isActive = true;
		
		Patient patient = new Patient(firstName, lastName);
		patient.setActive(isActive);
		patient.setFollowUpVisitDate(followUpDate);
		patient.setLastVisitDate(lastVisitDate);
		
		String locationName = "Urbana";
		Location location = new Location(locationName);
		
		List<Location> locationList = locationDao.getLocations();
		
		boolean isLocationinList = false;
		
		for(Location loc : locationList)
		{
			if(loc.getName().equals(location.getName()))
			{
				isLocationinList = true;
				break;
			}
		}
		
		if(!isLocationinList)
		{
			locationDao.insertLocation(location);
		}
		
		patient.setLocation(location.getName());
		patientDao.insertPatient(patient);
		
		Patient dbPatient = patientDao.getPatientById(patient.getId());
		assertTrue(patient.getId() == dbPatient.getId());
		assertTrue(dbPatient.getFirstName().equals(firstName));
		assertTrue(dbPatient.getLastName().equals(lastName));
		assertTrue(areTheseDatesEqual(dbPatient.getFollowUpVisitDate(), followUpDate));
		assertTrue(areTheseDatesEqual(dbPatient.getLastVisitDate(), lastVisitDate));
		assertTrue(dbPatient.isActive() == isActive);
		assertTrue(dbPatient.getLocation().equals(location.getName()));
		
		String newLocationName = "Champagne"; 
		
		location.setName(newLocationName);
		
		for(Location loc : locationList)
		{
			if(loc.getName().equals(location.getName()))
			{
				isLocationinList = true;
				break;
			}
		}
		
		if(!isLocationinList)
		{
			locationDao.insertLocation(location);
		}
				
		patient.setLocation(location.getName());
		
		boolean newIsActive = false;
		
		patient.setActive(newIsActive);
		
		String newFirstName = "NewName"; 
		patient.setFirstName(newFirstName);
		
		String newLastName = "NewLastName";		
		patient.setLastName(newLastName);
		
		String newLastVisitDateString = "2017-08-12";
		Date newLastVisitDate = sdf.parse(newLastVisitDateString);
		
		patient.setLastVisitDate(newLastVisitDate);
		
		Date newFollowUpDate = new Date();
		patient.setFollowUpVisitDate(newFollowUpDate);
		
		patientDao.updatePatient(patient);
		dbPatient = patientDao.getPatientById(patient.getId());
		
		assertTrue(patient.getId() == dbPatient.getId());
		assertTrue(dbPatient.getFirstName().equals(newFirstName));
		assertTrue(dbPatient.getLastName().equals(newLastName));
		assertTrue(areTheseDatesEqual(dbPatient.getFollowUpVisitDate(), newFollowUpDate));
		assertTrue(areTheseDatesEqual(dbPatient.getLastVisitDate(), newLastVisitDate));
		assertTrue(dbPatient.isActive() == newIsActive);
		assertTrue(dbPatient.getLocation().equals(location.getName()));
		
		patientDao.deletePatient(patient);
		dbPatient = patientDao.getPatientById(patient.getId());
		
		assertTrue(dbPatient == null);
	}
	
	@Test
	public void getPatientsByLocationTest()
	{
		Location location = new Location("Crazy");
		locationDao.insertLocation(location);
				
		List<Patient> patientList = patientDao.getPatientsByLocation(location);
		
		assertTrue(patientList.isEmpty());
		
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
		patientList = patientDao.getPatientsByLocation(location);
		
		assertTrue(patientList.size() == 1);
		
		Patient dbPatient = patientList.get(0);
		
		assertTrue(dbPatient.getId() == patient.getId());
		assertTrue(dbPatient.getFirstName().equals(firstName));
		assertTrue(dbPatient.getLastName().equals(lastName));
		assertTrue(areTheseDatesEqual(lastVistDate, dbPatient.getLastVisitDate()));
		assertTrue(areTheseDatesEqual(followUpVisitDate, dbPatient.getFollowUpVisitDate()));
		assertTrue(dbPatient.getLocation().equals(location.getName()));
		assertTrue(dbPatient.isActive() == isActive);
		
		patientDao.deletePatient(dbPatient);
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
}
