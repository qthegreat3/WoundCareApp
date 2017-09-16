package com.harquin.common.testprogress;

import java.util.List;

public interface ITestProgressDao {
	public boolean insertTestProgress(TestProgress testProgress);
	public List<TestProgress> getTestProgresss();
	public boolean deleteTestProgress(TestProgress testProgress);
}
