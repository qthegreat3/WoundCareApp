package com.harquin.common.followuprange;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FollowUpRangeDao implements IFollowUpRangeDao{
	private static final Logger log = LoggerFactory.getLogger(FollowUpRangeDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public FollowUpRangeDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertFollowUpRange(FollowUpRange FollowUpRange) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			FollowUpRangeMapper mapper = session.getMapper(FollowUpRangeMapper.class);
			mapper.insertFollowUpRange(FollowUpRange);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertFollowUpRange function of FollowUpRangeDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<FollowUpRange> getFollowUpRanges() {
		List<FollowUpRange> followUpRangeList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FollowUpRangeMapper mapper = session.getMapper(FollowUpRangeMapper.class);			
			followUpRangeList = mapper.getFollowUpRanges();
		}
		catch (Exception e)
		{
			log.error("Exception found in getFollowUpRanges in FollowUpRangeDao", e);
		}

		return followUpRangeList;
	}

	@Override
	public boolean deleteFollowUpRange(FollowUpRange followUpRange) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FollowUpRangeMapper mapper = session.getMapper(FollowUpRangeMapper.class);
			mapper.deleteFollowUpRange(followUpRange);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteFollowUpRange in FollowUpRangeDao", e);
			return false;
		}
		
		return true;
	}

}
