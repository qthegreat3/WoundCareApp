package com.harquin.common.orientation;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrientationDao implements IOrientationDao{
	private static final Logger log = LoggerFactory.getLogger(OrientationDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public OrientationDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertOrientation(Orientation Orientation) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			OrientationMapper mapper = session.getMapper(OrientationMapper.class);
			mapper.insertOrientation(Orientation);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertOrientation function of OrientationDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Orientation> getOrientations() {
		List<Orientation> orientationList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			OrientationMapper mapper = session.getMapper(OrientationMapper.class);			
			orientationList = mapper.getOrientations();
		}
		catch (Exception e)
		{
			log.error("Exception found in getOrientations in OrientationDao", e);
		}

		return orientationList;
	}

	@Override
	public boolean deleteOrientation(Orientation orientation) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			OrientationMapper mapper = session.getMapper(OrientationMapper.class);
			mapper.deleteOrientation(orientation);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteOrientation in OrientationDao", e);
			return false;
		}
		
		return true;
	}

}
