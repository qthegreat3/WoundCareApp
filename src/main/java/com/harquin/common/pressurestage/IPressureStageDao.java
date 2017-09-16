package com.harquin.common.pressurestage;

import java.util.List;

public interface IPressureStageDao {
	public boolean insertPressureStage(PressureStage pressureStage);
	public List<PressureStage> getPressureStages();
	public boolean deletePressureStage(PressureStage pressureStage);
}
