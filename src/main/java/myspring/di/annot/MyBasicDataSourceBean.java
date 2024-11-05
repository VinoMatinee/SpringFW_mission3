package myspring.di.annot;

import org.springframework.stereotype.Component;

@Component("basicDataSourceBean")
public class MyBasicDataSourceBean implements MyDataSourceBean {

	@Override
	public String connect(String type) {
		return type + " DataSouce Connected";
	}

}
