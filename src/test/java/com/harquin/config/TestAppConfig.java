package com.harquin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = { "classpath:test.properties" })
@Import( TestDataConfig.class ) //includes another data config file
public class TestAppConfig {
    /**
     * PropertySourcesPlaceHolderConfigurer is required for @Value("{}")
     * annotations.
     */
	
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
