package com.harquin.common.familyhistory;

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
public class FamilyHistoryDaoTest {
	@Autowired
	IFamilyHistoryDao familyHistoryDao;
	
	@Test
	public void test()
	{
		FamilyHistory familyHistory = new FamilyHistory("testFamilyHistory");
		
		familyHistoryDao.insertFamilyHistory(familyHistory);
		
		List<FamilyHistory> familyHistoryList = familyHistoryDao.getFamilyHistorys();
		
		assertTrue(familyHistory.getName().equalsIgnoreCase(familyHistoryList.get(0).getName()));
		
		familyHistoryDao.deleteFamilyHistory(familyHistory);
		
		assertTrue(familyHistoryDao.getFamilyHistorys().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		FamilyHistory familyHistory = new FamilyHistory("testFamilyHistory");
		familyHistoryDao.insertFamilyHistory(familyHistory);
		familyHistoryDao.insertFamilyHistory(familyHistory);
		familyHistoryDao.deleteFamilyHistory(familyHistory);
		familyHistoryDao.deleteFamilyHistory(familyHistory);
	}
		
}
