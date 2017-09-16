package com.harquin.common.ethnicity;

import java.util.List;

public interface IEthnicityDao {
	public boolean insertEthnicity(Ethnicity ethnicity);
	public List<Ethnicity> getEthnicitys();
	public boolean deleteEthnicity(Ethnicity ethnicity);
}
