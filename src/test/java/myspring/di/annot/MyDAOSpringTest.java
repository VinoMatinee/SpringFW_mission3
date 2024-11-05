package myspring.di.annot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.di.annot.MyDAOBean;
import myspring.di.annot.MyDAOBeanCons;

import static org.junit.jupiter.api.Assertions.*;

import javax.annotation.Resource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring_di.xml")
public class MyDAOSpringTest {
	@Autowired
	MyDAOBean myDAOBean;
	
	@Resource(name="myDAOBeanCons")
	MyDAOBeanCons myDAOBeanCons;
	
	@Test
	void myDAO() {
		System.out.println(myDAOBean.myType());
		assertEquals("DAO 베이직Bean", myDAOBean.myType());		
		assertEquals("DAO 베이직Bean DataSouce Connected", myDAOBean.connect());		
	}
	
	@Test
	void myDAOBean() {
		System.out.println(myDAOBeanCons.myType());
		assertEquals("DAO 히카리Bean", myDAOBeanCons.myType());		
		assertEquals("DAO 히카리Bean DataSouce Connected", myDAOBeanCons.connect());		
	}
	
	
}
