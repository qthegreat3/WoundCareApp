package com.harquin.common.ethnicity;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EthnicityDao implements IEthnicityDao {
private static final Logger log = LoggerFactory.getLogger(EthnicityDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public EthnicityDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertEthnicity(Ethnicity ethnicity) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			EthnicityMapper mapper = session.getMapper(EthnicityMapper.class);
			mapper.insertEthnicity(ethnicity);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertEthnicity function of EthnicityDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Ethnicity> getEthnicitys() {
		List<Ethnicity> ethnicityList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			EthnicityMapper mapper = session.getMapper(EthnicityMapper.class);			
			ethnicityList = mapper.getEthnicitys();
		}
		catch (Exception e)
		{
			log.error("Exception found in getEthnicitys in EthnicityDao", e);
		}

		return ethnicityList;
	}

	@Override
	public boolean deleteEthnicity(Ethnicity ethnicity) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			EthnicityMapper mapper = session.getMapper(EthnicityMapper.class);
			mapper.deleteEthnicity(ethnicity);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteEthnicity in EthnicityDao", e);
			return false;
		}
		
		return true;
	}
}
