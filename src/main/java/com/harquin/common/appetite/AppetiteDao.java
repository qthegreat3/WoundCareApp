package com.harquin.common.appetite;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppetiteDao implements IAppetiteDao{
	private static final Logger log = LoggerFactory.getLogger(AppetiteDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AppetiteDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertAppetite(Appetite appetite) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			AppetiteMapper mapper = session.getMapper(AppetiteMapper.class);
			mapper.insertAppetite(appetite);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertAppetite function of AppetiteDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Appetite> getAppetites() {
		List<Appetite> appetiteList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AppetiteMapper mapper = session.getMapper(AppetiteMapper.class);			
			mapper.getAppetites();
		}
		catch (Exception e)
		{
			log.error("Exception found in getAppetites in AppetiteDao", e);
		}

		return appetiteList;
	}

	@Override
	public boolean deleteAppetite(Appetite appetite) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AppetiteMapper mapper = session.getMapper(AppetiteMapper.class);
			mapper.deleteAppetite(appetite);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteAppetit in AppetiteDao", e);
			return false;
		}
		
		return true;
	}

}
