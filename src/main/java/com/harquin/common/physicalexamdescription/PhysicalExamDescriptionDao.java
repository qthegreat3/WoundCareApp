package com.harquin.common.physicalexamdescription;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhysicalExamDescriptionDao implements IPhysicalExamDescriptionDao{
	private static final Logger log = LoggerFactory.getLogger(PhysicalExamDescriptionDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public PhysicalExamDescriptionDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertPhysicalExamDescription(PhysicalExamDescription PhysicalExamDescription) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			PhysicalExamDescriptionMapper mapper = session.getMapper(PhysicalExamDescriptionMapper.class);
			mapper.insertPhysicalExamDescription(PhysicalExamDescription);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertPhysicalExamDescription function of PhysicalExamDescriptionDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<PhysicalExamDescription> getPhysicalExamDescriptions() {
		List<PhysicalExamDescription> physicalExamDescriptionList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PhysicalExamDescriptionMapper mapper = session.getMapper(PhysicalExamDescriptionMapper.class);			
			physicalExamDescriptionList = mapper.getPhysicalExamDescriptions();
		}
		catch (Exception e)
		{
			log.error("Exception found in getPhysicalExamDescriptions in PhysicalExamDescriptionDao", e);
		}

		return physicalExamDescriptionList;
	}

	@Override
	public boolean deletePhysicalExamDescription(PhysicalExamDescription physicalExamDescription) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			PhysicalExamDescriptionMapper mapper = session.getMapper(PhysicalExamDescriptionMapper.class);
			mapper.deletePhysicalExamDescription(physicalExamDescription);
		}
		catch (Exception e)
		{
			log.error("Exception found in deletePhysicalExamDescription in PhysicalExamDescriptionDao", e);
			return false;
		}
		
		return true;
	}

}
