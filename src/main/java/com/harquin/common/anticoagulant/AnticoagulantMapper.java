package com.harquin.common.anticoagulant;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface AnticoagulantMapper extends IMyBatisMapperMarker {
	public void insertAnticoagulant(Anticoagulant anticoagulant);
	public List<Anticoagulant> getAnticoagulants();
	public void deleteAnticoagulant(Anticoagulant anticoagulant);
}
