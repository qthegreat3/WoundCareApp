package com.harquin.common.periwound;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PeriwoundDao implements IPeriwoundDao{
	private static final Logger log = LoggerFactory.getLogger(PeriwoundDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public PeriwoundDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertPeriwound(Periwound Periwound) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			PeriwoundMapper mapper = session.getMapper(PeriwoundMapper.class);
			mapper.insertPeriwound(Periwound);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertPeriwound function of PeriwoundDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Periwound> getPeriwounds() {
		List<Periwound> periwoundList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PeriwoundMapper mapper = session.getMapper(PeriwoundMapper.class);			
			periwoundList = mapper.getPeriwounds();
		}
		catch (Exception e)
		{
			log.error("Exception found in getPeriwounds in PeriwoundDao", e);
		}

		return periwoundList;
	}

	@Override
	public boolean deletePeriwound(Periwound periwound) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PeriwoundMapper mapper = session.getMapper(PeriwoundMapper.class);
			mapper.deletePeriwound(periwound);
		}
		catch (Exception e)
		{
			log.error("Exception found in deletePeriwound in PeriwoundDao", e);
			return false;
		}
		
		return true;
	}

}
