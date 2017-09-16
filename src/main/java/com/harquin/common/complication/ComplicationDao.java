package com.harquin.common.complication;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComplicationDao implements IComplicationDao {
private static final Logger log = LoggerFactory.getLogger(ComplicationDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public ComplicationDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertComplication(Complication complication) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			ComplicationMapper mapper = session.getMapper(ComplicationMapper.class);
			mapper.insertComplication(complication);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertComplication function of ComplicationDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Complication> getComplications() {
		List<Complication> complicationList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			ComplicationMapper mapper = session.getMapper(ComplicationMapper.class);			
			complicationList = mapper.getComplications();
		}
		catch (Exception e)
		{
			log.error("Exception found in getComplications in ComplicationDao", e);
		}

		return complicationList;
	}

	@Override
	public boolean deleteComplication(Complication complication) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			ComplicationMapper mapper = session.getMapper(ComplicationMapper.class);
			mapper.deleteComplication(complication);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteComplication in ComplicationDao", e);
			return false;
		}
		
		return true;
	}
}
