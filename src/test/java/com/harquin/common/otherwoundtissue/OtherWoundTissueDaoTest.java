package com.harquin.common.otherwoundtissue;

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
public class OtherWoundTissueDaoTest {
	@Autowired
	IOtherWoundTissueDao otherWoundTissueDao;
	
	@Test
	public void test()
	{
		OtherWoundTissue otherWoundTissue = new OtherWoundTissue("testOtherWoundTissue");
		
		otherWoundTissueDao.insertOtherWoundTissue(otherWoundTissue);
		
		List<OtherWoundTissue> otherWoundTissueList = otherWoundTissueDao.getOtherWoundTissues();
		
		assertTrue(otherWoundTissue.getName().equalsIgnoreCase(otherWoundTissueList.get(0).getName()));
		
		otherWoundTissueDao.deleteOtherWoundTissue(otherWoundTissue);
		
		assertTrue(otherWoundTissueDao.getOtherWoundTissues().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		OtherWoundTissue otherWoundTissue = new OtherWoundTissue("testOtherWoundTissue");
		otherWoundTissueDao.insertOtherWoundTissue(otherWoundTissue);
		otherWoundTissueDao.insertOtherWoundTissue(otherWoundTissue);
		otherWoundTissueDao.deleteOtherWoundTissue(otherWoundTissue);
		otherWoundTissueDao.deleteOtherWoundTissue(otherWoundTissue);
	}
		
}
