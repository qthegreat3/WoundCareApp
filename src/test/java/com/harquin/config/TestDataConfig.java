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
}
