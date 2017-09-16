package com.harquin.common.instrument;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface InstrumentMapper extends IMyBatisMapperMarker{
	public void insertInstrument(Instrument instrument);
	public List<Instrument> getInstruments();
	public void deleteInstrument(Instrument instrument);
}
