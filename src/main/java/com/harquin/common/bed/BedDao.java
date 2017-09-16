package com.harquin.common.bed;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BedDao implements IBedDao {
	private static final Logger log = LoggerFactory.getLogger(BedDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public BedDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertBed(Bed bed) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			BedMapper mapper = session.getMapper(BedMapper.class);
			mapper.insertBed(bed);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertBed function of BedDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Bed> getBeds() {
		List<Bed> bedList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			BedMapper mapper = session.getMapper(BedMapper.class);			
			bedList = mapper.getBeds();
		}
		catch (Exception e)
		{
			log.error("Exception found in getBeds in BedDao", e);
		}

		return bedList;
	}

	@Override
	public boolean deleteBed(Bed bed) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			BedMapper mapper = session.getMapper(BedMapper.class);
			mapper.deleteBed(bed);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteBed in bedDao", e);
			return false;
		}
		
		return true;
	}

}
