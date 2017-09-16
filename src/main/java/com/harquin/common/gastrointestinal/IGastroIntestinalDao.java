package com.harquin.common.gastrointestinal;

import java.util.List;

public interface IGastroIntestinalDao {
	public boolean insertGastroIntestinal(GastroIntestinal gastroIntestinal);
	public List<GastroIntestinal> getGastroIntestinals();
	public boolean deleteGastroIntestinal(GastroIntestinal gastroIntestinal);
}
