package com.harquin.common.appearance;

import java.util.List;

public interface IAppearanceDao {
	public boolean insertAppearance(Appearance appearance);
	public List<Appearance> getAppearances();
	public boolean deleteAppearance(Appearance appearance);
}
