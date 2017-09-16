package com.harquin.common.edema;

import java.util.List;

public interface IEdemaDao {
	public boolean insertEdema(Edema edema);
	public List<Edema> getEdemas();
	public boolean deleteEdema(Edema edema);
}
