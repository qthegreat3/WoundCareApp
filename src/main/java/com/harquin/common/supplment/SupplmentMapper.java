package com.harquin.common.supplment;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface SupplmentMapper extends IMyBatisMapperMarker{
	public void insertSupplment(Supplment supplment);
	public List<Supplment> getSupplments();
	public void deleteSupplment(Supplment supplment);
}
