package com.harquin.common.gender;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenderDao implements IGenderDao{
	private static final Logger log = LoggerFactory.getLogger(GenderDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public GenderDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertGender(Gender Gender) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			GenderMapper mapper = session.getMapper(GenderMapper.class);
			mapper.insertGender(Gender);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertGender function of GenderDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Gender> getGenders() {
		List<Gender> genderList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			GenderMapper mapper = session.getMapper(GenderMapper.class);			
			genderList = mapper.getGenders();
		}
		catch (Exception e)
		{
			log.error("Exception found in getGenders in GenderDao", e);
		}

		return genderList;
	}

	@Override
	public boolean deleteGender(Gender gender) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			GenderMapper mapper = session.getMapper(GenderMapper.class);
			mapper.deleteGender(gender);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteGender in GenderDao", e);
			return false;
		}
		
		return true;
	}

}
