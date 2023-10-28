package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
	public static void main(String[] args) {
 	ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collection/scconfig.xml");
 	Person person = context.getBean("person1" , Person.class);
 	System.out.println(person);
 	System.out.println(person.getFriends().getClass().getName());
 	System.out.println("_______________________________________________");
 	System.out.println(person.getFeestructure());
 	System.out.println(person.getFeestructure().getClass().getName());
 	System.out.println("_______________________________________________");
 	System.out.println(person.getProperties());
 	System.out.println(person.getProperties().getClass().getName());
 	
 	
	}
}
