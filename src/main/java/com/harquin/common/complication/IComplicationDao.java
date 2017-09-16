package com.harquin.common.complication;

import java.util.List;

public interface IComplicationDao {
	public boolean insertComplication(Complication complication);
	public List<Complication> getComplications();
	public boolean deleteComplication(Complication complication);
}
