package com.harquin.common.pneumococcalvaccine;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface PneumococcalVaccineMapper extends IMyBatisMapperMarker{
	public void insertPneumococcalVaccine(PneumococcalVaccine pneumococcalVaccine);
	public List<PneumococcalVaccine> getPneumococcalVaccines();
	public void deletePneumococcalVaccine(PneumococcalVaccine pneumococcalVaccine);
}
