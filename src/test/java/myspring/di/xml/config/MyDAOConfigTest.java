package myspring.di.xml.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.di.xml.MyDAO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MyDAOConfig.class)
public class MyDAOConfigTest {
	@Autowired
	MyDAO myDAO;
		
	@Test
	void myDAOBean() {
		System.out.println(myDAO.myType());
		assertEquals("DAO Basic", myDAO.myType());
		
		assertEquals("DAO Basic DataSouce Connected", myDAO.connect());
		
	}
}
