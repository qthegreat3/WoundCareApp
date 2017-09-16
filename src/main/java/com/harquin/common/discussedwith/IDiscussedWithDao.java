package com.harquin.common.discussedwith;

import java.util.List;

public interface IDiscussedWithDao {
	public boolean insertDiscussedWith(DiscussedWith discussedWith);
	public List<DiscussedWith> getDiscussedWiths();
	public boolean deleteDiscussedWith(DiscussedWith discussedWith);
}
