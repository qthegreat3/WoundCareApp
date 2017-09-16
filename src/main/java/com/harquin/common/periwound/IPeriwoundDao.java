package com.harquin.common.periwound;

import java.util.List;

public interface IPeriwoundDao {
	public boolean insertPeriwound(Periwound periwound);
	public List<Periwound> getPeriwounds();
	public boolean deletePeriwound(Periwound periwound);
}
