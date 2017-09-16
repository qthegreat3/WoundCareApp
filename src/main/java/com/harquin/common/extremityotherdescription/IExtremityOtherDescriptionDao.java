package com.harquin.common.extremityotherdescription;

import java.util.List;

public interface IExtremityOtherDescriptionDao {
	public boolean insertExtremityOtherDescription(ExtremityOtherDescription extremityOtherDescription);
	public List<ExtremityOtherDescription> getExtremityOtherDescriptions();
	public boolean deleteExtremityOtherDescription(ExtremityOtherDescription extremityOtherDescription);
}
