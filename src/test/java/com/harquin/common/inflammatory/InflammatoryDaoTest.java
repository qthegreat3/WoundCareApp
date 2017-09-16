package com.harquin.common.inflammatory;

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
public class InflammatoryDaoTest {
	@Autowired
	IInflammatoryDao inflammatoryDao;
	
	@Test
	public void test()
	{
		Inflammatory inflammatory = new Inflammatory("testInflammatory");
		
		inflammatoryDao.insertInflammatory(inflammatory);
		
		List<Inflammatory> inflammatoryList = inflammatoryDao.getInflammatorys();
		
		assertTrue(inflammatory.getName().equalsIgnoreCase(inflammatoryList.get(0).getName()));
		
		inflammatoryDao.deleteInflammatory(inflammatory);
		
		assertTrue(inflammatoryDao.getInflammatorys().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Inflammatory inflammatory = new Inflammatory("testInflammatory");
		inflammatoryDao.insertInflammatory(inflammatory);
		inflammatoryDao.insertInflammatory(inflammatory);
		inflammatoryDao.deleteInflammatory(inflammatory);
		inflammatoryDao.deleteInflammatory(inflammatory);
	}
		
}
