package com.harquin.common.cauterizationoptions;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface CauterizationOptionMapper extends IMyBatisMapperMarker {
	public void insertCauterizationOption(CauterizationOption cauterizationOption);
	public List<CauterizationOption> getCauterizationOptions();
	public void deleteCauterizationOption(CauterizationOption cauterizationOption);
}
