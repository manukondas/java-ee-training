package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.spring.jdbc")
public class AppConfiguration {
	
	
	
	
	@Bean
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource("jdbc:mysql://localhost:3306/exampledb", "root", "password");
		
		return dataSource;
		
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		
		return new JdbcTemplate(getDataSource());
	}
	
}


