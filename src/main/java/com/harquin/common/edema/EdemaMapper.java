package com.harquin.common.edema;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface EdemaMapper extends IMyBatisMapperMarker {
	public void insertEdema(Edema edema);
	public List<Edema> getEdemas();
	public void deleteEdema(Edema edema);
}
