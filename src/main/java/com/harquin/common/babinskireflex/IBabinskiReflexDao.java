package com.harquin.common.babinskireflex;

import java.util.List;

public interface IBabinskiReflexDao {
	public boolean insertBabinskiReflex(BabinskiReflex babinskiReflex);
	public List<BabinskiReflex> getBabinskiReflexs();
	public boolean deleteBabinskiReflex(BabinskiReflex babinskiReflex);
}
