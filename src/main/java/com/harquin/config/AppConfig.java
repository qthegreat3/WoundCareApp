package com.harquin.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@PropertySource(value = { "classpath:app.properties" })
//@ComponentScan( "com.harquin.common" )

public class AppConfig {

	@Value( "${jdbc.driverClassName}" )
	private String driverClass;
	
	@Value ( "${jdbc.url}")
	private String jdbcUrl;
	
	@Value( "${jdbc.username}" )
	private String userName;
	
	@Value( "${jdbc.password}" )
	private String password;
	
	@Bean
	public DataSource dataSource() throws PropertyVetoException
	{
		ComboPooledDataSource source = new ComboPooledDataSource();
		
		source.setDriverClass(driverClass);
		source.setJdbcUrl(jdbcUrl);
		source.setUser(userName);
		source.setPassword(password);
		source.setMaxPoolSize(100);
		source.setMinPoolSize(10);
		
		return source;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception
	{
		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(dataSource);
		return factoryBean.getObject();
	}
}
