package com.harquin.common.cauterizationoptions;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CauterizationOptionDao implements ICauterizationOptionDao {
private static final Logger log = LoggerFactory.getLogger(CauterizationOptionDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public CauterizationOptionDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertCauterizationOption(CauterizationOption cauterizationOption) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			CauterizationOptionMapper mapper = session.getMapper(CauterizationOptionMapper.class);
			mapper.insertCauterizationOption(cauterizationOption);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertCauterizationOption function of CauterizationOptionDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<CauterizationOption> getCauterizationOptions() {
		List<CauterizationOption> cauterizationOptionList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			CauterizationOptionMapper mapper = session.getMapper(CauterizationOptionMapper.class);			
			cauterizationOptionList = mapper.getCauterizationOptions();
		}
		catch (Exception e)
		{
			log.error("Exception found in getCauterizationOptions in CauterizationOptionDao", e);
		}

		return cauterizationOptionList;
	}

	@Override
	public boolean deleteCauterizationOption(CauterizationOption cauterizationOption) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			CauterizationOptionMapper mapper = session.getMapper(CauterizationOptionMapper.class);
			mapper.deleteCauterizationOption(cauterizationOption);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteCauterizationOption in CauterizationOptionDao", e);
			return false;
		}
		
		return true;
	}
}
