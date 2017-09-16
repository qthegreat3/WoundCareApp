package com.harquin.common.blister;

import java.util.List;

public interface IBlisterDao {
	public boolean insertBlister(Blister blister);
	public List<Blister> getBlisters();
	public boolean deleteBlister(Blister blister);
}
