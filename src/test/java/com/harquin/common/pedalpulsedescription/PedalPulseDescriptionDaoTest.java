package com.harquin.common.pedalpulsedescription;

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
public class PedalPulseDescriptionDaoTest {
	@Autowired
	IPedalPulseDescriptionDao pedalPulseDescriptionDao;
	
	@Test
	public void test()
	{
		PedalPulseDescription pedalPulseDescription = new PedalPulseDescription("testPedalPulseDescription");
		
		pedalPulseDescriptionDao.insertPedalPulseDescription(pedalPulseDescription);
		
		List<PedalPulseDescription> pedalPulseDescriptionList = pedalPulseDescriptionDao.getPedalPulseDescriptions();
		
		assertTrue(pedalPulseDescription.getName().equalsIgnoreCase(pedalPulseDescriptionList.get(0).getName()));
		
		pedalPulseDescriptionDao.deletePedalPulseDescription(pedalPulseDescription);
		
		assertTrue(pedalPulseDescriptionDao.getPedalPulseDescriptions().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		PedalPulseDescription pedalPulseDescription = new PedalPulseDescription("testPedalPulseDescription");
		pedalPulseDescriptionDao.insertPedalPulseDescription(pedalPulseDescription);
		pedalPulseDescriptionDao.insertPedalPulseDescription(pedalPulseDescription);
		pedalPulseDescriptionDao.deletePedalPulseDescription(pedalPulseDescription);
		pedalPulseDescriptionDao.deletePedalPulseDescription(pedalPulseDescription);
	}
		
}
