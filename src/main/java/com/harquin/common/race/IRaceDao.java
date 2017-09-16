package com.harquin.common.race;

import java.util.List;

public interface IRaceDao {
	public boolean insertRace(Race race);
	public List<Race> getRaces();
	public boolean deleteRace(Race race);
}
