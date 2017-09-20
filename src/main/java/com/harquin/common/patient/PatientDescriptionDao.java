package com.harquin.common.patient;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertPatientDescription(PatientDescription patientDescription) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePatientDecription(PatientDescription patientDescription) {
		// TODO Auto-generated method stub
		return false;
	}

}
