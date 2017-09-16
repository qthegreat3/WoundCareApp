package com.harquin.common.chair;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface ChairMapper extends IMyBatisMapperMarker {
	public void insertChair(Chair chair);
	public List<Chair> getChairs();
	public void deleteChair(Chair chair);
}
