package com.harquin.common.foottemperature;

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
public class FootTemperatureDaoTest {
	@Autowired
	IFootTemperatureDao footTemperatureDao;
	
	@Test
	public void test()
	{
		FootTemperature footTemperature = new FootTemperature("testFootTemperature");
		
		footTemperatureDao.insertFootTemperature(footTemperature);
		
		List<FootTemperature> footTemperatureList = footTemperatureDao.getFootTemperatures();
		
		assertTrue(footTemperature.getName().equalsIgnoreCase(footTemperatureList.get(0).getName()));
		
		footTemperatureDao.deleteFootTemperature(footTemperature);
		
		assertTrue(footTemperatureDao.getFootTemperatures().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		FootTemperature footTemperature = new FootTemperature("testFootTemperature");
		footTemperatureDao.insertFootTemperature(footTemperature);
		footTemperatureDao.insertFootTemperature(footTemperature);
		footTemperatureDao.deleteFootTemperature(footTemperature);
		footTemperatureDao.deleteFootTemperature(footTemperature);
	}
		
}
