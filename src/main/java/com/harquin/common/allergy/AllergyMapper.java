package com.harquin.common.allergy;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface AllergyMapper extends IMyBatisMapperMarker{
	public void insertAllergy(Allergy allergy);
	public List<Allergy> getAllergies();
	public void deleteAllergy(Allergy allergy);
}
