package myspring.di.xml.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import myspring.di.xml.MyBasicDataSource;
import myspring.di.xml.MyDAO;
import myspring.di.xml.MyDataSource;
import myspring.di.xml.MyHikariDataSource;

@Configuration
@PropertySource(value = "classpath:values.properties")
public class MyDAOConfig {
	@Autowired
	Environment environment;
	
	@Bean
	public MyDataSource basicDataSource() {
		return new MyBasicDataSource();
	}
	
	@Bean
	//method name이 Bean의 id가 된다.
	public MyDataSource hikari() {
		return new MyHikariDataSource();
	}
	
	@Bean //alt + shift + l(엘)
	public MyDAO myDAO() {
		MyDAO dao = new MyDAO();
		dao.setType(environment.getProperty("myNameConfig"));
		dao.setMyDataSource(hikari());
		return dao;
	}
	
}
