package com.harquin.common.appetite;

import java.util.List;


public interface IAppetiteDao {
	public boolean insertAppetite(Appetite appetite);
	public List<Appetite> getAppetites();
	public boolean deleteAppetite(Appetite appetite);
}
