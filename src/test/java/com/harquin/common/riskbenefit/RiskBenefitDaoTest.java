package com.harquin.common.riskbenefit;

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
public class RiskBenefitDaoTest {
	@Autowired
	IRiskBenefitDao riskBenefitDao;
	
	@Test
	public void test()
	{
		RiskBenefit riskBenefit = new RiskBenefit("testRiskBenefit");
		
		riskBenefitDao.insertRiskBenefit(riskBenefit);
		
		List<RiskBenefit> riskBenefitList = riskBenefitDao.getRiskBenefits();
		
		assertTrue(riskBenefit.getName().equalsIgnoreCase(riskBenefitList.get(0).getName()));
		
		riskBenefitDao.deleteRiskBenefit(riskBenefit);
		
		assertTrue(riskBenefitDao.getRiskBenefits().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		RiskBenefit riskBenefit = new RiskBenefit("testRiskBenefit");
		riskBenefitDao.insertRiskBenefit(riskBenefit);
		riskBenefitDao.insertRiskBenefit(riskBenefit);
		riskBenefitDao.deleteRiskBenefit(riskBenefit);
		riskBenefitDao.deleteRiskBenefit(riskBenefit);
	}
		
}
