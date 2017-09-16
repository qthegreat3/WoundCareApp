package com.harquin.common.pressurestage;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PressureStageDao implements IPressureStageDao{
	private static final Logger log = LoggerFactory.getLogger(PressureStageDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public PressureStageDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertPressureStage(PressureStage PressureStage) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			PressureStageMapper mapper = session.getMapper(PressureStageMapper.class);
			mapper.insertPressureStage(PressureStage);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertPressureStage function of PressureStageDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<PressureStage> getPressureStages() {
		List<PressureStage> pressureStageList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PressureStageMapper mapper = session.getMapper(PressureStageMapper.class);			
			pressureStageList = mapper.getPressureStages();
		}
		catch (Exception e)
		{
			log.error("Exception found in getPressureStages in PressureStageDao", e);
		}

		return pressureStageList;
	}

	@Override
	public boolean deletePressureStage(PressureStage pressureStage) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PressureStageMapper mapper = session.getMapper(PressureStageMapper.class);
			mapper.deletePressureStage(pressureStage);
		}
		catch (Exception e)
		{
			log.error("Exception found in deletePressureStage in PressureStageDao", e);
			return false;
		}
		
		return true;
	}

}
