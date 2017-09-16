package com.harquin.common.gender;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface GenderMapper extends IMyBatisMapperMarker{
	public void insertGender(Gender gender);
	public List<Gender> getGenders();
	public void deleteGender(Gender gender);
}
