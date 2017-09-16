package com.harquin.common.followuprange;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface FollowUpRangeMapper extends IMyBatisMapperMarker{
	public void insertFollowUpRange(FollowUpRange followUpRange);
	public List<FollowUpRange> getFollowUpRanges();
	public void deleteFollowUpRange(FollowUpRange followUpRange);
}
