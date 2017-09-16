package com.harquin.common.pneumococcalvaccine;

import java.util.List;

public interface IPneumococcalVaccineDao {
	public boolean insertPneumococcalVaccine(PneumococcalVaccine pneumococcalVaccine);
	public List<PneumococcalVaccine> getPneumococcalVaccines();
	public boolean deletePneumococcalVaccine(PneumococcalVaccine pneumococcalVaccine);
}
