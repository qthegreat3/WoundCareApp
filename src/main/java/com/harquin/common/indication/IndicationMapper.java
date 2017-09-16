package com.harquin.common.indication;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface IndicationMapper extends IMyBatisMapperMarker{
	public void insertIndication(Indication indication);
	public List<Indication> getIndications();
	public void deleteIndication(Indication indication);
}
