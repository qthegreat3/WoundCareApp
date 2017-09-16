package com.harquin.common.anesthesia;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnesthesiaDao implements IAnesthesiaDao {
private static final Logger log = LoggerFactory.getLogger(AnesthesiaDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AnesthesiaDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertAnesthesia(Anesthesia anesthesia) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			AnesthesiaMapper mapper = session.getMapper(AnesthesiaMapper.class);
			mapper.insertAnesthesia(anesthesia);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertAnesthesia function of AnesthesiaDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Anesthesia> getAnesthesias() {
		List<Anesthesia> anesthesiaList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AnesthesiaMapper mapper = session.getMapper(AnesthesiaMapper.class);			
			anesthesiaList = mapper.getAnesthesias();
		}
		catch (Exception e)
		{
			log.error("Exception found in getAnesthesias in AnesthesiaDao", e);
		}

		return anesthesiaList;
	}

	@Override
	public boolean deleteAnesthesia(Anesthesia anesthesia) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AnesthesiaMapper mapper = session.getMapper(AnesthesiaMapper.class);
			mapper.deleteAnesthesia(anesthesia);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteAnesthesia in AnesthesiaDao", e);
			return false;
		}
		
		return true;
	}
}
