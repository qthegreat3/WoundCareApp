package com.harquin.common.socialHistory;

import java.util.List;

public interface ISocialHistoryDao {
	public boolean insertSocialHistory(SocialHistory socialHistory);
	public List<SocialHistory> getSocialHistorys();
	public boolean deleteSocialHistory(SocialHistory socialHistory);
}
