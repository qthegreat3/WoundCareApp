package com.harquin.common.blister;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlisterDao implements IBlisterDao {
private static final Logger log = LoggerFactory.getLogger(BlisterDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public BlisterDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertBlister(Blister blister) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			BlisterMapper mapper = session.getMapper(BlisterMapper.class);
			mapper.insertBlister(blister);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertBlister function of BlisterDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Blister> getBlisters() {
		List<Blister> blisterList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			BlisterMapper mapper = session.getMapper(BlisterMapper.class);			
			blisterList = mapper.getBlisters();
		}
		catch (Exception e)
		{
			log.error("Exception found in getBlisters in BlisterDao", e);
		}

		return blisterList;
	}

	@Override
	public boolean deleteBlister(Blister blister) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			BlisterMapper mapper = session.getMapper(BlisterMapper.class);
			mapper.deleteBlister(blister);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteBlister in BlisterDao", e);
			return false;
		}
		
		return true;
	}
}
