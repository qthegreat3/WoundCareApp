package com.harquin.common.dressing;

import java.util.List;

public interface IDressingDao {
	public boolean insertDressing(Dressing dressing);
	public List<Dressing> getDressings();
	public boolean deleteDressing(Dressing dressing);
}
