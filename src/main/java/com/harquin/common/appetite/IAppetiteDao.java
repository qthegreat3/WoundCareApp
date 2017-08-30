package com.harquin.common.appetite;

import java.util.List;


public interface IAppetiteDao {
	public void insertAppetite(Appetite appetite);
	public List<Appetite> getAppetites();
	public void deleteAppetite(Appetite appetite);
}
