package myspring.di.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myDAOBean")
public class MyDAOBean {
	@Value("${mynameAnnot1}")
	String type;
	
	@Autowired
	@Qualifier("basicDataSourceBean")
	MyDataSourceBean dataSource;
	
	public MyDAOBean() {
		
	}
	
	public MyDAOBean(String type, MyDataSourceBean dataSource) {
		this.type = type;
		this.dataSource = dataSource;
	}
	
//	public void setType(String type) {
//		this.type = type;
//	}
//	
//	public void setMyDataSource(MyDataSource dataSource) {
//		this.dataSource = dataSource;				
//	}
	
	public String myType() {
		return "DAO " + type;
	}
	
	public String connect() {
		return this.dataSource.connect(myType());
	}

}
