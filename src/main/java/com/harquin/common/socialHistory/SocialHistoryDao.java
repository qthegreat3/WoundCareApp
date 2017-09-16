package com.harquin.common.socialHistory;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SocialHistoryDao implements ISocialHistoryDao{
	private static final Logger log = LoggerFactory.getLogger(SocialHistoryDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public SocialHistoryDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertSocialHistory(SocialHistory SocialHistory) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			SocialHistoryMapper mapper = session.getMapper(SocialHistoryMapper.class);
			mapper.insertSocialHistory(SocialHistory);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertSocialHistory function of SocialHistoryDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<SocialHistory> getSocialHistorys() {
		List<SocialHistory> socialHistoryList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			SocialHistoryMapper mapper = session.getMapper(SocialHistoryMapper.class);			
			socialHistoryList = mapper.getSocialHistorys();
		}
		catch (Exception e)
		{
			log.error("Exception found in getSocialHistorys in SocialHistoryDao", e);
		}

		return socialHistoryList;
	}

	@Override
	public boolean deleteSocialHistory(SocialHistory socialHistory) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			SocialHistoryMapper mapper = session.getMapper(SocialHistoryMapper.class);
			mapper.deleteSocialHistory(socialHistory);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteSocialHistory in SocialHistoryDao", e);
			return false;
		}
		
		return true;
	}

}
