package com.harquin.common.followuprange;

import java.util.List;

public interface IFollowUpRangeDao {
	public boolean insertFollowUpRange(FollowUpRange followUpRange);
	public List<FollowUpRange> getFollowUpRanges();
	public boolean deleteFollowUpRange(FollowUpRange followUpRange);
}
