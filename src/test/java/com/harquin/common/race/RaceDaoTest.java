package com.harquin.common.race;

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
public class RaceDaoTest {
	@Autowired
	IRaceDao raceDao;
	
	@Test
	public void test()
	{
		Race race = new Race("testRace");
		
		raceDao.insertRace(race);
		
		List<Race> raceList = raceDao.getRaces();
		
		assertTrue(race.getName().equalsIgnoreCase(raceList.get(0).getName()));
		
		raceDao.deleteRace(race);
		
		assertTrue(raceDao.getRaces().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Race race = new Race("testRace");
		raceDao.insertRace(race);
		raceDao.insertRace(race);
		raceDao.deleteRace(race);
		raceDao.deleteRace(race);
	}
		
}
