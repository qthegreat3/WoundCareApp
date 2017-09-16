package com.harquin.common.exudate;

import java.util.List;

public interface IExudateDao {
	public boolean insertExudate(Exudate exudate);
	public List<Exudate> getExudates();
	public boolean deleteExudate(Exudate exudate);
}
