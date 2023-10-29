package com.springcore.javacofig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
	Student s1 = context.getBean("getStudent",Student.class);
	System.out.println(s1);
	s1.study();
     
	
   }
}
