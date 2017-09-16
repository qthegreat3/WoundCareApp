package com.harquin.common.monofilament;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonofilamentDao implements IMonofilamentDao{
	private static final Logger log = LoggerFactory.getLogger(MonofilamentDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public MonofilamentDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertMonofilament(Monofilament Monofilament) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			MonofilamentMapper mapper = session.getMapper(MonofilamentMapper.class);
			mapper.insertMonofilament(Monofilament);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertMonofilament function of MonofilamentDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Monofilament> getMonofilaments() {
		List<Monofilament> monofilamentList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			MonofilamentMapper mapper = session.getMapper(MonofilamentMapper.class);			
			monofilamentList = mapper.getMonofilaments();
		}
		catch (Exception e)
		{
			log.error("Exception found in getMonofilaments in MonofilamentDao", e);
		}

		return monofilamentList;
	}

	@Override
	public boolean deleteMonofilament(Monofilament monofilament) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			MonofilamentMapper mapper = session.getMapper(MonofilamentMapper.class);
			mapper.deleteMonofilament(monofilament);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteMonofilament in MonofilamentDao", e);
			return false;
		}
		
		return true;
	}

}
