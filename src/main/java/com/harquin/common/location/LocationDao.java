package com.harquin.common.location;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LocationDao implements ILocationDao {
	private static final Logger log = LoggerFactory.getLogger(LocationDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public LocationDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertLocation(Location location) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			LocationMapper mapper = session.getMapper(LocationMapper.class);
			mapper.insertLocation(location);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertLocation function of LocationDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Location> getLocations() {
		List<Location> locationList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			LocationMapper mapper = session.getMapper(LocationMapper.class);			
			locationList = mapper.getLocations();
		}
		catch (Exception e)
		{
			log.error("Exception found in getLocations in LocationDao", e);
		}

		return locationList;
	}

	@Override
	public boolean deleteLocation(Location location) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			LocationMapper mapper = session.getMapper(LocationMapper.class);
			mapper.deleteLocation(location);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteLocation in LocationDao", e);
			return false;
		}
		
		return true;
	}

}
