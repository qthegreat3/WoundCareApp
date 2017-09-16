package com.harquin.common.extremityotherdescription;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtremityOtherDescriptionDao implements IExtremityOtherDescriptionDao {
private static final Logger log = LoggerFactory.getLogger(ExtremityOtherDescriptionDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public ExtremityOtherDescriptionDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertExtremityOtherDescription(ExtremityOtherDescription extremityOtherDescription) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			ExtremityOtherDescriptionMapper mapper = session.getMapper(ExtremityOtherDescriptionMapper.class);
			mapper.insertExtremityOtherDescription(extremityOtherDescription);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertExtremityOtherDescription function of ExtremityOtherDescriptionDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<ExtremityOtherDescription> getExtremityOtherDescriptions() {
		List<ExtremityOtherDescription> extremityOtherDescriptionList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			ExtremityOtherDescriptionMapper mapper = session.getMapper(ExtremityOtherDescriptionMapper.class);			
			extremityOtherDescriptionList = mapper.getExtremityOtherDescriptions();
		}
		catch (Exception e)
		{
			log.error("Exception found in getExtremityOtherDescriptions in ExtremityOtherDescriptionDao", e);
		}

		return extremityOtherDescriptionList;
	}

	@Override
	public boolean deleteExtremityOtherDescription(ExtremityOtherDescription extremityOtherDescription) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			ExtremityOtherDescriptionMapper mapper = session.getMapper(ExtremityOtherDescriptionMapper.class);
			mapper.deleteExtremityOtherDescription(extremityOtherDescription);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteExtremityOtherDescription in ExtremityOtherDescriptionDao", e);
			return false;
		}
		
		return true;
	}
}
