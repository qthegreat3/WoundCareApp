package com.harquin.common.sourceofhistory;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SourceOfHistoryDao implements ISourceOfHistoryDao{
	private static final Logger log = LoggerFactory.getLogger(SourceOfHistoryDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public SourceOfHistoryDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertSourceOfHistory(SourceOfHistory SourceOfHistory) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			SourceOfHistoryMapper mapper = session.getMapper(SourceOfHistoryMapper.class);
			mapper.insertSourceOfHistory(SourceOfHistory);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertSourceOfHistory function of SourceOfHistoryDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<SourceOfHistory> getSourceOfHistorys() {
		List<SourceOfHistory> sourceOfHistoryList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			SourceOfHistoryMapper mapper = session.getMapper(SourceOfHistoryMapper.class);			
			sourceOfHistoryList = mapper.getSourceOfHistorys();
		}
		catch (Exception e)
		{
			log.error("Exception found in getSourceOfHistorys in SourceOfHistoryDao", e);
		}

		return sourceOfHistoryList;
	}

	@Override
	public boolean deleteSourceOfHistory(SourceOfHistory sourceOfHistory) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			SourceOfHistoryMapper mapper = session.getMapper(SourceOfHistoryMapper.class);
			mapper.deleteSourceOfHistory(sourceOfHistory);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteSourceOfHistory in SourceOfHistoryDao", e);
			return false;
		}
		
		return true;
	}

}
