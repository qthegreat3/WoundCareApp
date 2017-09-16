package com.harquin.common.otherwoundtissue;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OtherWoundTissueDao implements IOtherWoundTissueDao{
	private static final Logger log = LoggerFactory.getLogger(OtherWoundTissueDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public OtherWoundTissueDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertOtherWoundTissue(OtherWoundTissue OtherWoundTissue) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			OtherWoundTissueMapper mapper = session.getMapper(OtherWoundTissueMapper.class);
			mapper.insertOtherWoundTissue(OtherWoundTissue);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertOtherWoundTissue function of OtherWoundTissueDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<OtherWoundTissue> getOtherWoundTissues() {
		List<OtherWoundTissue> otherWoundTissueList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			OtherWoundTissueMapper mapper = session.getMapper(OtherWoundTissueMapper.class);			
			otherWoundTissueList = mapper.getOtherWoundTissues();
		}
		catch (Exception e)
		{
			log.error("Exception found in getOtherWoundTissues in OtherWoundTissueDao", e);
		}

		return otherWoundTissueList;
	}

	@Override
	public boolean deleteOtherWoundTissue(OtherWoundTissue otherWoundTissue) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			OtherWoundTissueMapper mapper = session.getMapper(OtherWoundTissueMapper.class);
			mapper.deleteOtherWoundTissue(otherWoundTissue);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteOtherWoundTissue in OtherWoundTissueDao", e);
			return false;
		}
		
		return true;
	}

}
