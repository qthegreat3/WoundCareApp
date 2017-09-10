package com.harquin.common.allergy;

import java.util.List;

public interface IAllergyDao {
	public boolean insertAllergy(Allergy allergy);
	public List<Allergy> getAllergies();
	public boolean deleteAllergy(Allergy allergy);
}
