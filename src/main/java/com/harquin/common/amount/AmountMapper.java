package com.harquin.common.amount;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface AmountMapper extends IMyBatisMapperMarker{
	public void insertAmount(Amount amount);
	public List<Amount> getAmounts();
	public void deleteAmount(Amount amount);
}
