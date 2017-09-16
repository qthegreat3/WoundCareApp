package com.harquin.common.monofilament;

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
public class MonofilamentDaoTest {
	@Autowired
	IMonofilamentDao monofilamentDao;
	
	@Test
	public void test()
	{
		Monofilament monofilament = new Monofilament("testMonofilament");
		
		monofilamentDao.insertMonofilament(monofilament);
		
		List<Monofilament> monofilamentList = monofilamentDao.getMonofilaments();
		
		assertTrue(monofilament.getName().equalsIgnoreCase(monofilamentList.get(0).getName()));
		
		monofilamentDao.deleteMonofilament(monofilament);
		
		assertTrue(monofilamentDao.getMonofilaments().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Monofilament monofilament = new Monofilament("testMonofilament");
		monofilamentDao.insertMonofilament(monofilament);
		monofilamentDao.insertMonofilament(monofilament);
		monofilamentDao.deleteMonofilament(monofilament);
		monofilamentDao.deleteMonofilament(monofilament);
	}
		
}
