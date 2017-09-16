package com.harquin.common.recommendation;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface RecommendationMapper extends IMyBatisMapperMarker{
	public void insertRecommendation(Recommendation recommendation);
	public List<Recommendation> getRecommendations();
	public void deleteRecommendation(Recommendation recommendation);
}
