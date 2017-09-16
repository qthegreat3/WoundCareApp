package com.harquin.common.supplment;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SupplmentDao implements ISupplmentDao{
	private static final Logger log = LoggerFactory.getLogger(SupplmentDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public SupplmentDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertSupplment(Supplment Supplment) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			SupplmentMapper mapper = session.getMapper(SupplmentMapper.class);
			mapper.insertSupplment(Supplment);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertSupplment function of SupplmentDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Supplment> getSupplments() {
		List<Supplment> supplmentList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			SupplmentMapper mapper = session.getMapper(SupplmentMapper.class);			
			supplmentList = mapper.getSupplments();
		}
		catch (Exception e)
		{
			log.error("Exception found in getSupplments in SupplmentDao", e);
		}

		return supplmentList;
	}

	@Override
	public boolean deleteSupplment(Supplment supplment) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			SupplmentMapper mapper = session.getMapper(SupplmentMapper.class);
			mapper.deleteSupplment(supplment);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteSupplment in SupplmentDao", e);
			return false;
		}
		
		return true;
	}

}
