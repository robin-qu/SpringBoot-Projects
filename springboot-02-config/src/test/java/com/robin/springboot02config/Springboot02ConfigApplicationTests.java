package com.robin.springboot02config;

import com.robin.springboot02config.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Springboot02ConfigApplicationTests {
	@Autowired
	private Person person;

	@Autowired
	ApplicationContext ioc;

	@Test
	void testHelloService() {
		boolean res = ioc.containsBean("helloService1");
		System.out.println(res);
	}

	@Test
	void contextLoads() {
//		System.out.println(person.getName().getClass().getName());
//		System.out.println(person.getAge().getClass().getName());
//		System.out.println(person.getBoss() == null);
//		System.out.println(person.getBirth().getClass().getName());
//		System.out.println(person.getMap().getClass().getName());
//		System.out.println(person.getList().getClass().getName());
//		System.out.println(person.getDog().getClass().getName());
//		System.out.println(person.getList().get(0).getClass().getName());
		System.out.println(person);
	}

}
