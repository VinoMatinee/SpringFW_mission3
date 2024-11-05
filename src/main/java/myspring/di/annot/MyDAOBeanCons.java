package myspring.di.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myDAOBeanCons")
public class MyDAOBeanCons {
	String type;
	MyDataSourceBean dataSource;
	
	@Autowired
	public MyDAOBeanCons(@Value("${mynameAnnot2}") String type, 
					 @Qualifier("hikariDataSourceBean") MyDataSourceBean dataSource) {
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
