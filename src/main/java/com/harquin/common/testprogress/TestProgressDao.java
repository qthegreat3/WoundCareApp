package com.harquin.common.testprogress;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestProgressDao implements ITestProgressDao{
	private static final Logger log = LoggerFactory.getLogger(TestProgressDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public TestProgressDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertTestProgress(TestProgress TestProgress) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			TestProgressMapper mapper = session.getMapper(TestProgressMapper.class);
			mapper.insertTestProgress(TestProgress);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertTestProgress function of TestProgressDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<TestProgress> getTestProgresss() {
		List<TestProgress> testProgressList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			TestProgressMapper mapper = session.getMapper(TestProgressMapper.class);			
			testProgressList = mapper.getTestProgresss();
		}
		catch (Exception e)
		{
			log.error("Exception found in getTestProgresss in TestProgressDao", e);
		}

		return testProgressList;
	}

	@Override
	public boolean deleteTestProgress(TestProgress testProgress) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			TestProgressMapper mapper = session.getMapper(TestProgressMapper.class);
			mapper.deleteTestProgress(testProgress);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteTestProgress in TestProgressDao", e);
			return false;
		}
		
		return true;
	}

}
