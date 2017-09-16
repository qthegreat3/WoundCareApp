package com.harquin.common.disposition;

import java.util.List;

public interface IDispositionDao {
	public boolean insertDisposition(Disposition disposition);
	public List<Disposition> getDispositions();
	public boolean deleteDisposition(Disposition disposition);
}
