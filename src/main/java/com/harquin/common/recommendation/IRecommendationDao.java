package com.harquin.common.recommendation;

import java.util.List;

public interface IRecommendationDao {
	public boolean insertRecommendation(Recommendation recommendation);
	public List<Recommendation> getRecommendations();
	public boolean deleteRecommendation(Recommendation recommendation);
}
