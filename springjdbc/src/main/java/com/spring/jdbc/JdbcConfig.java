package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.dao.StudentDAOImpl;

@Configuration
//when we use annotations then we need to give package name of class in config file wgere we use annotation
@ComponentScan(basePackages={"com.spring.jdbc.dao"})
public class JdbcConfig {
	
	@Bean(name={"ds"})
	public DataSource getDataSource(){
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3305/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root1234");
		return ds;
	}
	
	@Bean(name={"jdbcTemplate"})
	public JdbcTemplate getTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	//we have use annotation for this therefore comment it
	/*@Bean(name={"studentDAO"})
	public StudentDAO getStudentDAO(){
		StudentDAOImpl studentDAO=new StudentDAOImpl();
		studentDAO.setJdbcTemplate(getTemplate());
		return studentDAO;
	}
	*/
	
	
	

}
