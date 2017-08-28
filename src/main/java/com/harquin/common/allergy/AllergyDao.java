package com.harquin.common.allergy;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AllergyDao implements IAllergyDao {

	private SqlSessionFactory sqlSessionFactory;
	
	public AllergyDao(SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	@Override
	public void insertAllergy(Allergy allergy) {
		
		if(allergy == null)
		{
			throw new IllegalArgumentException("Allergy Cannot Be Null");
		}
		
		SqlSession session = sqlSessionFactory.openSession();
		AllergyMapper mapper = session.getMapper(AllergyMapper.class);
		mapper.insertAllergy(allergy);
		session.close();
	}

	@Override
	public List<Allergy> getAllergies() {
		SqlSession session = sqlSessionFactory.openSession();
		AllergyMapper mapper = session.getMapper(AllergyMapper.class);
		
		List<Allergy> allergies = new ArrayList<>();
		
		allergies = mapper.getAllergies();
		session.close();
		return allergies;
	}

	@Override
	public void deleteAllergy(Allergy allergy) {
		if(allergy == null)
		{
			throw new IllegalArgumentException("Allergy Cannot Be Null");
		}
		
		SqlSession session = sqlSessionFactory.openSession();
		AllergyMapper mapper = session.getMapper(AllergyMapper.class);
		
		mapper.deleteAllergy(allergy);
		session.close();
	}

}
