package com.harquin.common.monofilament;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface MonofilamentMapper extends IMyBatisMapperMarker{
	public void insertMonofilament(Monofilament monofilament);
	public List<Monofilament> getMonofilaments();
	public void deleteMonofilament(Monofilament monofilament);
}
