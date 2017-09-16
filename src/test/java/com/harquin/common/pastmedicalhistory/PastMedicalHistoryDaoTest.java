package com.harquin.common.pastmedicalhistory;

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
public class PastMedicalHistoryDaoTest {
	@Autowired
	IPastMedicalHistoryDao pastMedicalHistoryDao;
	
	@Test
	public void test()
	{
		PastMedicalHistory pastMedicalHistory = new PastMedicalHistory("testPastMedicalHistory");
		
		pastMedicalHistoryDao.insertPastMedicalHistory(pastMedicalHistory);
		
		List<PastMedicalHistory> pastMedicalHistoryList = pastMedicalHistoryDao.getPastMedicalHistorys();
		
		assertTrue(pastMedicalHistory.getName().equalsIgnoreCase(pastMedicalHistoryList.get(0).getName()));
		
		pastMedicalHistoryDao.deletePastMedicalHistory(pastMedicalHistory);
		
		assertTrue(pastMedicalHistoryDao.getPastMedicalHistorys().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		PastMedicalHistory pastMedicalHistory = new PastMedicalHistory("testPastMedicalHistory");
		pastMedicalHistoryDao.insertPastMedicalHistory(pastMedicalHistory);
		pastMedicalHistoryDao.insertPastMedicalHistory(pastMedicalHistory);
		pastMedicalHistoryDao.deletePastMedicalHistory(pastMedicalHistory);
		pastMedicalHistoryDao.deletePastMedicalHistory(pastMedicalHistory);
	}
		
}
