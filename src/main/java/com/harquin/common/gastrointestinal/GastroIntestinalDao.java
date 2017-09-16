package com.harquin.common.gastrointestinal;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GastroIntestinalDao implements IGastroIntestinalDao {
private static final Logger log = LoggerFactory.getLogger(GastroIntestinalDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public GastroIntestinalDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertGastroIntestinal(GastroIntestinal GastroIntestinal) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			GastroIntestinalMapper mapper = session.getMapper(GastroIntestinalMapper.class);
			mapper.insertGastroIntestinal(GastroIntestinal);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertGastroIntestinal function of GastroIntestinalDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<GastroIntestinal> getGastroIntestinals() {
		List<GastroIntestinal> gastroIntestinalList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			GastroIntestinalMapper mapper = session.getMapper(GastroIntestinalMapper.class);			
			gastroIntestinalList = mapper.getGastroIntestinals();
		}
		catch (Exception e)
		{
			log.error("Exception found in getGastroIntestinals in GastroIntestinalDao", e);
		}

		return gastroIntestinalList;
	}

	@Override
	public boolean deleteGastroIntestinal(GastroIntestinal GastroIntestinal) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			GastroIntestinalMapper mapper = session.getMapper(GastroIntestinalMapper.class);
			mapper.deleteGastroIntestinal(GastroIntestinal);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteGastroIntestinal in GastroIntestinalDao", e);
			return false;
		}
		
		return true;
	}
}
