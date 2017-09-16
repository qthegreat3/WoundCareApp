package com.harquin.common.indication;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndicationDao implements IIndicationDao{
	private static final Logger log = LoggerFactory.getLogger(IndicationDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public IndicationDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertIndication(Indication Indication) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			IndicationMapper mapper = session.getMapper(IndicationMapper.class);
			mapper.insertIndication(Indication);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertIndication function of IndicationDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Indication> getIndications() {
		List<Indication> indicationList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			IndicationMapper mapper = session.getMapper(IndicationMapper.class);			
			indicationList = mapper.getIndications();
		}
		catch (Exception e)
		{
			log.error("Exception found in getIndications in IndicationDao", e);
		}

		return indicationList;
	}

	@Override
	public boolean deleteIndication(Indication indication) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			IndicationMapper mapper = session.getMapper(IndicationMapper.class);
			mapper.deleteIndication(indication);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteIndication in IndicationDao", e);
			return false;
		}
		
		return true;
	}

}
