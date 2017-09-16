package com.harquin.common.language;

import java.util.List;

public interface ILanguageDao {
	public boolean insertLanguage(Language language);
	public List<Language> getLanguages();
	public boolean deleteLanguage(Language language);
}
