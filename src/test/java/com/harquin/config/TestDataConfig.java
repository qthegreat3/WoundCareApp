package com.harquin.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.harquin.common.IMyBatisMapperMarker;
import com.harquin.common.allergy.AllergyDao;
import com.harquin.common.allergy.IAllergyDao;
import com.harquin.common.anticoagulant.AnticoagulantDao;
import com.harquin.common.anticoagulant.IAnticoagulantDao;
import com.harquin.common.appetite.AppetiteDao;
import com.harquin.common.appetite.IAppetiteDao;
import com.harquin.common.bed.BedDao;
import com.harquin.common.bed.IBedDao;
import com.harquin.common.chair.ChairDao;
import com.harquin.common.chair.IChairDao;
import com.harquin.common.ethnicity.EthnicityDao;
import com.harquin.common.ethnicity.IEthnicityDao;
import com.harquin.common.exudate.ExudateDao;
import com.harquin.common.exudate.IExudateDao;
import com.harquin.common.fallriskassessment.FallRiskAssessmentDao;
import com.harquin.common.fallriskassessment.IFallRiskAssessmentDao;
import com.harquin.common.familyhistory.FamilyHistoryDao;
import com.harquin.common.familyhistory.IFamilyHistoryDao;
import com.harquin.common.feet.FeetDao;
import com.harquin.common.feet.IFeetDao;
import com.harquin.common.followuprange.FollowUpRangeDao;
import com.harquin.common.followuprange.IFollowUpRangeDao;
import com.harquin.common.foottemperature.FootTemperatureDao;
import com.harquin.common.foottemperature.IFootTemperatureDao;
import com.harquin.common.frequency.FrequencyDao;
import com.harquin.common.frequency.IFrequencyDao;
import com.harquin.common.gastrointestinal.GastroIntestinalDao;
import com.harquin.common.gastrointestinal.IGastroIntestinalDao;
import com.harquin.common.gender.GenderDao;
import com.harquin.common.gender.IGenderDao;
import com.harquin.common.indication.IIndicationDao;
import com.harquin.common.indication.IndicationDao;
import com.harquin.common.inflammatory.IInflammatoryDao;
import com.harquin.common.inflammatory.InflammatoryDao;
import com.harquin.common.instrument.IInstrumentDao;
import com.harquin.common.instrument.InstrumentDao;
import com.harquin.common.language.ILanguageDao;
import com.harquin.common.language.LanguageDao;
import com.harquin.common.location.ILocationDao;
import com.harquin.common.location.LocationDao;
import com.harquin.common.monofilament.IMonofilamentDao;
import com.harquin.common.monofilament.MonofilamentDao;
import com.harquin.common.mood.IMoodDao;
import com.harquin.common.mood.MoodDao;
import com.harquin.common.musculoskeletal.IMusculoskeletalDao;
import com.harquin.common.musculoskeletal.MusculoskeletalDao;
import com.harquin.common.nodebridementreason.INoDebridementReasonDao;
import com.harquin.common.nodebridementreason.NoDebridementReasonDao;
import com.harquin.common.nonverbalpain.INonVerbalPainDao;
import com.harquin.common.nonverbalpain.NonVerbalPainDao;
import com.harquin.common.orientation.IOrientationDao;
import com.harquin.common.orientation.OrientationDao;
import com.harquin.common.otherwoundtissue.IOtherWoundTissueDao;
import com.harquin.common.otherwoundtissue.OtherWoundTissueDao;
import com.harquin.common.pastmedicalhistory.IPastMedicalHistoryDao;
import com.harquin.common.pastmedicalhistory.PastMedicalHistoryDao;
import com.harquin.common.patient.IPatientDao;
import com.harquin.common.patient.IPatientDescriptionDao;
import com.harquin.common.patient.PatientDao;
import com.harquin.common.patient.PatientDescriptionDao;
import com.harquin.common.pedalpulsedescription.IPedalPulseDescriptionDao;
import com.harquin.common.pedalpulsedescription.PedalPulseDescriptionDao;
import com.harquin.common.periwound.IPeriwoundDao;
import com.harquin.common.periwound.PeriwoundDao;
import com.harquin.common.physicalexamdescription.IPhysicalExamDescriptionDao;
import com.harquin.common.physicalexamdescription.PhysicalExamDescriptionDao;
import com.harquin.common.pneumococcalvaccine.IPneumococcalVaccineDao;
import com.harquin.common.pneumococcalvaccine.PneumococcalVaccineDao;
import com.harquin.common.pressurestage.IPressureStageDao;
import com.harquin.common.pressurestage.PressureStageDao;
import com.harquin.common.race.IRaceDao;
import com.harquin.common.race.RaceDao;
import com.harquin.common.recommendation.IRecommendationDao;
import com.harquin.common.recommendation.RecommendationDao;
import com.harquin.common.riskbenefit.IRiskBenefitDao;
import com.harquin.common.riskbenefit.RiskBenefitDao;
import com.harquin.common.socialHistory.ISocialHistoryDao;
import com.harquin.common.socialHistory.SocialHistoryDao;
import com.harquin.common.sourceofhistory.ISourceOfHistoryDao;
import com.harquin.common.sourceofhistory.SourceOfHistoryDao;
import com.harquin.common.supplment.ISupplmentDao;
import com.harquin.common.supplment.SupplmentDao;
import com.harquin.common.testprogress.ITestProgressDao;
import com.harquin.common.testprogress.TestProgressDao;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource(value = { "classpath:test.properties" })
@MapperScan( value = "com.harquin.common", markerInterface = IMyBatisMapperMarker.class )
public class TestDataConfig {
	@Value( "${jdbc.driverClassName}" )
	private String driverClass;
	
