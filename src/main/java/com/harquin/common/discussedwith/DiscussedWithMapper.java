package com.harquin.common.discussedwith;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface DiscussedWithMapper extends IMyBatisMapperMarker {
	public void insertDiscussedWith(DiscussedWith discussedWith);
	public List<DiscussedWith> getDiscussedWiths();
	public void deleteDiscussedWith(DiscussedWith discussedWith);
}
