package com.harquin.common.recommendation;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RecommendationDao implements IRecommendationDao{
	private static final Logger log = LoggerFactory.getLogger(RecommendationDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public RecommendationDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertRecommendation(Recommendation Recommendation) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			RecommendationMapper mapper = session.getMapper(RecommendationMapper.class);
			mapper.insertRecommendation(Recommendation);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertRecommendation function of RecommendationDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Recommendation> getRecommendations() {
		List<Recommendation> recommendationList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			RecommendationMapper mapper = session.getMapper(RecommendationMapper.class);			
			recommendationList = mapper.getRecommendations();
		}
		catch (Exception e)
		{
			log.error("Exception found in getRecommendations in RecommendationDao", e);
		}

		return recommendationList;
	}

	@Override
	public boolean deleteRecommendation(Recommendation recommendation) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			RecommendationMapper mapper = session.getMapper(RecommendationMapper.class);
			mapper.deleteRecommendation(recommendation);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteRecommendation in RecommendationDao", e);
			return false;
		}
		
		return true;
	}

}
