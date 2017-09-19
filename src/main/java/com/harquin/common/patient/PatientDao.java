package com.harquin.common.patient;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.harquin.common.location.Location;


public class PatientDao implements IPatientDao {

	private static final Logger log = LoggerFactory.getLogger(PatientDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public PatientDao(SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public List<Patient> getPatientsByLocation(Location location) {
		
		if(location == null)
		{
			throw new IllegalArgumentException("Location is null");
		}
		
		List<Patient> patientList = new ArrayList<>();
		
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			PatientMapper mapper = session.getMapper(PatientMapper.class);
			patientList = mapper.getPatientByLocation(location);
		}
		catch (Exception e)
		{
			log.error("Exception Found in getPatientsByLocation function of PatientDao", e);
		}
		
		return patientList;
	}

	@Override
	public Patient getPatientById(int id) {
		
		Patient patient = null;
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PatientMapper mapper = session.getMapper(PatientMapper.class);
			patient = mapper.getPatientById(id); 
		}
		catch (Exception e)
		{
			log.error("Exception Found in getPatientById function of PatientDao", e);
		}
				
		return patient;
	}

	@Override
	public void updatePatient(Patient patient) {
		
		validatePatient(patient);
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PatientMapper mapper = session.getMapper(PatientMapper.class);
			mapper.updatePatient(patient); 
		}
		catch (Exception e)
		{
			log.error("Exception Found in updatePatient function of PatientDao", e);
		}
	}

	@Override
	public void insertPatient(Patient patient) {
		
		validatePatient(patient);
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PatientMapper mapper = session.getMapper(PatientMapper.class);
			mapper.insertPatient(patient); 
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertPatient function of PatientDao", e);
		}		
	}

	@Override
	public void deletePatient(Patient patient) {
		
		validatePatient(patient);
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PatientMapper mapper = session.getMapper(PatientMapper.class);
			mapper.deletePatient(patient); 
		}
		catch (Exception e)
		{
			log.error("Exception Found in deletePatient function of PatientDao", e);
		}
	}

	private void validatePatient(Patient patient) {
		if(patient == null)
		{
			throw new IllegalArgumentException("Patient can not be null");
		}
	}
	
}
