package com.harquin.common.nodebridementreason;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface NoDebridementReasonMapper extends IMyBatisMapperMarker{
	public void insertNoDebridementReason(NoDebridementReason noDebridementReason);
	public List<NoDebridementReason> getNoDebridementReasons();
	public void deleteNoDebridementReason(NoDebridementReason noDebridementReason);
}
