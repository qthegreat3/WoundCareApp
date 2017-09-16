package com.harquin.common.pressurestage;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface PressureStageMapper extends IMyBatisMapperMarker{
	public void insertPressureStage(PressureStage pressureStage);
	public List<PressureStage> getPressureStages();
	public void deletePressureStage(PressureStage pressureStage);
}
