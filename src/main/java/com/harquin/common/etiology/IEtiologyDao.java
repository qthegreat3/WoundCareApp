package com.harquin.common.etiology;

import java.util.List;

public interface IEtiologyDao {
	public boolean insertEtiology(Etiology etiology);
	public List<Etiology> getEtiologys();
	public boolean deleteEtiology(Etiology etiology);
}
