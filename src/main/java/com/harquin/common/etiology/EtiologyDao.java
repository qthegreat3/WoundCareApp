package com.harquin.common.etiology;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EtiologyDao implements IEtiologyDao {

	private static final Logger log = LoggerFactory.getLogger(EtiologyDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public EtiologyDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public boolean insertEtiology(Etiology etiology) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			EtiologyMapper mapper = session.getMapper(EtiologyMapper.class);
			mapper.insertEtiology(etiology);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertEtiology function of EtiologyDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Etiology> getEtiologys() {
		List<Etiology> etiologyList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			EtiologyMapper mapper = session.getMapper(EtiologyMapper.class);			
			etiologyList = mapper.getEtiologys();
		}
		catch (Exception e)
		{
			log.error("Exception found in getEtiologys in EtiologyDao", e);
		}

		return etiologyList;
	}

	@Override
	public boolean deleteEtiology(Etiology etiology) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			EtiologyMapper mapper = session.getMapper(EtiologyMapper.class);
			mapper.deleteEtiology(etiology);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteAppetit in EtiologyDao", e);
			return false;
		}
		
		return true;
	}

}
