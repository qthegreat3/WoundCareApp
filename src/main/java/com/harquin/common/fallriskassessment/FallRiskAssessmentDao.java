package com.harquin.common.fallriskassessment;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FallRiskAssessmentDao implements IFallRiskAssessmentDao{
	private static final Logger log = LoggerFactory.getLogger(FallRiskAssessmentDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public FallRiskAssessmentDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertFallRiskAssessment(FallRiskAssessment FallRiskAssessment) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			FallRiskAssessmentMapper mapper = session.getMapper(FallRiskAssessmentMapper.class);
			mapper.insertFallRiskAssessment(FallRiskAssessment);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertFallRiskAssessment function of FallRiskAssessmentDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<FallRiskAssessment> getFallRiskAssessments() {
		List<FallRiskAssessment> fallRiskAssessmentList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FallRiskAssessmentMapper mapper = session.getMapper(FallRiskAssessmentMapper.class);			
			fallRiskAssessmentList = mapper.getFallRiskAssessments();
		}
		catch (Exception e)
		{
			log.error("Exception found in getFallRiskAssessments in FallRiskAssessmentDao", e);
		}

		return fallRiskAssessmentList;
	}

	@Override
	public boolean deleteFallRiskAssessment(FallRiskAssessment fallRiskAssessment) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FallRiskAssessmentMapper mapper = session.getMapper(FallRiskAssessmentMapper.class);
			mapper.deleteFallRiskAssessment(fallRiskAssessment);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteFallRiskAssessment in FallRiskAssessmentDao", e);
			return false;
		}
		
		return true;
	}

}
