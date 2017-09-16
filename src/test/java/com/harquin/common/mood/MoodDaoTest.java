package com.harquin.common.mood;

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
public class MoodDaoTest {
	@Autowired
	IMoodDao moodDao;
	
	@Test
	public void test()
	{
		Mood mood = new Mood("testMood");
		
		moodDao.insertMood(mood);
		
		List<Mood> moodList = moodDao.getMoods();
		
		assertTrue(mood.getName().equalsIgnoreCase(moodList.get(0).getName()));
		
		moodDao.deleteMood(mood);
		
		assertTrue(moodDao.getMoods().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Mood mood = new Mood("testMood");
		moodDao.insertMood(mood);
		moodDao.insertMood(mood);
		moodDao.deleteMood(mood);
		moodDao.deleteMood(mood);
	}
		
}
