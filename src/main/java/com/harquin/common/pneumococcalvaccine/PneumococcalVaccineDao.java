package com.harquin.common.pneumococcalvaccine;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PneumococcalVaccineDao implements IPneumococcalVaccineDao{
	private static final Logger log = LoggerFactory.getLogger(PneumococcalVaccineDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public PneumococcalVaccineDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertPneumococcalVaccine(PneumococcalVaccine PneumococcalVaccine) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			PneumococcalVaccineMapper mapper = session.getMapper(PneumococcalVaccineMapper.class);
			mapper.insertPneumococcalVaccine(PneumococcalVaccine);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertPneumococcalVaccine function of PneumococcalVaccineDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<PneumococcalVaccine> getPneumococcalVaccines() {
		List<PneumococcalVaccine> pneumococcalVaccineList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PneumococcalVaccineMapper mapper = session.getMapper(PneumococcalVaccineMapper.class);			
			pneumococcalVaccineList = mapper.getPneumococcalVaccines();
		}
		catch (Exception e)
		{
			log.error("Exception found in getPneumococcalVaccines in PneumococcalVaccineDao", e);
		}

		return pneumococcalVaccineList;
	}

	@Override
	public boolean deletePneumococcalVaccine(PneumococcalVaccine pneumococcalVaccine) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PneumococcalVaccineMapper mapper = session.getMapper(PneumococcalVaccineMapper.class);
			mapper.deletePneumococcalVaccine(pneumococcalVaccine);
		}
		catch (Exception e)
		{
			log.error("Exception found in deletePneumococcalVaccine in PneumococcalVaccineDao", e);
			return false;
		}
		
		return true;
	}

}
