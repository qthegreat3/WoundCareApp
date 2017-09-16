package com.harquin.common.pastmedicalhistory;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PastMedicalHistoryDao implements IPastMedicalHistoryDao{
	private static final Logger log = LoggerFactory.getLogger(PastMedicalHistoryDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public PastMedicalHistoryDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertPastMedicalHistory(PastMedicalHistory PastMedicalHistory) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			PastMedicalHistoryMapper mapper = session.getMapper(PastMedicalHistoryMapper.class);
			mapper.insertPastMedicalHistory(PastMedicalHistory);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertPastMedicalHistory function of PastMedicalHistoryDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<PastMedicalHistory> getPastMedicalHistorys() {
		List<PastMedicalHistory> pastMedicalHistoryList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PastMedicalHistoryMapper mapper = session.getMapper(PastMedicalHistoryMapper.class);			
			pastMedicalHistoryList = mapper.getPastMedicalHistorys();
		}
		catch (Exception e)
		{
			log.error("Exception found in getPastMedicalHistorys in PastMedicalHistoryDao", e);
		}

		return pastMedicalHistoryList;
	}

	@Override
	public boolean deletePastMedicalHistory(PastMedicalHistory pastMedicalHistory) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PastMedicalHistoryMapper mapper = session.getMapper(PastMedicalHistoryMapper.class);
			mapper.deletePastMedicalHistory(pastMedicalHistory);
		}
		catch (Exception e)
		{
			log.error("Exception found in deletePastMedicalHistory in PastMedicalHistoryDao", e);
			return false;
		}
		
		return true;
	}

}
