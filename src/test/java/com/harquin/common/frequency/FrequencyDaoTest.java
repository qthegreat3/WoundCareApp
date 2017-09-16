package com.harquin.common.frequency;

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
public class FrequencyDaoTest {
	@Autowired
	IFrequencyDao frequencyDao;
	
	@Test
	public void test()
	{
		Frequency frequency = new Frequency("testFrequency");
		
		frequencyDao.insertFrequency(frequency);
		
		List<Frequency> frequencyList = frequencyDao.getFrequencys();
		
		assertTrue(frequency.getName().equalsIgnoreCase(frequencyList.get(0).getName()));
		
		frequencyDao.deleteFrequency(frequency);
		
		assertTrue(frequencyDao.getFrequencys().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Frequency frequency = new Frequency("testFrequency");
		frequencyDao.insertFrequency(frequency);
		frequencyDao.insertFrequency(frequency);
		frequencyDao.deleteFrequency(frequency);
		frequencyDao.deleteFrequency(frequency);
	}
		
}
