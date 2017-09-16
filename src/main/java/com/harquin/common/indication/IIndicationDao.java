package com.harquin.common.indication;

import java.util.List;

public interface IIndicationDao {
	public boolean insertIndication(Indication indication);
	public List<Indication> getIndications();
	public boolean deleteIndication(Indication indication);
}
