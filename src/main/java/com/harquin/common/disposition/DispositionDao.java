package com.harquin.common.disposition;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DispositionDao implements IDispositionDao {
private static final Logger log = LoggerFactory.getLogger(DispositionDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public DispositionDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertDisposition(Disposition disposition) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			DispositionMapper mapper = session.getMapper(DispositionMapper.class);
			mapper.insertDisposition(disposition);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertDisposition function of DispositionDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Disposition> getDispositions() {
		List<Disposition> dispositionList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			DispositionMapper mapper = session.getMapper(DispositionMapper.class);			
			dispositionList = mapper.getDispositions();
		}
		catch (Exception e)
		{
			log.error("Exception found in getDispositions in DispositionDao", e);
		}

		return dispositionList;
	}

	@Override
	public boolean deleteDisposition(Disposition disposition) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			DispositionMapper mapper = session.getMapper(DispositionMapper.class);
			mapper.deleteDisposition(disposition);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteDisposition in DispositionDao", e);
			return false;
		}
		
		return true;
	}
}
