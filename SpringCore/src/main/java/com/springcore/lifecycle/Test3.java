package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleconfig.xml");
//		Samosa samosa = (Samosa) context.getBean("s1");
//		System.out.println(samosa);
		// Registring SutdownHook
		context.registerShutdownHook();

		System.out.println("___________________________________________________________");

//		Pepsi p1 = (Pepsi) context.getBean("p1");
//		System.out.println(p1);
		
		Example example = (Example)context.getBean("ex");
		System.out.println(example);
	}
}
