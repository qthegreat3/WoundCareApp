package com.harquin.common.inflammatory;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InflammatoryDao implements IInflammatoryDao{
	private static final Logger log = LoggerFactory.getLogger(InflammatoryDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public InflammatoryDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertInflammatory(Inflammatory Inflammatory) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			InflammatoryMapper mapper = session.getMapper(InflammatoryMapper.class);
			mapper.insertInflammatory(Inflammatory);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertInflammatory function of InflammatoryDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Inflammatory> getInflammatorys() {
		List<Inflammatory> inflammatoryList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			InflammatoryMapper mapper = session.getMapper(InflammatoryMapper.class);			
			inflammatoryList = mapper.getInflammatorys();
		}
		catch (Exception e)
		{
			log.error("Exception found in getInflammatorys in InflammatoryDao", e);
		}

		return inflammatoryList;
	}

	@Override
	public boolean deleteInflammatory(Inflammatory inflammatory) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			InflammatoryMapper mapper = session.getMapper(InflammatoryMapper.class);
			mapper.deleteInflammatory(inflammatory);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteInflammatory in InflammatoryDao", e);
			return false;
		}
		
		return true;
	}

}
