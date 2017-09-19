package com.harquin.common.fallriskassessment;

import java.util.List;

public interface IFallRiskAssessmentDao {
	public boolean insertFallRiskAssessment(FallRiskAssessment fallRiskAssessment);
	public List<FallRiskAssessment> getFallRiskAssessments();
	public boolean deleteFallRiskAssessment(FallRiskAssessment fallRiskAssessment);
}
