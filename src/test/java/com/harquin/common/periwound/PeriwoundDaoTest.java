package com.harquin.common.periwound;

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
public class PeriwoundDaoTest {
	@Autowired
	IPeriwoundDao periwoundDao;
	
	@Test
	public void test()
	{
		Periwound periwound = new Periwound("testPeriwound");
		
		periwoundDao.insertPeriwound(periwound);
		
		List<Periwound> periwoundList = periwoundDao.getPeriwounds();
		
		assertTrue(periwound.getName().equalsIgnoreCase(periwoundList.get(0).getName()));
		
		periwoundDao.deletePeriwound(periwound);
		
		assertTrue(periwoundDao.getPeriwounds().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Periwound periwound = new Periwound("testPeriwound");
		periwoundDao.insertPeriwound(periwound);
		periwoundDao.insertPeriwound(periwound);
		periwoundDao.deletePeriwound(periwound);
		periwoundDao.deletePeriwound(periwound);
	}
		
}
