package com.harquin.common.pedalpulsedescription;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PedalPulseDescriptionDao implements IPedalPulseDescriptionDao{
	private static final Logger log = LoggerFactory.getLogger(PedalPulseDescriptionDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public PedalPulseDescriptionDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertPedalPulseDescription(PedalPulseDescription PedalPulseDescription) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			PedalPulseDescriptionMapper mapper = session.getMapper(PedalPulseDescriptionMapper.class);
			mapper.insertPedalPulseDescription(PedalPulseDescription);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertPedalPulseDescription function of PedalPulseDescriptionDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<PedalPulseDescription> getPedalPulseDescriptions() {
		List<PedalPulseDescription> pedalPulseDescriptionList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PedalPulseDescriptionMapper mapper = session.getMapper(PedalPulseDescriptionMapper.class);			
			pedalPulseDescriptionList = mapper.getPedalPulseDescriptions();
		}
		catch (Exception e)
		{
			log.error("Exception found in getPedalPulseDescriptions in PedalPulseDescriptionDao", e);
		}

		return pedalPulseDescriptionList;
	}

	@Override
	public boolean deletePedalPulseDescription(PedalPulseDescription pedalPulseDescription) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PedalPulseDescriptionMapper mapper = session.getMapper(PedalPulseDescriptionMapper.class);
			mapper.deletePedalPulseDescription(pedalPulseDescription);
		}
		catch (Exception e)
		{
			log.error("Exception found in deletePedalPulseDescription in PedalPulseDescriptionDao", e);
			return false;
		}
		
		return true;
	}

}
