package myspring.di.annot.config;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import myspring.di.annot.MyDAOBean;
import myspring.di.annot.MyDAOBeanCons;
import myspring.di.annot.config.MyDAOBeanConfig;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MyDAOBeanConfig.class, 
                      loader = AnnotationConfigContextLoader.class)

public class MyDAOBeanConfigTest {
	@Autowired
	MyDAOBean myBean;
	
	@Autowired
	MyDAOBeanCons myBeanCons;
	
	@Test
	void helloConfig() {
		assertEquals("DAO 베이직Bean", myBean.myType());		
		assertEquals("DAO 베이직Bean DataSouce Connected", myBean.connect());		

	}
	
	@Test
	void helloConsConfig() {
		assertEquals("DAO 히카리Bean", myBeanCons.myType());		
		assertEquals("DAO 히카리Bean DataSouce Connected", myBeanCons.connect());		

	}
}
