package myspring.di.xml;

public class MyDAO {
	String type;
	MyDataSource dataSource;
	
	public MyDAO() {
		
	}
	
	public MyDAO(String type, MyDataSource dataSource) {
		this.type = type;
		this.dataSource = dataSource;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setMyDataSource(MyDataSource dataSource) {
		this.dataSource = dataSource;				
	}
	
	public String myType() {
		return "DAO " + type;
	}
	
	public String connect() {
		return this.dataSource.connect(myType());
	}

}
