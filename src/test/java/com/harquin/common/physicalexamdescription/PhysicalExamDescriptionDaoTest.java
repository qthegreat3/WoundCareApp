package com.harquin.common.physicalexamdescription;

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
public class PhysicalExamDescriptionDaoTest {
	@Autowired
	IPhysicalExamDescriptionDao physicalExamDescriptionDao;
	
	@Test
	public void test()
	{
		PhysicalExamDescription physicalExamDescription = new PhysicalExamDescription("testPhysicalExamDescription");
		
		physicalExamDescriptionDao.insertPhysicalExamDescription(physicalExamDescription);
		
		List<PhysicalExamDescription> physicalExamDescriptionList = physicalExamDescriptionDao.getPhysicalExamDescriptions();
		
		assertTrue(physicalExamDescription.getName().equalsIgnoreCase(physicalExamDescriptionList.get(0).getName()));
		
		physicalExamDescriptionDao.deletePhysicalExamDescription(physicalExamDescription);
		
		assertTrue(physicalExamDescriptionDao.getPhysicalExamDescriptions().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		PhysicalExamDescription physicalExamDescription = new PhysicalExamDescription("testPhysicalExamDescription");
		physicalExamDescriptionDao.insertPhysicalExamDescription(physicalExamDescription);
		physicalExamDescriptionDao.insertPhysicalExamDescription(physicalExamDescription);
		physicalExamDescriptionDao.deletePhysicalExamDescription(physicalExamDescription);
		physicalExamDescriptionDao.deletePhysicalExamDescription(physicalExamDescription);
	}
		
}
