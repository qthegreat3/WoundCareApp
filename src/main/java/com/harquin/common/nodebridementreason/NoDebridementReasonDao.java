package com.harquin.common.nodebridementreason;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoDebridementReasonDao implements INoDebridementReasonDao{
	private static final Logger log = LoggerFactory.getLogger(NoDebridementReasonDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public NoDebridementReasonDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertNoDebridementReason(NoDebridementReason NoDebridementReason) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			NoDebridementReasonMapper mapper = session.getMapper(NoDebridementReasonMapper.class);
			mapper.insertNoDebridementReason(NoDebridementReason);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertNoDebridementReason function of NoDebridementReasonDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<NoDebridementReason> getNoDebridementReasons() {
		List<NoDebridementReason> noDebridementReasonList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			NoDebridementReasonMapper mapper = session.getMapper(NoDebridementReasonMapper.class);			
			noDebridementReasonList = mapper.getNoDebridementReasons();
		}
		catch (Exception e)
		{
			log.error("Exception found in getNoDebridementReasons in NoDebridementReasonDao", e);
		}

		return noDebridementReasonList;
	}

	@Override
	public boolean deleteNoDebridementReason(NoDebridementReason noDebridementReason) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			NoDebridementReasonMapper mapper = session.getMapper(NoDebridementReasonMapper.class);
			mapper.deleteNoDebridementReason(noDebridementReason);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteNoDebridementReason in NoDebridementReasonDao", e);
			return false;
		}
		
		return true;
	}

}