	@Value ( "${jdbc.url}")
	private String jdbcUrl;
	
	@Value( "${jdbc.username}" )
	private String userName;
	
	@Value( "${jdbc.password}" )
	private String password;
	
    /**
     * PropertySourcesPlaceHolderConfigurer is required for @Value("{}")
     * annotations.
     */
	
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	@Bean
	public DataSource dataSource() throws Exception
	{
		ComboPooledDataSource source = new ComboPooledDataSource();
		
		source.setDriverClass(driverClass);
		source.setJdbcUrl(jdbcUrl);
		source.setUser(userName);
		source.setPassword(password);
		source.setMaxPoolSize(100);
		source.setMinPoolSize(3);
		
		return source;
	}
	
	@Bean
	public DataSourceTransactionManager transactionManager() throws Exception
	{
		DataSourceTransactionManager manager = new DataSourceTransactionManager(dataSource());
		
		return manager;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception
	{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource());
		return factoryBean.getObject();
	}
	
	@Bean
	public IAllergyDao allergyDao() throws Exception
	{
		IAllergyDao allergyDao = new AllergyDao(sqlSessionFactory());
		
		return allergyDao;
	}

	@Bean
	public IExudateDao exudateDao() throws Exception
	{
		IExudateDao exudateDao = new ExudateDao(sqlSessionFactory());
		
		 return exudateDao;
	}
	@Bean
	public IFamilyHistoryDao familyHistoryDao() throws Exception
	{
		IFamilyHistoryDao familyHistoryDao = new FamilyHistoryDao(sqlSessionFactory());
		
		 return familyHistoryDao;
	}
	@Bean
	public IFollowUpRangeDao followUpRangeDao() throws Exception
	{
		IFollowUpRangeDao followUpRangeDao = new FollowUpRangeDao(sqlSessionFactory());
		
		 return followUpRangeDao;
	}
	@Bean
	public IFootTemperatureDao footTemperatureDao() throws Exception
	{
		IFootTemperatureDao footTemperatureDao = new FootTemperatureDao(sqlSessionFactory());
		
		 return footTemperatureDao;
	}
	@Bean
	public IFrequencyDao frequencyDao() throws Exception
	{
		IFrequencyDao frequencyDao = new FrequencyDao(sqlSessionFactory());
		
		 return frequencyDao;
	}
	@Bean
	public IGenderDao genderDao() throws Exception
	{
		IGenderDao genderDao = new GenderDao(sqlSessionFactory());
		
		 return genderDao;
	}
	@Bean
	public IIndicationDao indicationDao() throws Exception
	{
		IIndicationDao indicationDao = new IndicationDao(sqlSessionFactory());
		
		 return indicationDao;
	}
	@Bean
	public IInflammatoryDao inflammatoryDao() throws Exception
	{
		IInflammatoryDao inflammatoryDao = new InflammatoryDao(sqlSessionFactory());
		
		 return inflammatoryDao;
	}
	@Bean
	public IInstrumentDao instrumentDao() throws Exception
	{
		IInstrumentDao instrumentDao = new InstrumentDao(sqlSessionFactory());
		
		 return instrumentDao;
	}
	@Bean
	public ILanguageDao languageDao() throws Exception
	{
		ILanguageDao languageDao = new LanguageDao(sqlSessionFactory());
		
		 return languageDao;
	}
	@Bean
	public IMonofilamentDao monofilamentDao() throws Exception
	{
		IMonofilamentDao monofilamentDao = new MonofilamentDao(sqlSessionFactory());
		
		 return monofilamentDao;
	}
	@Bean
	public IMoodDao moodDao() throws Exception
	{
		IMoodDao moodDao = new MoodDao(sqlSessionFactory());
		
		 return moodDao;
	}
	@Bean
	public IMusculoskeletalDao musculoskeletalDao() throws Exception
	{
		IMusculoskeletalDao musculoskeletalDao = new MusculoskeletalDao(sqlSessionFactory());
		
		 return musculoskeletalDao;
	}
	@Bean
	public INonVerbalPainDao nonVerbalPainDao() throws Exception
	{
		INonVerbalPainDao nonVerbalPainDao = new NonVerbalPainDao(sqlSessionFactory());
		
		 return nonVerbalPainDao;
	}
	@Bean
	public INoDebridementReasonDao noDebridementReasonDao() throws Exception
	{
		INoDebridementReasonDao noDebridementReasonDao = new NoDebridementReasonDao(sqlSessionFactory());
		
		 return noDebridementReasonDao;
	}
	@Bean
	public IOrientationDao orientationDao() throws Exception
	{
		IOrientationDao orientationDao = new OrientationDao(sqlSessionFactory());
		
		 return orientationDao;
	}
	@Bean
	public IOtherWoundTissueDao otherWoundTissueDao() throws Exception
	{
		IOtherWoundTissueDao otherWoundTissueDao = new OtherWoundTissueDao(sqlSessionFactory());
		
		 return otherWoundTissueDao;
	}
	@Bean
	public IPastMedicalHistoryDao pastMedicalHistoryDao() throws Exception
	{
		IPastMedicalHistoryDao pastMedicalHistoryDao = new PastMedicalHistoryDao(sqlSessionFactory());
		
		 return pastMedicalHistoryDao;
	}
	@Bean
	public IPedalPulseDescriptionDao pedalPulseDescriptionDao() throws Exception
	{
		IPedalPulseDescriptionDao pedalPulseDescriptionDao = new PedalPulseDescriptionDao(sqlSessionFactory());
		
		 return pedalPulseDescriptionDao;
	}
	@Bean
	public IPeriwoundDao periwoundDao() throws Exception
	{
		IPeriwoundDao periwoundDao = new PeriwoundDao(sqlSessionFactory());
		
		 return periwoundDao;
	}
	@Bean
	public IPhysicalExamDescriptionDao physicalExamDescriptionDao() throws Exception
	{
		IPhysicalExamDescriptionDao physicalExamDescriptionDao = new PhysicalExamDescriptionDao(sqlSessionFactory());
		
		 return physicalExamDescriptionDao;
	}
	@Bean
	public IPneumococcalVaccineDao pneumococcalVaccineDao() throws Exception
	{
		IPneumococcalVaccineDao pneumococcalVaccineDao = new PneumococcalVaccineDao(sqlSessionFactory());
		
		 return pneumococcalVaccineDao;
	}
	@Bean
	public IPressureStageDao pressureStageDao() throws Exception
	{
		IPressureStageDao pressureStageDao = new PressureStageDao(sqlSessionFactory());
		
		 return pressureStageDao;
	}
	@Bean
	public IRaceDao raceDao() throws Exception
	{
		IRaceDao raceDao = new RaceDao(sqlSessionFactory());
		
		 return raceDao;
	}
	@Bean
	public IRecommendationDao recommendationDao() throws Exception
	{
		IRecommendationDao recommendationDao = new RecommendationDao(sqlSessionFactory());
		
		 return recommendationDao;
	}
	@Bean
	public IRiskBenefitDao riskBenefitDao() throws Exception
	{
		IRiskBenefitDao riskBenefitDao = new RiskBenefitDao(sqlSessionFactory());
		
		 return riskBenefitDao;
	}
	@Bean
	public ISocialHistoryDao socialHistoryDao() throws Exception
	{
		ISocialHistoryDao socialHistoryDao = new SocialHistoryDao(sqlSessionFactory());
		
		 return socialHistoryDao;
	}
	@Bean
	public ISourceOfHistoryDao sourceOfHistoryDao() throws Exception
	{
		ISourceOfHistoryDao sourceOfHistoryDao = new SourceOfHistoryDao(sqlSessionFactory());
		
		 return sourceOfHistoryDao;
	}
	@Bean
	public ISupplmentDao supplmentDao() throws Exception
	{
		ISupplmentDao supplmentDao = new SupplmentDao(sqlSessionFactory());
		
		 return supplmentDao;
	}
	@Bean
	public ITestProgressDao testProgressDao() throws Exception
	{
		ITestProgressDao testProgressDao = new TestProgressDao(sqlSessionFactory());
		
		 return testProgressDao;
	}
	
