package com.harquin.common.otherwoundtissue;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface OtherWoundTissueMapper extends IMyBatisMapperMarker{
	public void insertOtherWoundTissue(OtherWoundTissue otherWoundTissue);
	public List<OtherWoundTissue> getOtherWoundTissues();
	public void deleteOtherWoundTissue(OtherWoundTissue otherWoundTissue);
}
