package com.harquin.common.amount;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AmountDao implements IAmountDao {
private static final Logger log = LoggerFactory.getLogger(AmountDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AmountDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertAmount(Amount amount) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			AmountMapper mapper = session.getMapper(AmountMapper.class);
			mapper.insertAmount(amount);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertAmount function of AmountDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Amount> getAmounts() {
		List<Amount> amountList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AmountMapper mapper = session.getMapper(AmountMapper.class);			
			amountList = mapper.getAmounts();
		}
		catch (Exception e)
		{
			log.error("Exception found in getAmounts in AmountDao", e);
		}

		return amountList;
	}

	@Override
	public boolean deleteAmount(Amount amount) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			AmountMapper mapper = session.getMapper(AmountMapper.class);
			mapper.deleteAmount(amount);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteAmount in AmountDao", e);
			return false;
		}
		
		return true;
	}
}
