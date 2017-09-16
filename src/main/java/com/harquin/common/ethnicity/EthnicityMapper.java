package com.harquin.common.ethnicity;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface EthnicityMapper extends IMyBatisMapperMarker {
	public void insertEthnicity(Ethnicity Ethnicity);
	public List<Ethnicity> getEthnicitys();
	public void deleteEthnicity(Ethnicity Ethnicity);
}
