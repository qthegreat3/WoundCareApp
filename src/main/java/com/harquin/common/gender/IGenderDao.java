package com.harquin.common.gender;

import java.util.List;

public interface IGenderDao {
	public boolean insertGender(Gender gender);
	public List<Gender> getGenders();
	public boolean deleteGender(Gender gender);
}
