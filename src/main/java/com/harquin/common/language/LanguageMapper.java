package com.harquin.common.language;

import java.util.List;

import com.harquin.common.IMyBatisMapperMarker;

public interface LanguageMapper extends IMyBatisMapperMarker{
	public void insertLanguage(Language language);
	public List<Language> getLanguages();
	public void deleteLanguage(Language language);
}
