package com.harquin.common.exudate;

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
public class ExudateDaoTest {
	@Autowired
	IExudateDao exudateDao;
	
	@Test
	public void test()
	{
		Exudate exudate = new Exudate("testExudate");
		
		exudateDao.insertExudate(exudate);
		
		List<Exudate> exudateList = exudateDao.getExudates();
		
		assertTrue(exudate.getName().equalsIgnoreCase(exudateList.get(0).getName()));
		
		exudateDao.deleteExudate(exudate);
		
		assertTrue(exudateDao.getExudates().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Exudate exudate = new Exudate("testExudate");
		exudateDao.insertExudate(exudate);
		exudateDao.insertExudate(exudate);
		exudateDao.deleteExudate(exudate);
		exudateDao.deleteExudate(exudate);
	}
		
}
