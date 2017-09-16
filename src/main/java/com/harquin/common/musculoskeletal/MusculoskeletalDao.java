package com.harquin.common.musculoskeletal;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MusculoskeletalDao implements IMusculoskeletalDao{
	private static final Logger log = LoggerFactory.getLogger(MusculoskeletalDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public MusculoskeletalDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertMusculoskeletal(Musculoskeletal Musculoskeletal) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			MusculoskeletalMapper mapper = session.getMapper(MusculoskeletalMapper.class);
			mapper.insertMusculoskeletal(Musculoskeletal);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertMusculoskeletal function of MusculoskeletalDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Musculoskeletal> getMusculoskeletals() {
		List<Musculoskeletal> musculoskeletalList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			MusculoskeletalMapper mapper = session.getMapper(MusculoskeletalMapper.class);			
			musculoskeletalList = mapper.getMusculoskeletals();
		}
		catch (Exception e)
		{
			log.error("Exception found in getMusculoskeletals in MusculoskeletalDao", e);
		}

		return musculoskeletalList;
	}

	@Override
	public boolean deleteMusculoskeletal(Musculoskeletal musculoskeletal) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			MusculoskeletalMapper mapper = session.getMapper(MusculoskeletalMapper.class);
			mapper.deleteMusculoskeletal(musculoskeletal);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteMusculoskeletal in MusculoskeletalDao", e);
			return false;
		}
		
		return true;
	}

}
