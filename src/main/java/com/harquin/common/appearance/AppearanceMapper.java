package com.harquin.common.appearance;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface AppearanceMapper extends IMyBatisMapperMarker {
	public void insertAppearance(Appearance appearance);
	public List<Appearance> getAppearances();
	public void deleteAppearance(Appearance appearance);
}
