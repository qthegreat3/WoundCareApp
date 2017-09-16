package com.harquin.common.followuprange;

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
public class FollowUpRangeDaoTest {
	@Autowired
	IFollowUpRangeDao followUpRangeDao;
	
	@Test
	public void test()
	{
		FollowUpRange followUpRange = new FollowUpRange("testFollowUpRange");
		
		followUpRangeDao.insertFollowUpRange(followUpRange);
		
		List<FollowUpRange> followUpRangeList = followUpRangeDao.getFollowUpRanges();
		
		assertTrue(followUpRange.getName().equalsIgnoreCase(followUpRangeList.get(0).getName()));
		
		followUpRangeDao.deleteFollowUpRange(followUpRange);
		
		assertTrue(followUpRangeDao.getFollowUpRanges().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		FollowUpRange followUpRange = new FollowUpRange("testFollowUpRange");
		followUpRangeDao.insertFollowUpRange(followUpRange);
		followUpRangeDao.insertFollowUpRange(followUpRange);
		followUpRangeDao.deleteFollowUpRange(followUpRange);
		followUpRangeDao.deleteFollowUpRange(followUpRange);
	}
		
}
