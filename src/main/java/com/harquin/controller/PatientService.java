package com.harquin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.harquin.common.location.Location;
import com.harquin.common.patient.IPatientDao;
import com.harquin.common.patient.Patient;

public class PatientService {

	private static Logger log = LoggerFactory.getLogger(PatientService.class);
	
	@Autowired
	private IPatientDao patientDao;
	
	public List<Patient> getPatientsByLocation(Location location)
	{
		return patientDao.getPatientsByLocation(location);
	}
}
