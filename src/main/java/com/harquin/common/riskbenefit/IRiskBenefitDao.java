package com.harquin.common.riskbenefit;

import java.util.List;

public interface IRiskBenefitDao {
	public boolean insertRiskBenefit(RiskBenefit riskBenefit);
	public List<RiskBenefit> getRiskBenefits();
	public boolean deleteRiskBenefit(RiskBenefit riskBenefit);
}
