package com.harquin.common.exudate;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExudateDao implements IExudateDao{
	private static final Logger log = LoggerFactory.getLogger(ExudateDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public ExudateDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertExudate(Exudate Exudate) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			ExudateMapper mapper = session.getMapper(ExudateMapper.class);
			mapper.insertExudate(Exudate);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertExudate function of ExudateDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Exudate> getExudates() {
		List<Exudate> exudateList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			ExudateMapper mapper = session.getMapper(ExudateMapper.class);			
			exudateList = mapper.getExudates();
		}
		catch (Exception e)
		{
			log.error("Exception found in getExudates in ExudateDao", e);
		}

		return exudateList;
	}

	@Override
	public boolean deleteExudate(Exudate exudate) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			ExudateMapper mapper = session.getMapper(ExudateMapper.class);
			mapper.deleteExudate(exudate);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteExudate in ExudateDao", e);
			return false;
		}
		
		return true;
	}

}
