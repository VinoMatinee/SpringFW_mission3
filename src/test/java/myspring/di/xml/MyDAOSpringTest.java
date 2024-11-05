package myspring.di.xml;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring_di.xml")
public class MyDAOSpringTest {
	@Autowired
	MyDAO myDAO;
	
	@Resource(name = "myDAOCons")
	MyDAO myDAO2;
	
	@Test
	void myDAOBean() {
		System.out.println(myDAO.myType());
		System.out.println(myDAO2.myType());
		assertEquals("DAO 히카리", myDAO2.myType());
		
		assertEquals("DAO 히카리 DataSouce Connected", myDAO2.connect());
		
	}
	
	
}
