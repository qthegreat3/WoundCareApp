package com.harquin.common.socialHistory;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface SocialHistoryMapper extends IMyBatisMapperMarker{
	public void insertSocialHistory(SocialHistory socialHistory);
	public List<SocialHistory> getSocialHistorys();
	public void deleteSocialHistory(SocialHistory socialHistory);
}
