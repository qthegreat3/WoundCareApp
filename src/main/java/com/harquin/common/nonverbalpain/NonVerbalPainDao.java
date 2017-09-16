package com.harquin.common.nonverbalpain;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NonVerbalPainDao implements INonVerbalPainDao{
	private static final Logger log = LoggerFactory.getLogger(NonVerbalPainDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public NonVerbalPainDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertNonVerbalPain(NonVerbalPain NonVerbalPain) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			NonVerbalPainMapper mapper = session.getMapper(NonVerbalPainMapper.class);
			mapper.insertNonVerbalPain(NonVerbalPain);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertNonVerbalPain function of NonVerbalPainDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<NonVerbalPain> getNonVerbalPains() {
		List<NonVerbalPain> nonVerbalPainList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			NonVerbalPainMapper mapper = session.getMapper(NonVerbalPainMapper.class);			
			nonVerbalPainList = mapper.getNonVerbalPains();
		}
		catch (Exception e)
		{
			log.error("Exception found in getNonVerbalPains in NonVerbalPainDao", e);
		}

		return nonVerbalPainList;
	}

	@Override
	public boolean deleteNonVerbalPain(NonVerbalPain nonVerbalPain) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			NonVerbalPainMapper mapper = session.getMapper(NonVerbalPainMapper.class);
			mapper.deleteNonVerbalPain(nonVerbalPain);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteNonVerbalPain in NonVerbalPainDao", e);
			return false;
		}
		
		return true;
	}

}
