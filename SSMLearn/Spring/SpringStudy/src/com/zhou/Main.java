package com.zhou;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zhou.entity.Person;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-annotation.xml");

		Person person = context.getBean("person4", Person.class);

		System.out.println(person);
		
		context.close();
	}

}
