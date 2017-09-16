package com.harquin.common.orientation;

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
public class OrientationDaoTest {
	@Autowired
	IOrientationDao orientationDao;
	
	@Test
	public void test()
	{
		Orientation orientation = new Orientation("testOrientation");
		
		orientationDao.insertOrientation(orientation);
		
		List<Orientation> orientationList = orientationDao.getOrientations();
		
		assertTrue(orientation.getName().equalsIgnoreCase(orientationList.get(0).getName()));
		
		orientationDao.deleteOrientation(orientation);
		
		assertTrue(orientationDao.getOrientations().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Orientation orientation = new Orientation("testOrientation");
		orientationDao.insertOrientation(orientation);
		orientationDao.insertOrientation(orientation);
		orientationDao.deleteOrientation(orientation);
		orientationDao.deleteOrientation(orientation);
	}
		
}
