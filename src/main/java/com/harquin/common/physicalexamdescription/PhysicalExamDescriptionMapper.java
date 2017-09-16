package com.harquin.common.physicalexamdescription;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface PhysicalExamDescriptionMapper extends IMyBatisMapperMarker{
	public void insertPhysicalExamDescription(PhysicalExamDescription physicalExamDescription);
	public List<PhysicalExamDescription> getPhysicalExamDescriptions();
	public void deletePhysicalExamDescription(PhysicalExamDescription physicalExamDescription);
}
