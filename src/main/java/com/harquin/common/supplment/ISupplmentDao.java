package com.harquin.common.supplment;

import java.util.List;

public interface ISupplmentDao {
	public boolean insertSupplment(Supplment supplment);
	public List<Supplment> getSupplments();
	public boolean deleteSupplment(Supplment supplment);
}
