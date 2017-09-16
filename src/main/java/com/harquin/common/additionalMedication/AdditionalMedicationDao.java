package com.harquin.common.additionalMedication;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AdditionalMedicationDao implements IAdditionalMedicationDao {
private static final Logger log = LoggerFactory.getLogger(AdditionalMedicationDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AdditionalMedicationDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertAdditionalMedication(AdditionalMedication additionalMedication) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			AdditionalMedicationMapper mapper = session.getMapper(AdditionalMedicationMapper.class);
			mapper.insertAdditionalMedication(additionalMedication);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertAdditionalMedication function of AdditionalMedicationDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<AdditionalMedication> getAdditionalMedications() {
		List<AdditionalMedication> additionalMedicationList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AdditionalMedicationMapper mapper = session.getMapper(AdditionalMedicationMapper.class);			
			additionalMedicationList = mapper.getAdditionalMedications();
		}
		catch (Exception e)
		{
			log.error("Exception found in getAdditionalMedications in AdditionalMedicationDao", e);
		}

		return additionalMedicationList;
	}

	@Override
	public boolean deleteAdditionalMedication(AdditionalMedication additionalMedication) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AdditionalMedicationMapper mapper = session.getMapper(AdditionalMedicationMapper.class);
			mapper.deleteAdditionalMedication(additionalMedication);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteAdditionalMedication in AdditionalMedicationDao", e);
			return false;
		}
		
		return true;
	}

}
