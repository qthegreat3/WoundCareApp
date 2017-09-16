package com.harquin.common.complication;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface ComplicationMapper extends IMyBatisMapperMarker {
	public void insertComplication(Complication complication);
	public List<Complication> getComplications();
	public void deleteComplication(Complication complication);
}
