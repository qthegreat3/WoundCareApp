package com.harquin.common.familyhistory;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FamilyHistoryDao implements IFamilyHistoryDao{
	private static final Logger log = LoggerFactory.getLogger(FamilyHistoryDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public FamilyHistoryDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertFamilyHistory(FamilyHistory FamilyHistory) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			FamilyHistoryMapper mapper = session.getMapper(FamilyHistoryMapper.class);
			mapper.insertFamilyHistory(FamilyHistory);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertFamilyHistory function of FamilyHistoryDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<FamilyHistory> getFamilyHistorys() {
		List<FamilyHistory> familyHistoryList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FamilyHistoryMapper mapper = session.getMapper(FamilyHistoryMapper.class);			
			familyHistoryList = mapper.getFamilyHistorys();
		}
		catch (Exception e)
		{
			log.error("Exception found in getFamilyHistorys in FamilyHistoryDao", e);
		}

		return familyHistoryList;
	}

	@Override
	public boolean deleteFamilyHistory(FamilyHistory familyHistory) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FamilyHistoryMapper mapper = session.getMapper(FamilyHistoryMapper.class);
			mapper.deleteFamilyHistory(familyHistory);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteFamilyHistory in FamilyHistoryDao", e);
			return false;
		}
		
		return true;
	}

}
