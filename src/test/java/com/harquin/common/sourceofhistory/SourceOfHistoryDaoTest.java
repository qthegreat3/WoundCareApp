package com.harquin.common.sourceofhistory;

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
public class SourceOfHistoryDaoTest {
	@Autowired
	ISourceOfHistoryDao sourceOfHistoryDao;
	
	@Test
	public void test()
	{
		SourceOfHistory sourceOfHistory = new SourceOfHistory("testSourceOfHistory");
		
		sourceOfHistoryDao.insertSourceOfHistory(sourceOfHistory);
		
		List<SourceOfHistory> sourceOfHistoryList = sourceOfHistoryDao.getSourceOfHistorys();
		
		assertTrue(sourceOfHistory.getName().equalsIgnoreCase(sourceOfHistoryList.get(0).getName()));
		
		sourceOfHistoryDao.deleteSourceOfHistory(sourceOfHistory);
		
		assertTrue(sourceOfHistoryDao.getSourceOfHistorys().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		SourceOfHistory sourceOfHistory = new SourceOfHistory("testSourceOfHistory");
		sourceOfHistoryDao.insertSourceOfHistory(sourceOfHistory);
		sourceOfHistoryDao.insertSourceOfHistory(sourceOfHistory);
		sourceOfHistoryDao.deleteSourceOfHistory(sourceOfHistory);
		sourceOfHistoryDao.deleteSourceOfHistory(sourceOfHistory);
	}
		
}
