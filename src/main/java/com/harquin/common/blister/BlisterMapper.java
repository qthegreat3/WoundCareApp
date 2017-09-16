package com.harquin.common.blister;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface BlisterMapper extends IMyBatisMapperMarker {
	public void insertBlister(Blister blister);
	public List<Blister> getBlisters();
	public void deleteBlister(Blister blister);
}
