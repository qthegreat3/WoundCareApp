package com.harquin.common.cauterizationoptions;

import java.util.List;

public interface ICauterizationOptionDao {
	public boolean insertCauterizationOption(CauterizationOption cauterizationOption);
	public List<CauterizationOption> getCauterizationOptions();
	public boolean deleteCauterizationOption(CauterizationOption cauterizationOption);
}
