package com.harquin.common.babinskireflex;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface BabinskiReflexMapper extends IMyBatisMapperMarker {
	public void insertBabinskiReflex(BabinskiReflex babinskiReflex);
	public List<BabinskiReflex> getBabinskiReflexs();
	public void deleteBabinskiReflex(BabinskiReflex babinskiReflex);
}
