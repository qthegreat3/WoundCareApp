package com.harquin.common.allergy;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.harquin.common.patient.Patient;
import com.harquin.config.TestAppConfig;

@ContextConfiguration(classes = {TestAppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AllergyDaoTest {

	@Autowired
	IAllergyDao allergyDao;
	
	@Test
	public void test()
	{
		Allergy allergy = new Allergy("testAllergy");
		
		allergyDao.insertAllergy(allergy);
		
		List<Allergy> allergyList = allergyDao.getAllergies();
		
		assertTrue(allergy.getName().equalsIgnoreCase(allergyList.get(0).getName()));
		
		allergyDao.deleteAllergy(allergy);
		
		assertTrue(allergyDao.getAllergies().isEmpty());
	}
	
	@Test
	public void nullJsonTest()
	{
		ObjectMapper mapper = new ObjectMapper();
		
		Patient patient = new Patient("Haold", "Tarley");
		
		try {
			String encode = mapper.writeValueAsString(patient);
			System.out.println("Patient is " + encode);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testExceptions()
	{
		Allergy allergy = new Allergy("testAllergy");
		allergyDao.insertAllergy(allergy);
		//allergyDao.insertAllergy(allergy);
		//allergyDao.deleteAllergy(allergy);
		//allergyDao.deleteAllergy(allergy);
	}
	
}
