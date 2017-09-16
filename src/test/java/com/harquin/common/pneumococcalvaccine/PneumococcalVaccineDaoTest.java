package com.harquin.common.pneumococcalvaccine;

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
public class PneumococcalVaccineDaoTest {
	@Autowired
	IPneumococcalVaccineDao pneumococcalVaccineDao;
	
	@Test
	public void test()
	{
		PneumococcalVaccine pneumococcalVaccine = new PneumococcalVaccine("testPneumococcalVaccine");
		
		pneumococcalVaccineDao.insertPneumococcalVaccine(pneumococcalVaccine);
		
		List<PneumococcalVaccine> pneumococcalVaccineList = pneumococcalVaccineDao.getPneumococcalVaccines();
		
		assertTrue(pneumococcalVaccine.getName().equalsIgnoreCase(pneumococcalVaccineList.get(0).getName()));
		
		pneumococcalVaccineDao.deletePneumococcalVaccine(pneumococcalVaccine);
		
		assertTrue(pneumococcalVaccineDao.getPneumococcalVaccines().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		PneumococcalVaccine pneumococcalVaccine = new PneumococcalVaccine("testPneumococcalVaccine");
		pneumococcalVaccineDao.insertPneumococcalVaccine(pneumococcalVaccine);
		pneumococcalVaccineDao.insertPneumococcalVaccine(pneumococcalVaccine);
		pneumococcalVaccineDao.deletePneumococcalVaccine(pneumococcalVaccine);
		pneumococcalVaccineDao.deletePneumococcalVaccine(pneumococcalVaccine);
	}
		
}
