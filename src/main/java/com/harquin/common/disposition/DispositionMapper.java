package com.harquin.common.disposition;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface DispositionMapper extends IMyBatisMapperMarker {
	public void insertDisposition(Disposition disposition);
	public List<Disposition> getDispositions();
	public void deleteDisposition(Disposition disposition);
}
