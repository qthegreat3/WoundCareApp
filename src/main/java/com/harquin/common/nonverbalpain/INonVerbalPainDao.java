package com.harquin.common.nonverbalpain;

import java.util.List;

public interface INonVerbalPainDao {
	public boolean insertNonVerbalPain(NonVerbalPain nonVerbalPain);
	public List<NonVerbalPain> getNonVerbalPains();
	public boolean deleteNonVerbalPain(NonVerbalPain nonVerbalPain);
}
