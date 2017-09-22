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
		
		try(SqlSession sqlSession = sqlSessionFactory.openSession();)
		{
			PatientDescriptionMapper mapper = sqlSession.getMapper(PatientDescriptionMapper.class);

			mapper.updatePatientInfo(patientDescription);
			
			mapper.deletePatientAllergies(patientDescription.getPatientId());
			mapper.deletePatientAnticoagulants(patientDescription.getPatientId());
			mapper.deletePatientChairs(patientDescription.getPatientId());
			mapper.deletePatientFamilyHistory(patientDescription.getPatientId());
			mapper.deletePatientFeet(patientDescription.getPatientId());
			mapper.deletePatientGastroIntestinals(patientDescription.getPatientId());
			mapper.deletePatientMusculoskeletal(patientDescription.getPatientId());
			mapper.deletePatientPastMedicalHistory(patientDescription.getPatientId());
			mapper.deletePatientSupplements(patientDescription.getPatientId());
			
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

	@Override
	public boolean deletePatientDecription(PatientDescription patientDescription) {
		
		if(patientDescription == null)
		{
			throw new IllegalArgumentException("Patient Description Cannot Be Null");
		}
		
		PatientDescription nullDescription = new PatientDescription();
		
		nullDescription.setPatientId(patientDescription.getPatientId());
		
		try(SqlSession sqlSession = sqlSessionFactory.openSession();)
		{
			PatientDescriptionMapper mapper = sqlSession.getMapper(PatientDescriptionMapper.class);
			
			mapper.updatePatientInfo(nullDescription);
			
			mapper.deletePatientAllergies(nullDescription.getPatientId());
			mapper.deletePatientAnticoagulants(nullDescription.getPatientId());
			mapper.deletePatientChairs(nullDescription.getPatientId());
			mapper.deletePatientFamilyHistory(nullDescription.getPatientId());
			mapper.deletePatientFeet(nullDescription.getPatientId());
			mapper.deletePatientGastroIntestinals(nullDescription.getPatientId());
			mapper.deletePatientMusculoskeletal(nullDescription.getPatientId());
			mapper.deletePatientPastMedicalHistory(nullDescription.getPatientId());
			mapper.deletePatientSupplements(nullDescription.getPatientId());
		}
		catch (Exception e)
		{
			log.error("Exception in deletePatientDecription", e);
			return false;
		}
		
		return true;
	}

}
