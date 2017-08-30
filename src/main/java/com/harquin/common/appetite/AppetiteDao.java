package com.harquin.common.appetite;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class AppetiteDao implements IAppetiteDao{
	
	private SqlSessionFactory sqlSessionFactory;
	
	public AppetiteDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public void insertAppetite(Appetite appetite) {
		SqlSession session = sqlSessionFactory.openSession();
		AppetiteMapper mapper = session.getMapper(AppetiteMapper.class);
		
		
		session.close();
	}

	@Override
	public List<Appetite> getAppetites() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAppetite(Appetite appetite) {
		// TODO Auto-generated method stub
		
	}

}
