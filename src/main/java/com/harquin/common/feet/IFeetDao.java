package com.harquin.common.feet;

import java.util.List;

public interface IFeetDao {
	public boolean insertFeet(Feet feet);
	public List<Feet> getFeets();
	public boolean deleteFeet(Feet feet);
}
