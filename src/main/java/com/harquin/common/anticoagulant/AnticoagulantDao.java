package com.harquin.common.anticoagulant;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnticoagulantDao implements IAnticoagulantDao{
	private static final Logger log = LoggerFactory.getLogger(AnticoagulantDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AnticoagulantDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertAnticoagulant(Anticoagulant Anticoagulant) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			AnticoagulantMapper mapper = session.getMapper(AnticoagulantMapper.class);
			mapper.insertAnticoagulant(Anticoagulant);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertAnticoagulant function of AnticoagulantDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Anticoagulant> getAnticoagulants() {
		List<Anticoagulant> anticoagulantList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AnticoagulantMapper mapper = session.getMapper(AnticoagulantMapper.class);			
			anticoagulantList = mapper.getAnticoagulants();
		}
		catch (Exception e)
		{
			log.error("Exception found in getAnticoagulants in AnticoagulantDao", e);
		}

		return anticoagulantList;
	}

	@Override
	public boolean deleteAnticoagulant(Anticoagulant anticoagulant) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AnticoagulantMapper mapper = session.getMapper(AnticoagulantMapper.class);
			mapper.deleteAnticoagulant(anticoagulant);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteAnticoagulant in AnticoagulantDao", e);
			return false;
		}
		
		return true;
	}
}
