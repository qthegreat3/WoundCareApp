package com.harquin.common.testprogress;

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
public class TestProgressDaoTest {
	@Autowired
	ITestProgressDao testProgressDao;
	
	@Test
	public void test()
	{
		TestProgress testProgress = new TestProgress("testTestProgress");
		
		testProgressDao.insertTestProgress(testProgress);
		
		List<TestProgress> testProgressList = testProgressDao.getTestProgresss();
		
		assertTrue(testProgress.getName().equalsIgnoreCase(testProgressList.get(0).getName()));
		
		testProgressDao.deleteTestProgress(testProgress);
		
		assertTrue(testProgressDao.getTestProgresss().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		TestProgress testProgress = new TestProgress("testTestProgress");
		testProgressDao.insertTestProgress(testProgress);
		testProgressDao.insertTestProgress(testProgress);
		testProgressDao.deleteTestProgress(testProgress);
		testProgressDao.deleteTestProgress(testProgress);
	}
		
}
