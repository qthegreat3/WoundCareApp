package com.harquin.common.fallriskassessment;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface FallRiskAssessmentMapper extends IMyBatisMapperMarker{
	public void insertFallRiskAssessment(FallRiskAssessment fallRiskAssessment);
	public List<FallRiskAssessment> getFallRiskAssessments();
	public void deleteFallRiskAssessment(FallRiskAssessment fallRiskAssessment);
}
