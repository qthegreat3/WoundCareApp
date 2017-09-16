package com.harquin.common.musculoskeletal;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface MusculoskeletalMapper extends IMyBatisMapperMarker{
	public void insertMusculoskeletal(Musculoskeletal musculoskeletal);
	public List<Musculoskeletal> getMusculoskeletals();
	public void deleteMusculoskeletal(Musculoskeletal musculoskeletal);
}
