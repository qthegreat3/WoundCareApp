package com.harquin.common.pedalpulsedescription;

import java.util.List;

public interface IPedalPulseDescriptionDao {
	public boolean insertPedalPulseDescription(PedalPulseDescription pedalPulseDescription);
	public List<PedalPulseDescription> getPedalPulseDescriptions();
	public boolean deletePedalPulseDescription(PedalPulseDescription pedalPulseDescription);
}
