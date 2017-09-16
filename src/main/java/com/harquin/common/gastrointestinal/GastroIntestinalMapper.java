package com.harquin.common.gastrointestinal;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface GastroIntestinalMapper extends IMyBatisMapperMarker {
	public void insertGastroIntestinal(GastroIntestinal gastroIntestinal);
	public List<GastroIntestinal> getGastroIntestinals();
	public void deleteGastroIntestinal(GastroIntestinal gastroIntestinal);
}
