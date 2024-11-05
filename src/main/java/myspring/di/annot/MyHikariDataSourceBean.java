package myspring.di.annot;

import org.springframework.stereotype.Component;

@Component("hikariDataSourceBean")
public class MyHikariDataSourceBean implements MyDataSourceBean {

	@Override
	public String connect(String type) {
		return type + " DataSouce Connected";
	}

}
