package com.harquin.common.recommendation;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.harquin.config.TestAppConfig;

@ContextConfiguration(classes = {TestAppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class RecommendationDaoTest {
	@Autowired
	IRecommendationDao recommendationDao;
	
	@Test
	public void test()
	{
		Recommendation recommendation = new Recommendation("testRecommendation");
		
		recommendationDao.insertRecommendation(recommendation);
		
		List<Recommendation> recommendationList = recommendationDao.getRecommendations();
		
		assertTrue(recommendation.getName().equalsIgnoreCase(recommendationList.get(0).getName()));
		
		recommendationDao.deleteRecommendation(recommendation);
		
		assertTrue(recommendationDao.getRecommendations().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Recommendation recommendation = new Recommendation("testRecommendation");
		recommendationDao.insertRecommendation(recommendation);
		recommendationDao.insertRecommendation(recommendation);
		recommendationDao.deleteRecommendation(recommendation);
		recommendationDao.deleteRecommendation(recommendation);
	}
		
}
