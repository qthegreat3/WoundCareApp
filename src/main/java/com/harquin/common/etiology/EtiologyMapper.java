package com.harquin.common.etiology;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface EtiologyMapper extends IMyBatisMapperMarker {
	public void insertEtiology(Etiology etiology);
	public List<Etiology> getEtiologys();
	public void deleteEtiology(Etiology etiology);
}
