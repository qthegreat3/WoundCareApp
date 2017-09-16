package com.harquin.common.musculoskeletal;

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
public class MusculoskeletalDaoTest {
	@Autowired
	IMusculoskeletalDao musculoskeletalDao;
	
	@Test
	public void test()
	{
		Musculoskeletal musculoskeletal = new Musculoskeletal("testMusculoskeletal");
		
		musculoskeletalDao.insertMusculoskeletal(musculoskeletal);
		
		List<Musculoskeletal> musculoskeletalList = musculoskeletalDao.getMusculoskeletals();
		
		assertTrue(musculoskeletal.getName().equalsIgnoreCase(musculoskeletalList.get(0).getName()));
		
		musculoskeletalDao.deleteMusculoskeletal(musculoskeletal);
		
		assertTrue(musculoskeletalDao.getMusculoskeletals().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Musculoskeletal musculoskeletal = new Musculoskeletal("testMusculoskeletal");
		musculoskeletalDao.insertMusculoskeletal(musculoskeletal);
		musculoskeletalDao.insertMusculoskeletal(musculoskeletal);
		musculoskeletalDao.deleteMusculoskeletal(musculoskeletal);
		musculoskeletalDao.deleteMusculoskeletal(musculoskeletal);
	}
		
}
