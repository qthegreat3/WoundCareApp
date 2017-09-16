package com.harquin.common.riskbenefit;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface RiskBenefitMapper extends IMyBatisMapperMarker{
	public void insertRiskBenefit(RiskBenefit riskBenefit);
	public List<RiskBenefit> getRiskBenefits();
	public void deleteRiskBenefit(RiskBenefit riskBenefit);
}
