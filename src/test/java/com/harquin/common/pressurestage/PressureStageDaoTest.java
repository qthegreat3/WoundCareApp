package com.harquin.common.pressurestage;

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
public class PressureStageDaoTest {
	@Autowired
	IPressureStageDao pressureStageDao;
	
	@Test
	public void test()
	{
		PressureStage pressureStage = new PressureStage("testPressureStage");
		
		pressureStageDao.insertPressureStage(pressureStage);
		
		List<PressureStage> pressureStageList = pressureStageDao.getPressureStages();
		
		assertTrue(pressureStage.getName().equalsIgnoreCase(pressureStageList.get(0).getName()));
		
		pressureStageDao.deletePressureStage(pressureStage);
		
		assertTrue(pressureStageDao.getPressureStages().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		PressureStage pressureStage = new PressureStage("testPressureStage");
		pressureStageDao.insertPressureStage(pressureStage);
		pressureStageDao.insertPressureStage(pressureStage);
		pressureStageDao.deletePressureStage(pressureStage);
		pressureStageDao.deletePressureStage(pressureStage);
	}
		
}
