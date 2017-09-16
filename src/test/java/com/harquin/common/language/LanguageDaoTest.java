package com.harquin.common.language;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.harquin.config.TestAppConfig;

@ContextConfiguration(classes = {TestAppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class LanguageDaoTest {
	@Autowired
	ILanguageDao languageDao;
	
	@Test
	public void test()
	{
		Language language = new Language("testLanguage");
		
		languageDao.insertLanguage(language);
		
		List<Language> languageList = languageDao.getLanguages();
		
		assertTrue(language.getName().equalsIgnoreCase(languageList.get(0).getName()));
		
		languageDao.deleteLanguage(language);
		
		assertTrue(languageDao.getLanguages().isEmpty());
	}
	
	@Test
	public void testExceptions()
	{
		Language language = new Language("testLanguage");
		languageDao.insertLanguage(language);
		languageDao.insertLanguage(language);
		languageDao.deleteLanguage(language);
		languageDao.deleteLanguage(language);
	}
		
}
