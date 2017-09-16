package com.harquin.common.frequency;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FrequencyDao implements IFrequencyDao{
	private static final Logger log = LoggerFactory.getLogger(FrequencyDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public FrequencyDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertFrequency(Frequency Frequency) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			FrequencyMapper mapper = session.getMapper(FrequencyMapper.class);
			mapper.insertFrequency(Frequency);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertFrequency function of FrequencyDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Frequency> getFrequencys() {
		List<Frequency> frequencyList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FrequencyMapper mapper = session.getMapper(FrequencyMapper.class);			
			frequencyList = mapper.getFrequencys();
		}
		catch (Exception e)
		{
			log.error("Exception found in getFrequencys in FrequencyDao", e);
		}

		return frequencyList;
	}

	@Override
	public boolean deleteFrequency(Frequency frequency) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			FrequencyMapper mapper = session.getMapper(FrequencyMapper.class);
			mapper.deleteFrequency(frequency);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteFrequency in FrequencyDao", e);
			return false;
		}
		
		return true;
	}

}
