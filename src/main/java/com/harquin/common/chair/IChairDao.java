package com.harquin.common.chair;

import java.util.List;

public interface IChairDao {
	public boolean insertChair(Chair chair);
	public List<Chair> getChairs();
	public boolean deleteChair(Chair chair);
}
