package com.harquin.common.dressing;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DressingDao implements IDressingDao {
private static final Logger log = LoggerFactory.getLogger(DressingDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public DressingDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertDressing(Dressing dressing) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			DressingMapper mapper = session.getMapper(DressingMapper.class);
			mapper.insertDressing(dressing);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertDressing function of DressingDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Dressing> getDressings() {
		List<Dressing> dressingList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			DressingMapper mapper = session.getMapper(DressingMapper.class);			
			dressingList = mapper.getDressings();
		}
		catch (Exception e)
		{
			log.error("Exception found in getDressings in DressingDao", e);
		}

		return dressingList;
	}

	@Override
	public boolean deleteDressing(Dressing dressing) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			DressingMapper mapper = session.getMapper(DressingMapper.class);
			mapper.deleteDressing(dressing);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteDressing in DressingDao", e);
			return false;
		}
		
		return true;
	}
}
