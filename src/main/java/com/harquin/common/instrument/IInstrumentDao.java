package com.harquin.common.instrument;

import java.util.List;

public interface IInstrumentDao {
	public boolean insertInstrument(Instrument instrument);
	public List<Instrument> getInstruments();
	public boolean deleteInstrument(Instrument instrument);
}
