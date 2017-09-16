package com.harquin.common.musculoskeletal;

import java.util.List;

public interface IMusculoskeletalDao {
	public boolean insertMusculoskeletal(Musculoskeletal musculoskeletal);
	public List<Musculoskeletal> getMusculoskeletals();
	public boolean deleteMusculoskeletal(Musculoskeletal musculoskeletal);
}
