package com.harquin.common.socialHistory;

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
public class SocialHistoryDaoTest {
	@Autowired
	ISocialHistoryDao socialHistoryDao;
	
	@Test
	public void test()
	{
		SocialHistory socialHistory = new SocialHistory("testSocialHistory");
		
		socialHistoryDao.insertSocialHistory(socialHistory);
		
		List<SocialHistory> socialHistoryList = socialHistoryDao.getSocialHistorys();
		
		assertTrue(socialHistory.getName().equalsIgnoreCase(socialHistoryList.get(0).getName()));
		
		socialHistoryDao.deleteSocialHistory(socialHistory);
		
		assertTrue(socialHistoryDao.getSocialHistorys().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		SocialHistory socialHistory = new SocialHistory("testSocialHistory");
		socialHistoryDao.insertSocialHistory(socialHistory);
		socialHistoryDao.insertSocialHistory(socialHistory);
		socialHistoryDao.deleteSocialHistory(socialHistory);
		socialHistoryDao.deleteSocialHistory(socialHistory);
	}
		
}
