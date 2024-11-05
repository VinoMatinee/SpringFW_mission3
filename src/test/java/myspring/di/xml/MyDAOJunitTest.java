package myspring.di.xml;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MyDAOJunitTest {
	ApplicationContext container;
	
	@BeforeEach
	void setup() {
		//1. Container Object 생성
		container = new GenericXmlApplicationContext("classpath:spring_di.xml"); 		
	}

	@Test
	void myDAOBean() {	
		//2. Container에게 Hello SpringBean 요청하기
		MyDAO myDAO1 = (MyDAO)container.getBean("myDAO");
		MyDAO myDAO2 = container.getBean("myDAO", MyDAO.class);
		System.out.println(myDAO1 == myDAO2);
		//SpringBean의 주소 비교 - assertSame()
		assertSame(myDAO1, myDAO2);
		//setName setter injection 체크
		assertEquals("DAO 베이직", myDAO2.myType());
		//setPrinter setter injection 체크
		assertEquals("DAO 베이직 DataSouce Connected", myDAO2.connect());
		
	}
}
