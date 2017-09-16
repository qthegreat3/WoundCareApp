package com.harquin.common.chair;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChairDao implements IChairDao {
	private static final Logger log = LoggerFactory.getLogger(ChairDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public ChairDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public boolean insertChair(Chair chair) {
		
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			ChairMapper mapper = session.getMapper(ChairMapper.class);
			mapper.insertChair(chair);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertChair function of ChairDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Chair> getChairs() {
		List<Chair> chairList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			ChairMapper mapper = session.getMapper(ChairMapper.class);			
			chairList = mapper.getChairs();
		}
		catch (Exception e)
		{
			log.error("Exception found in getChairs in ChairDao", e);
		}

		return chairList;
	}

	@Override
	public boolean deleteChair(Chair chair) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			ChairMapper mapper = session.getMapper(ChairMapper.class);
			mapper.deleteChair(chair);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteAppetit in ChairDao", e);
			return false;
		}
		
		return true;
	}

}
