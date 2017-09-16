package com.harquin.common.anesthesia;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface AnesthesiaMapper extends IMyBatisMapperMarker {
	public void insertAnesthesia(Anesthesia anesthesia);
	public List<Anesthesia> getAnesthesias();
	public void deleteAnesthesia(Anesthesia anesthesia);
}
