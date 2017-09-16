package com.harquin.common.otherwoundtissue;

import java.util.List;

public interface IOtherWoundTissueDao {
	public boolean insertOtherWoundTissue(OtherWoundTissue otherWoundTissue);
	public List<OtherWoundTissue> getOtherWoundTissues();
	public boolean deleteOtherWoundTissue(OtherWoundTissue otherWoundTissue);
}
