package com.harquin.common.foottemperature;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FootTemperatureDao implements IFootTemperatureDao{
	private static final Logger log = LoggerFactory.getLogger(FootTemperatureDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public FootTemperatureDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertFootTemperature(FootTemperature FootTemperature) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			FootTemperatureMapper mapper = session.getMapper(FootTemperatureMapper.class);
			mapper.insertFootTemperature(FootTemperature);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertFootTemperature function of FootTemperatureDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<FootTemperature> getFootTemperatures() {
		List<FootTemperature> footTemperatureList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FootTemperatureMapper mapper = session.getMapper(FootTemperatureMapper.class);			
			footTemperatureList = mapper.getFootTemperatures();
		}
		catch (Exception e)
		{
			log.error("Exception found in getFootTemperatures in FootTemperatureDao", e);
		}

		return footTemperatureList;
	}

	@Override
	public boolean deleteFootTemperature(FootTemperature footTemperature) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FootTemperatureMapper mapper = session.getMapper(FootTemperatureMapper.class);
			mapper.deleteFootTemperature(footTemperature);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteFootTemperature in FootTemperatureDao", e);
			return false;
		}
		
		return true;
	}

}
