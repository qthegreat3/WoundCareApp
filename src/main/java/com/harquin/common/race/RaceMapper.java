package com.harquin.common.race;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface RaceMapper extends IMyBatisMapperMarker{
	public void insertRace(Race race);
	public List<Race> getRaces();
	public void deleteRace(Race race);
}
