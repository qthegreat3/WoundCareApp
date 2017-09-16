package com.harquin.common.indication;

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
public class IndicationDaoTest {
	@Autowired
	IIndicationDao indicationDao;
	
	@Test
	public void test()
	{
		Indication indication = new Indication("testIndication");
		
		indicationDao.insertIndication(indication);
		
		List<Indication> indicationList = indicationDao.getIndications();
		
		assertTrue(indication.getName().equalsIgnoreCase(indicationList.get(0).getName()));
		
		indicationDao.deleteIndication(indication);
		
		assertTrue(indicationDao.getIndications().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Indication indication = new Indication("testIndication");
		indicationDao.insertIndication(indication);
		indicationDao.insertIndication(indication);
		indicationDao.deleteIndication(indication);
		indicationDao.deleteIndication(indication);
	}
		
}
