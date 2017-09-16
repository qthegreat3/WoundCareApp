package com.harquin.common.discussedwith;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscussedWithDao implements IDiscussedWithDao {
	private static final Logger log = LoggerFactory.getLogger(DiscussedWithDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public DiscussedWithDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertDiscussedWith(DiscussedWith discussedWith) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			DiscussedWithMapper mapper = session.getMapper(DiscussedWithMapper.class);
			mapper.insertDiscussedWith(discussedWith);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertDiscussedWith function of DiscussedWithDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<DiscussedWith> getDiscussedWiths() {
		List<DiscussedWith> discussedWithList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			DiscussedWithMapper mapper = session.getMapper(DiscussedWithMapper.class);			
			discussedWithList = mapper.getDiscussedWiths();
		}
		catch (Exception e)
		{
			log.error("Exception found in getDiscussedWiths in DiscussedWithDao", e);
		}

		return discussedWithList;
	}

	@Override
	public boolean deleteDiscussedWith(DiscussedWith discussedWith) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			DiscussedWithMapper mapper = session.getMapper(DiscussedWithMapper.class);
			mapper.deleteDiscussedWith(discussedWith);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteDiscussedWith in DiscussedWithDao", e);
			return false;
		}
		
		return true;
	}
}
