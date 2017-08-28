package com.harquin.common.allergy;

import java.util.List;

public interface IAllergyDao {
	public void insertAllergy(Allergy allergy);
	public List<Allergy> getAllergies();
	public void deleteAllergy(Allergy allergy);
}
