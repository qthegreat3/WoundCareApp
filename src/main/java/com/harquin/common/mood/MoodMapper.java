package com.harquin.common.mood;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface MoodMapper extends IMyBatisMapperMarker{
	public void insertMood(Mood mood);
	public List<Mood> getMoods();
	public void deleteMood(Mood mood);
}
