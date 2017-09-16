package com.harquin.common.physicalexamdescription;

import java.util.List;

public interface IPhysicalExamDescriptionDao {
	public boolean insertPhysicalExamDescription(PhysicalExamDescription physicalExamDescription);
	public List<PhysicalExamDescription> getPhysicalExamDescriptions();
	public boolean deletePhysicalExamDescription(PhysicalExamDescription physicalExamDescription);
}
