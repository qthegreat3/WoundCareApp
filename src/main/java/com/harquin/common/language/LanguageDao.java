package com.harquin.common.language;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LanguageDao implements ILanguageDao{
	private static final Logger log = LoggerFactory.getLogger(LanguageDao.class);
	
	private SqlSessionFactory sqlSessionFactory;
	
	public LanguageDao (SqlSessionFactory sqlSessionFactory)
	{
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public boolean insertLanguage(Language Language) {
		try (SqlSession session = sqlSessionFactory.openSession();)
		{
			LanguageMapper mapper = session.getMapper(LanguageMapper.class);
			mapper.insertLanguage(Language);
		}
		catch (Exception e)
		{
			log.error("Exception Found in insertLanguage function of LanguageDao", e);
			return false;
		}
		
		return true;
	}

	@Override
	public List<Language> getLanguages() {
		List<Language> languageList = new ArrayList<>();
		
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			LanguageMapper mapper = session.getMapper(LanguageMapper.class);			
			languageList = mapper.getLanguages();
		}
		catch (Exception e)
		{
			log.error("Exception found in getLanguages in LanguageDao", e);
		}

		return languageList;
	}

	@Override
	public boolean deleteLanguage(Language language) {
		try(SqlSession session = sqlSessionFactory.openSession();)
		{
			LanguageMapper mapper = session.getMapper(LanguageMapper.class);
			mapper.deleteLanguage(language);
		}
		catch (Exception e)
		{
			log.error("Exception found in deleteLanguage in LanguageDao", e);
			return false;
		}
		
		return true;
	}

}
