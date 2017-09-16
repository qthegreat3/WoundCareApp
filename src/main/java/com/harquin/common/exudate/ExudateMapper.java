package com.harquin.common.exudate;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface ExudateMapper extends IMyBatisMapperMarker{
	public void insertExudate(Exudate exudate);
	public List<Exudate> getExudates();
	public void deleteExudate(Exudate exudate);
}