	@Bean
	public IFallRiskAssessmentDao fallRiskAssessmentDao() throws Exception
	{
		IFallRiskAssessmentDao fallRiskAssessmentDao = new FallRiskAssessmentDao(sqlSessionFactory());
		
		 return fallRiskAssessmentDao;
	}
	
	@Bean
	public IPatientDao patientDao() throws Exception
	{
		IPatientDao patientDao = new PatientDao(sqlSessionFactory());
		
		return patientDao;
	}
	
	@Bean
	public ILocationDao locationDao() throws Exception
	{
		ILocationDao locationDao = new LocationDao(sqlSessionFactory());
		
		return locationDao;
	}
	
	@Bean
	public IPatientDescriptionDao patientDescriptionDao() throws Exception
	{
		IPatientDescriptionDao patientDescriptionDao = new PatientDescriptionDao(sqlSessionFactory());
		
		return patientDescriptionDao;
	}
	
	@Bean
	public IEthnicityDao ethnicityDao() throws Exception
	{
		IEthnicityDao ethnicityDao = new EthnicityDao(sqlSessionFactory());
		
		return ethnicityDao;
	}
	
	@Bean
	public IGastroIntestinalDao gastroIntestinalDao() throws Exception
	{
		IGastroIntestinalDao gastroIntestinalDao = new GastroIntestinalDao(sqlSessionFactory());
		
		return gastroIntestinalDao;
	}
	
	@Bean
	public IAppetiteDao appetiteDao() throws Exception
	{
		IAppetiteDao appetiteDao = new AppetiteDao(sqlSessionFactory());
		
		return appetiteDao;
	}
	
	@Bean
	public IBedDao bedDao() throws Exception
	{
		IBedDao bedDao = new BedDao(sqlSessionFactory());
		
		return bedDao;
	}

	@Bean
	public IChairDao chairDao() throws Exception
	{
		IChairDao chairDao = new ChairDao(sqlSessionFactory());
		
		return chairDao;
	}
	
	@Bean
	public IFeetDao feetDao() throws Exception
	{
		IFeetDao feetDao = new FeetDao(sqlSessionFactory());
		
		return feetDao;
	}
	
	@Bean
	public IAnticoagulantDao anticoagulantDao() throws Exception
	{
		IAnticoagulantDao anticoagulantDao = new AnticoagulantDao(sqlSessionFactory());
		
		return anticoagulantDao;
	}	
}