package com.harquin.common.extremityotherdescription;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface ExtremityOtherDescriptionMapper extends IMyBatisMapperMarker {
	public void insertExtremityOtherDescription(ExtremityOtherDescription extremityOtherDescription);
	public List<ExtremityOtherDescription> getExtremityOtherDescriptions();
	public void deleteExtremityOtherDescription(ExtremityOtherDescription extremityOtherDescription);
}
