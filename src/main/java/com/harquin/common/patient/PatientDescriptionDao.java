package com.harquin.common.patient;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PatientDescriptionDao implements IPatientDescriptionDao {

	private static final Logger log = LoggerFactory.getLogger(PatientDescriptionDaoTest.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public PatientDescriptionDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public PatientDescription getPatientDescriptionById(int patientId) {
		PatientDescription patientDescription = null;
		
		try(SqlSession sqlSession = sqlSessionFactory.openSession();)
		{
			PatientDescriptionMapper mapper = sqlSession.getMapper(PatientDescriptionMapper.class);
			
			patientDescription = mapper.getPatientDescriptionById(patientId);
		}
		catch (Exception e)
		{
			log.error("Exception in PatientDescriptionDao in getPatientDescriptionById function", e);
		}
		
		return patientDescription;
	}

	@Override
	public boolean updatePatientDescription(PatientDescription patientDescription) {
		
		if(patientDescription == null)
		{
			throw new IllegalArgumentException("Patient Description Cannot Be Null");
		}
		
		try
		{
			deleteJointPatientTables(sqlSessionFactory, patientDescription.getPatientId());
		}
		catch (Exception e)
		{
			log.error("Exception in deleteJointPatientTables in PatientDescriptionDao", e);
			return false;
		}
		
		try(SqlSession sqlSession = sqlSessionFactory.openSession();)
		{
			PatientDescriptionMapper mapper = sqlSession.getMapper(PatientDescriptionMapper.class);
			mapper.updatePatientInfo(patientDescription);
			mapper.insertPatientAllergies(patientDescription.getAllergies(), patientDescription.getPatientId());
			mapper.insertPatientAnticoagulants(patientDescription.getAnticoagulants(), patientDescription.getPatientId());
			mapper.insertPatientChairs(patientDescription.getChair(), patientDescription.getPatientId());
			mapper.insertPatientFamilyHistory(patientDescription.getFamilyHistory(), patientDescription.getPatientId());
			mapper.insertPatientFeet(patientDescription.getFeet(), patientDescription.getPatientId());
			mapper.insertPatientGastroIntestinals(patientDescription.getGastroIntestinal(), patientDescription.getPatientId());
			mapper.insertPatientMusculoskeletal(patientDescription.getMuscoloskeletal(), patientDescription.getPatientId());
			mapper.insertPatientPastMedicalHistory(patientDescription.getPastMedicalhistory(), patientDescription.getPatientId());
			mapper.insertPatientSupplements(patientDescription.getSuppliments(), patientDescription.getPatientId());			
		}
		catch (Exception e)
		{
			log.error("Exception in updatePatientDescription", e);
			return false;
		}
		
		return true;
	}

	@Override
	public boolean insertPatientDescription(PatientDescription patientDescription) {
		
		if(patientDescription == null)
		{
			throw new IllegalArgumentException("Patient Description Cannot Be Null");
		}
		
		try
		{
			deleteJointPatientTables(sqlSessionFactory, patientDescription.getPatientId());
		}
		catch (Exception e)
		{
			log.error("Exception in deleteJointPatientTables in PatientDescriptionDao", e);
			return false;
		}
		
		try(SqlSession sqlSession = sqlSessionFactory.openSession();)
		{
			PatientDescriptionMapper mapper = sqlSession.getMapper(PatientDescriptionMapper.class);

			mapper.updatePatientInfo(patientDescription);
			
			mapper.insertPatientAllergies(patientDescription.getAllergies(), patientDescription.getPatientId());
			mapper.insertPatientAnticoagulants(patientDescription.getAnticoagulants(), patientDescription.getPatientId());
			mapper.insertPatientChairs(patientDescription.getChair(), patientDescription.getPatientId());
			mapper.insertPatientFamilyHistory(patientDescription.getFamilyHistory(), patientDescription.getPatientId());
			mapper.insertPatientFeet(patientDescription.getFeet(), patientDescription.getPatientId());
			mapper.insertPatientGastroIntestinals(patientDescription.getGastroIntestinal(), patientDescription.getPatientId());
			mapper.insertPatientMusculoskeletal(patientDescription.getMuscoloskeletal(), patientDescription.getPatientId());
			mapper.insertPatientPastMedicalHistory(patientDescription.getPastMedicalhistory(), patientDescription.getPatientId());
			mapper.insertPatientSupplements(patientDescription.getSuppliments(), patientDescription.getPatientId());			
		}
		catch (Exception e)
		{
			log.error("Exception in insertPatientDescription", e);
			return false;
		}
		
		return true;
	}

	protected static void deleteJointPatientTables(SqlSessionFactory sqlSessionFactory , int patientId) throws Exception
	{
		try(SqlSession sqlSession = sqlSessionFactory.openSession();)
		{
			PatientDescriptionMapper mapper = sqlSession.getMapper(PatientDescriptionMapper.class);
			
			mapper.deletePatientAllergies(patientId);
			mapper.deletePatientAnticoagulants(patientId);
			mapper.deletePatientChairs(patientId);
			mapper.deletePatientFamilyHistory(patientId);
			mapper.deletePatientFeet(patientId);
			mapper.deletePatientGastroIntestinals(patientId);
			mapper.deletePatientMusculoskeletal(patientId);
			mapper.deletePatientPastMedicalHistory(patientId);
			mapper.deletePatientSupplements(patientId);
		}			
	}
	
	@Override
	public boolean deletePatientDecription(PatientDescription patientDescription) {
		
		if(patientDescription == null)
		{
			throw new IllegalArgumentException("Patient Description Cannot Be Null");
		}
		
		PatientDescription nullDescription = new PatientDescription();
		
		nullDescription.setFirstName(patientDescription.getFirstName());
		nullDescription.setLastName(patientDescription.getLastName());
		nullDescription.setPatientId(patientDescription.getPatientId());
		
		try(SqlSession sqlSession = sqlSessionFactory.openSession();)
		{
			PatientDescriptionMapper mapper = sqlSession.getMapper(PatientDescriptionMapper.class);
			
			mapper.updatePatientInfo(nullDescription);
		}
		catch (Exception e)
		{
			log.error("Exception in deletePatientDecription", e);
			return false;
		}
		
		try
		{
			deleteJointPatientTables(sqlSessionFactory, nullDescription.getPatientId());
		}
		catch (Exception e)
		{
			log.error("Exception in deleteJointPatientTables in PatientDescriptionDao", e);
			return false;
		}
		
		return true;
	}

}
