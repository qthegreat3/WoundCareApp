package com.harquin.common.riskbenefit;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RiskBenefitDao implements IRiskBenefitDao{
	private static final Logger log = LoggerFactory.getLogger(RiskBenefitDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public RiskBenefitDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertRiskBenefit(RiskBenefit RiskBenefit) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			RiskBenefitMapper mapper = session.getMapper(RiskBenefitMapper.class);
			mapper.insertRiskBenefit(RiskBenefit);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertRiskBenefit function of RiskBenefitDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<RiskBenefit> getRiskBenefits() {
		List<RiskBenefit> riskBenefitList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			RiskBenefitMapper mapper = session.getMapper(RiskBenefitMapper.class);			
			riskBenefitList = mapper.getRiskBenefits();
		}
		catch (Exception e)
		{
			log.error("Exception found in getRiskBenefits in RiskBenefitDao", e);
		}

		return riskBenefitList;
	}

	@Override
	public boolean deleteRiskBenefit(RiskBenefit riskBenefit) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			RiskBenefitMapper mapper = session.getMapper(RiskBenefitMapper.class);
			mapper.deleteRiskBenefit(riskBenefit);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteRiskBenefit in RiskBenefitDao", e);
			return false;
		}
		
		return true;
	}

}
