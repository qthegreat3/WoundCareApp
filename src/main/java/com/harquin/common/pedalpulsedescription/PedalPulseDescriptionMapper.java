package com.harquin.common.pedalpulsedescription;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface PedalPulseDescriptionMapper extends IMyBatisMapperMarker{
	public void insertPedalPulseDescription(PedalPulseDescription pedalPulseDescription);
	public List<PedalPulseDescription> getPedalPulseDescriptions();
	public void deletePedalPulseDescription(PedalPulseDescription pedalPulseDescription);
}
