package com.harquin.common.instrument;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstrumentDao implements IInstrumentDao{
	private static final Logger log = LoggerFactory.getLogger(InstrumentDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public InstrumentDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertInstrument(Instrument Instrument) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			InstrumentMapper mapper = session.getMapper(InstrumentMapper.class);
			mapper.insertInstrument(Instrument);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertInstrument function of InstrumentDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Instrument> getInstruments() {
		List<Instrument> instrumentList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			InstrumentMapper mapper = session.getMapper(InstrumentMapper.class);			
			instrumentList = mapper.getInstruments();
		}
		catch (Exception e)
		{
			log.error("Exception found in getInstruments in InstrumentDao", e);
		}

		return instrumentList;
	}

	@Override
	public boolean deleteInstrument(Instrument instrument) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			InstrumentMapper mapper = session.getMapper(InstrumentMapper.class);
			mapper.deleteInstrument(instrument);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteInstrument in InstrumentDao", e);
			return false;
		}
		
		return true;
	}

}
