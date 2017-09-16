package com.harquin.common.inflammatory;

import java.util.List;

public interface IInflammatoryDao {
	public boolean insertInflammatory(Inflammatory inflammatory);
	public List<Inflammatory> getInflammatorys();
	public boolean deleteInflammatory(Inflammatory inflammatory);
}
