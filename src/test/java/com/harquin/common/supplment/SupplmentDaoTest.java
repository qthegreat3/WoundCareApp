package com.harquin.common.supplment;

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
public class SupplmentDaoTest {
	@Autowired
	ISupplmentDao supplmentDao;
	
	@Test
	public void test()
	{
		Supplment supplment = new Supplment("testSupplment");
		
		supplmentDao.insertSupplment(supplment);
		
		List<Supplment> supplmentList = supplmentDao.getSupplments();
		
		assertTrue(supplment.getName().equalsIgnoreCase(supplmentList.get(0).getName()));
		
		supplmentDao.deleteSupplment(supplment);
		
		assertTrue(supplmentDao.getSupplments().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Supplment supplment = new Supplment("testSupplment");
		supplmentDao.insertSupplment(supplment);
		supplmentDao.insertSupplment(supplment);
		supplmentDao.deleteSupplment(supplment);
		supplmentDao.deleteSupplment(supplment);
	}
		
}
