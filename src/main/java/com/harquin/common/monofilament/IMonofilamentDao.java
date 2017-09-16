package com.harquin.common.monofilament;

import java.util.List;

public interface IMonofilamentDao {
	public boolean insertMonofilament(Monofilament monofilament);
	public List<Monofilament> getMonofilaments();
	public boolean deleteMonofilament(Monofilament monofilament);
}
