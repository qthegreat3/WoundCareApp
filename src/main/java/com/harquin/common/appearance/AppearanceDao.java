package com.harquin.common.appearance;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppearanceDao implements IAppearanceDao {
private static final Logger log = LoggerFactory.getLogger(AppearanceDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AppearanceDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertAppearance(Appearance appearance) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			AppearanceMapper mapper = session.getMapper(AppearanceMapper.class);
			mapper.insertAppearance(appearance);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertAppearance function of AppearanceDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Appearance> getAppearances() {
		List<Appearance> appearanceList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AppearanceMapper mapper = session.getMapper(AppearanceMapper.class);			
			appearanceList = mapper.getAppearances();
		}
		catch (Exception e)
		{
			log.error("Exception found in getAppearances in AppearanceDao", e);
		}

		return appearanceList;
	}

	@Override
	public boolean deleteAppearance(Appearance appearance) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AppearanceMapper mapper = session.getMapper(AppearanceMapper.class);
			mapper.deleteAppearance(appearance);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteAppearance in AppearanceDao", e);
			return false;
		}
		
		return true;
	}
}
