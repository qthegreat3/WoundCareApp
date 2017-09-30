package com.harquin.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harquin.common.location.Location;
import com.harquin.common.patient.Patient;

@RestController
public class PatientController {

	private static final Logger log = LoggerFactory.getLogger(PatientController.class);
	
	@RequestMapping(value="/patient", method=RequestMethod.GET)
	public ResponseEntity<?> getPatientByLocation(@RequestParam String location)
	{
		if(location == null)
		{
			return new ResponseEntity<>("Location parameter cannot be null" , HttpStatus.PARTIAL_CONTENT);
		}
		
		Location searchLocation = new Location(location);
		
		PatientService service = new PatientService();
		
		List<Patient> patientList = service.getPatientsByLocation(searchLocation);
		
		if(patientList == null)
		{
			return new ResponseEntity<>("List is null", HttpStatus.BAD_REQUEST);
		}
		
		if(patientList.isEmpty())
		{
			return new ResponseEntity<>("List is empty", HttpStatus.BAD_GATEWAY);
		}
		
		return new ResponseEntity<>(patientList , HttpStatus.OK);
	}
}
