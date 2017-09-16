package com.harquin.common.nonverbalpain;

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
public class NonVerbalPainDaoTest {
	@Autowired
	INonVerbalPainDao nonVerbalPainDao;
	
	@Test
	public void test()
	{
		NonVerbalPain nonVerbalPain = new NonVerbalPain("testNonVerbalPain");
		
		nonVerbalPainDao.insertNonVerbalPain(nonVerbalPain);
		
		List<NonVerbalPain> nonVerbalPainList = nonVerbalPainDao.getNonVerbalPains();
		
		assertTrue(nonVerbalPain.getName().equalsIgnoreCase(nonVerbalPainList.get(0).getName()));
		
		nonVerbalPainDao.deleteNonVerbalPain(nonVerbalPain);
		
		assertTrue(nonVerbalPainDao.getNonVerbalPains().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		NonVerbalPain nonVerbalPain = new NonVerbalPain("testNonVerbalPain");
		nonVerbalPainDao.insertNonVerbalPain(nonVerbalPain);
		nonVerbalPainDao.insertNonVerbalPain(nonVerbalPain);
		nonVerbalPainDao.deleteNonVerbalPain(nonVerbalPain);
		nonVerbalPainDao.deleteNonVerbalPain(nonVerbalPain);
	}
		
}
