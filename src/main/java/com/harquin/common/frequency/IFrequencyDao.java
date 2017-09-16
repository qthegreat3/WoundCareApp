package com.harquin.common.frequency;

import java.util.List;

public interface IFrequencyDao {
	public boolean insertFrequency(Frequency frequency);
	public List<Frequency> getFrequencys();
	public boolean deleteFrequency(Frequency frequency);
}
