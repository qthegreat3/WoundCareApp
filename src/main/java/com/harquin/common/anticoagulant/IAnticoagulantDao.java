package com.harquin.common.anticoagulant;

import java.util.List;

public interface IAnticoagulantDao {
	public boolean insertAnticoagulant(Anticoagulant anticoagulant);
	public List<Anticoagulant> getAnticoagulants();
	public boolean deleteAnticoagulant(Anticoagulant anticoagulant);
}
