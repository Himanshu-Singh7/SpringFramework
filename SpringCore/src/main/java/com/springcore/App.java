package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       System.out.println("Hello word");
       ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
       Student student1 = (Student) context.getBean("student1");
       System.out.println(student1);
    }
}
