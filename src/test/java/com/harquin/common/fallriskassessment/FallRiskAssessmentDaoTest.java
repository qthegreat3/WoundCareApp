package com.harquin.common.fallriskassessment;

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
public class FallRiskAssessmentDaoTest {
	@Autowired
	IFallRiskAssessmentDao fallRiskAssessmentDao;
	
	@Test
	public void test()
	{
		FallRiskAssessment fallRiskAssessment = new FallRiskAssessment("testFallRiskAssessment");
		
		fallRiskAssessmentDao.insertFallRiskAssessment(fallRiskAssessment);
		
		List<FallRiskAssessment> fallRiskAssessmentList = fallRiskAssessmentDao.getFallRiskAssessments();
		
		assertTrue(fallRiskAssessment.getName().equalsIgnoreCase(fallRiskAssessmentList.get(0).getName()));
		
		fallRiskAssessmentDao.deleteFallRiskAssessment(fallRiskAssessment);
		
		assertTrue(fallRiskAssessmentDao.getFallRiskAssessments().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		FallRiskAssessment fallRiskAssessment = new FallRiskAssessment("testFallRiskAssessment");
		fallRiskAssessmentDao.insertFallRiskAssessment(fallRiskAssessment);
		fallRiskAssessmentDao.insertFallRiskAssessment(fallRiskAssessment);
		fallRiskAssessmentDao.deleteFallRiskAssessment(fallRiskAssessment);
		fallRiskAssessmentDao.deleteFallRiskAssessment(fallRiskAssessment);
	}
		
}
