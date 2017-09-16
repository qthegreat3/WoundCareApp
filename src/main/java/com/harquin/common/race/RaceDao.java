package com.harquin.common.race;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RaceDao implements IRaceDao{
	private static final Logger log = LoggerFactory.getLogger(RaceDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public RaceDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertRace(Race Race) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			RaceMapper mapper = session.getMapper(RaceMapper.class);
			mapper.insertRace(Race);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertRace function of RaceDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Race> getRaces() {
		List<Race> raceList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			RaceMapper mapper = session.getMapper(RaceMapper.class);			
			raceList = mapper.getRaces();
		}
		catch (Exception e)
		{
			log.error("Exception found in getRaces in RaceDao", e);
		}

		return raceList;
	}

	@Override
	public boolean deleteRace(Race race) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			RaceMapper mapper = session.getMapper(RaceMapper.class);
			mapper.deleteRace(race);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteRace in RaceDao", e);
			return false;
		}
		
		return true;
	}

}
