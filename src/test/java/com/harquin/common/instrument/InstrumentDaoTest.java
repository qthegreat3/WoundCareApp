package com.harquin.common.instrument;

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
public class InstrumentDaoTest {
	@Autowired
	IInstrumentDao instrumentDao;
	
	@Test
	public void test()
	{
		Instrument instrument = new Instrument("testInstrument");
		
		instrumentDao.insertInstrument(instrument);
		
		List<Instrument> instrumentList = instrumentDao.getInstruments();
		
		assertTrue(instrument.getName().equalsIgnoreCase(instrumentList.get(0).getName()));
		
		instrumentDao.deleteInstrument(instrument);
		
		assertTrue(instrumentDao.getInstruments().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Instrument instrument = new Instrument("testInstrument");
		instrumentDao.insertInstrument(instrument);
		instrumentDao.insertInstrument(instrument);
		instrumentDao.deleteInstrument(instrument);
		instrumentDao.deleteInstrument(instrument);
	}
		
}
