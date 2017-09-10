package com.harquin.common.allergy;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AllergyDao implements IAllergyDao {

	private static final Logger log = LoggerFactory.getLogger(AllergyDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AllergyDao(SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public boolean insertAllergy(Allergy allergy) {
		
		if(allergy == null)
		{
			throw new IllegalArgumentException("Allergy Cannot Be Null");
		}
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AllergyMapper mapper = session.getMapper(AllergyMapper.class);
			mapper.insertAllergy(allergy);
		}
		catch(Exception e)
		{
			log.error("Error in insertAllergy", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Allergy> getAllergies(){
		List<Allergy> allergies = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AllergyMapper mapper = session.getMapper(AllergyMapper.class);
						
			allergies = mapper.getAllergies();
		}
		catch(Exception e)
		{
			log.error("Error in getAllergies", e);
		}

		return allergies;
	}

	@Override
	public boolean deleteAllergy(Allergy allergy) {
		if(allergy == null)
		{
			throw new IllegalArgumentException("Allergy Cannot Be Null");
		}
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AllergyMapper mapper = session.getMapper(AllergyMapper.class);
			
			mapper.deleteAllergy(allergy);
		}
		catch (Exception e)
		{
			log.error("Error in deleteAllergy", e);
			return false;
		}
		
		return true;
	}

}
