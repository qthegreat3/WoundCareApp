package com.harquin.common.nodebridementreason;

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
public class NoDebridementReasonDaoTest {
	@Autowired
	INoDebridementReasonDao noDebridementReasonDao;
	
	@Test
	public void test()
	{
		NoDebridementReason noDebridementReason = new NoDebridementReason("testNoDebridementReason");
		
		noDebridementReasonDao.insertNoDebridementReason(noDebridementReason);
		
		List<NoDebridementReason> noDebridementReasonList = noDebridementReasonDao.getNoDebridementReasons();
		
		assertTrue(noDebridementReason.getName().equalsIgnoreCase(noDebridementReasonList.get(0).getName()));
		
		noDebridementReasonDao.deleteNoDebridementReason(noDebridementReason);
		
		assertTrue(noDebridementReasonDao.getNoDebridementReasons().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		NoDebridementReason noDebridementReason = new NoDebridementReason("testNoDebridementReason");
		noDebridementReasonDao.insertNoDebridementReason(noDebridementReason);
		noDebridementReasonDao.insertNoDebridementReason(noDebridementReason);
		noDebridementReasonDao.deleteNoDebridementReason(noDebridementReason);
		noDebridementReasonDao.deleteNoDebridementReason(noDebridementReason);
	}
		
}
