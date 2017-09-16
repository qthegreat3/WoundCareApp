package com.harquin.common.feet;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeetDao implements IFeetDao {
private static final Logger log = LoggerFactory.getLogger(FeetDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public FeetDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	

	@Override
	public boolean insertFeet(Feet feet) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			FeetMapper mapper = session.getMapper(FeetMapper.class);
			mapper.insertFeet(feet);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertFeet function of FeetDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Feet> getFeets() {
		List<Feet> feetList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FeetMapper mapper = session.getMapper(FeetMapper.class);			
			feetList = mapper.getFeets();
		}
		catch (Exception e)
		{
			log.error("Exception found in getFeets in FeetDao", e);
		}

		return feetList;
	}

	@Override
	public boolean deleteFeet(Feet feet) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FeetMapper mapper = session.getMapper(FeetMapper.class);
			mapper.deleteFeet(feet);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteFeet in FeetDao", e);
			return false;
		}
		
		return true;
	}
}
