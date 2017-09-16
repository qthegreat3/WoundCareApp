package com.harquin.common.babinskireflex;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BabinskiReflexDao implements IBabinskiReflexDao {
private static final Logger log = LoggerFactory.getLogger(BabinskiReflexDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public BabinskiReflexDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertBabinskiReflex(BabinskiReflex BabinskiReflex) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			BabinskiReflexMapper mapper = session.getMapper(BabinskiReflexMapper.class);
			mapper.insertBabinskiReflex(BabinskiReflex);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertBabinskiReflex function of BabinskiReflexDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<BabinskiReflex> getBabinskiReflexs() {
		List<BabinskiReflex> babinskiReflexList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			BabinskiReflexMapper mapper = session.getMapper(BabinskiReflexMapper.class);			
			babinskiReflexList = mapper.getBabinskiReflexs();
		}
		catch (Exception e)
		{
			log.error("Exception found in getBabinskiReflexs in BabinskiReflexDao", e);
		}

		return babinskiReflexList;
	}

	@Override
	public boolean deleteBabinskiReflex(BabinskiReflex BabinskiReflex) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			BabinskiReflexMapper mapper = session.getMapper(BabinskiReflexMapper.class);
			mapper.deleteBabinskiReflex(BabinskiReflex);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteBabinskiReflex in BabinskiReflexDao", e);
			return false;
		}
		
		return true;
	}
}
