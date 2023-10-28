package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
	ApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
	Emp emp1 = context.getBean("Emp1",Emp.class);
	System.out.println(emp1);
	
  }
}
