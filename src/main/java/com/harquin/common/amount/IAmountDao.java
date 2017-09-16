package com.harquin.common.amount;

import java.util.List;

public interface IAmountDao {
	public boolean insertAmount(Amount amount);
	public List<Amount> getAmounts();
	public boolean deleteAmount(Amount amount);
}
