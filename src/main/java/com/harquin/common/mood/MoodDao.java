package com.harquin.common.mood;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoodDao implements IMoodDao{
	private static final Logger log = LoggerFactory.getLogger(MoodDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public MoodDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertMood(Mood Mood) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			MoodMapper mapper = session.getMapper(MoodMapper.class);
			mapper.insertMood(Mood);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertMood function of MoodDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Mood> getMoods() {
		List<Mood> moodList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			MoodMapper mapper = session.getMapper(MoodMapper.class);			
			moodList = mapper.getMoods();
		}
		catch (Exception e)
		{
			log.error("Exception found in getMoods in MoodDao", e);
		}

		return moodList;
	}

	@Override
	public boolean deleteMood(Mood mood) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			MoodMapper mapper = session.getMapper(MoodMapper.class);
			mapper.deleteMood(mood);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteMood in MoodDao", e);
			return false;
		}
		
		return true;
	}

}
