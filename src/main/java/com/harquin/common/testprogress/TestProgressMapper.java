package com.harquin.common.testprogress;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface TestProgressMapper extends IMyBatisMapperMarker{
	public void insertTestProgress(TestProgress testProgress);
	public List<TestProgress> getTestProgresss();
	public void deleteTestProgress(TestProgress testProgress);
}
