package com.harquin.common.nodebridementreason;

import java.util.List;

public interface INoDebridementReasonDao {
	public boolean insertNoDebridementReason(NoDebridementReason noDebridementReason);
	public List<NoDebridementReason> getNoDebridementReasons();
	public boolean deleteNoDebridementReason(NoDebridementReason noDebridementReason);
}
