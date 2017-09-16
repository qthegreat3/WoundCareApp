package com.harquin.common.anesthesia;

import java.util.List;

public interface IAnesthesiaDao {
	public boolean insertAnesthesia(Anesthesia anesthesia);
	public List<Anesthesia> getAnesthesias();
	public boolean deleteAnesthesia(Anesthesia anesthesia);
}
