package com.harquin.common.mood;

import java.util.List;

public interface IMoodDao {
	public boolean insertMood(Mood mood);
	public List<Mood> getMoods();
	public boolean deleteMood(Mood mood);
}
