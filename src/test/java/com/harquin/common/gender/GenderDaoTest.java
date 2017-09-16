package com.harquin.common.gender;

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
public class GenderDaoTest {
	@Autowired
	IGenderDao genderDao;
	
	@Test
	public void test()
	{
		Gender gender = new Gender("testGender");
		
		genderDao.insertGender(gender);
		
		List<Gender> genderList = genderDao.getGenders();
		
		assertTrue(gender.getName().equalsIgnoreCase(genderList.get(0).getName()));
		
		genderDao.deleteGender(gender);
		
		assertTrue(genderDao.getGenders().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Gender gender = new Gender("testGender");
		genderDao.insertGender(gender);
		genderDao.insertGender(gender);
		genderDao.deleteGender(gender);
		genderDao.deleteGender(gender);
	}
		
}
