package com.harquin.common.bed;

import java.util.List;

public interface IBedDao {
	public boolean insertBed(Bed bed);
	public List<Bed> getBeds();
	public boolean deleteBed(Bed bed);
}
