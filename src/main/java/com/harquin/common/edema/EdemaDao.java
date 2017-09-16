package com.harquin.common.edema;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EdemaDao implements IEdemaDao {
private static final Logger log = LoggerFactory.getLogger(EdemaDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public EdemaDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertEdema(Edema Edema) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			EdemaMapper mapper = session.getMapper(EdemaMapper.class);
			mapper.insertEdema(Edema);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertEdema function of EdemaDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Edema> getEdemas() {
		List<Edema> edemaList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			EdemaMapper mapper = session.getMapper(EdemaMapper.class);			
			edemaList = mapper.getEdemas();
		}
		catch (Exception e)
		{
			log.error("Exception found in getEdemas in EdemaDao", e);
		}

		return edemaList;
	}

	@Override
	public boolean deleteEdema(Edema edema) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			EdemaMapper mapper = session.getMapper(EdemaMapper.class);
			mapper.deleteEdema(edema);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteEdema in EdemaDao", e);
			return false;
		}
		
		return true;
	}
}
